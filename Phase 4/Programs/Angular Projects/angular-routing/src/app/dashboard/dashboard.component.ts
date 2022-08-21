import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  emailid:string ="";
  constructor(public router:Router) { }

  ngOnInit(): void {
      let obj = sessionStorage.getItem("user");       // session.getAttribute("user");
      if(obj!=null){
        this.emailid=obj;
      }
  }


  logout(){
      sessionStorage.removeItem("user");      // remove the name from sessionStorage 
      this.router.navigate(["login"]);
  }
}
