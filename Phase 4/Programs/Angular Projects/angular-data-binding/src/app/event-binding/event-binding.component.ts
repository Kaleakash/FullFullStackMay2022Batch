import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-event-binding',
  templateUrl: './event-binding.component.html',
  styleUrls: ['./event-binding.component.css']
})
export class EventBindingComponent implements OnInit {
  msg:string ="Hi";
  name:string ="";
  constructor() { }

  ngOnInit(): void {
  }

  fun() {
    //alert("Event generated...");
    
    setTimeout(() => {
      this.msg="Hello";  
    }, 5000);
    
  }

  passValue(obj:any){
    //console.log(obj);
    console.log(obj.value);
    this.name = obj.value;
    obj.value = "";
  }

}
