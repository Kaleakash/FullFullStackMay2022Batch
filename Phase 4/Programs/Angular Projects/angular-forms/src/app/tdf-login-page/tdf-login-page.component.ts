import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { MyService } from '../custom.service';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-tdf-login-page',
  templateUrl: './tdf-login-page.component.html',
  styleUrls: ['./tdf-login-page.component.css']
})
export class TdfLoginPageComponent implements OnInit {
  msg:string ="";
  constructor(public ls : LoginService) { }

  ngOnInit(): void {
  }

  checkUser(loginRef:NgForm){
    let login = loginRef.value;
    // console.log(login);
    // if(login.email=="raj@gmail.com" && login.password =="123"){
    //   this.msg="successfully login";
    // }else {
    //   this.msg="Failure try once again";
    let cs = new MyService();
    //this.msg = cs.checkUserDetails(login);
    this.msg = this.ls.checkUser(login);
      loginRef.reset();
    }
  
}
