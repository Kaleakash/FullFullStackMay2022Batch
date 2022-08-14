import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { MyService } from '../custom.service';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-mdf-login-page',
  templateUrl: './mdf-login-page.component.html',
  styleUrls: ['./mdf-login-page.component.css']
})
export class MdfLoginPageComponent implements OnInit {

  loginRef = new FormGroup({
    email : new FormControl(),
    password : new FormControl()
  });
  msg:string = "";
  constructor(public ls:LoginService) { }   // DI for LoginSerice using Constructor Base 

  ngOnInit(): void {
  }
  checkUser() {
    let login = this.loginRef.value;
    //console.log(login);
    // if(login.email=="raj@gmail.com" && login.password=="123"){
    //   this.msg = "Successfully login";
    // }else {
    //   this.msg = "Failure try once again";
    // }
    let cs = new MyService();
    //this.msg = cs.checkUserDetails(login);
    this.msg = this.ls.checkUser(login);    // we are calling service without creating memory explicity 
    this.loginRef.reset();
  }
}
