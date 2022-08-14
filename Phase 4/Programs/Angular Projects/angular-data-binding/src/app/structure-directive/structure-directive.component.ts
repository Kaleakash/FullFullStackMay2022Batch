import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';

@Component({
  selector: 'app-structure-directive',
  templateUrl: './structure-directive.component.html',
  styleUrls: ['./structure-directive.component.css']
})
export class StructureDirectiveComponent implements OnInit {

  f1:boolean = true;
  f2: boolean = false;
  flag : boolean = false;
  msg:string ="Show";
  f3:boolean = false;
  
  names:Array<string>=["Ravi","Raj","Ajay","Vikash","Vijay","Lokesh"];
  employees:Array<Employee>=[];

  constructor() { 
    let emp1 = new Employee(100,"Raj",12000);
    let emp2 = new Employee(101,"Ravi",14000);
    let emp3 = new Employee(102,"Ramesh",16000);
    let emp4 = new Employee(103,"Rajesh",18000);
    this.employees.push(emp1);
    this.employees.push(emp2);
    this.employees.push(emp3);
    this.employees.push(emp4);
  }

  ngOnInit(): void {
  }

  addEmployee(idRef:any,nameRef:any,salaryRef:any){
    let emp = new Employee(idRef.value,nameRef.value,salaryRef.value);
       this.employees.push(emp);
    idRef.value="";
    nameRef.value="";
    salaryRef.value="";
  }

  fun() {
    this.flag = true;
  }

  toggle(): void {
    if(this.f3){
      this.f3=false;
      this.msg="Show";
    }else {
      this.f3= true;
      this.msg = "Hide";
    }
  }
}
