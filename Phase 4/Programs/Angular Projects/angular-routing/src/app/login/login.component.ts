import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  msg:string ="";

  // it provide method to nagivate with programmatically. 
  constructor(public router:Router) { } // DI for Router API 

  ngOnInit(): void {
  }

  checkUser(loginRef:NgForm){
   
    let login = loginRef.value;
    if(login.emailid=="raj@gmail.com" && login.password =="123"){
        this.msg = "successfully login";
        sessionStorage.setItem("user",login.emailid);       // session.setAttribute("user",login.emailid);
        this.router.navigate(["dashboard"],{skipLocationChange:true});
    }else {
        this.msg = "Failure try once again";
    }


    /*
    this.ls.checkUser(login).subscribe(result=> {
       
       if(result=="success"){
        this.msg = "successfully login";
        sessionStorage.setItem("user",login.emailid);       // session.setAttribute("user",login.emailid);
        this.router.navigate(["dashboard"],{skipLocationChange:true});
    }else {
        this.msg = "Failure try once again";
    }

    },error=>console.log(error),()=>console.log("completed"))

    */

  }
}
