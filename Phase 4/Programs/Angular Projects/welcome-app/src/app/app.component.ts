import { Component } from '@angular/core';

@Component({
  selector: 'app-root',     // tagName <app-root></app-root>
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})


export class AppComponent {
 fname:string ="Raj Deep";
 lname="Kumar";
 age:number=21;
 result:boolean = true;
//age:number=0;
}
