// class Employee {
//     id:number=100;
//     name:string="Ravi Kumar";
//     salary:number = 12000.50;

//     displayInfo():void {
//         console.log("Employee details ");
//         console.log(" id is "+this.id);
//         console.log("name is "+this.name);
//         console.log("salary is "+this.salary);
//     }
// }

// let emp1 = new Employee();
// emp1.displayInfo();

// class Employee {
//     private id:number=100;
//     private name:string="Ravi Kumar";
//     private salary:number = 12000.50;

//     public displayInfo():void {
//         console.log("Employee details ");
//         console.log(" id is "+this.id);
//         console.log("name is "+this.name);
//         console.log("salary is "+this.salary);
//     }
// }

// let emp1 = new Employee();
// //emp1.id=101;
// //emp1.name="Mahesh";
// //emp1.salary=-12000;
// emp1.displayInfo();


// parameter constructor 
// class Employee {
//     private id:number
//     private name:string
//     private salary:number;
//     constructor(id:number,name:string,salary:number){
//         this.id=id;
//         this.name = name;
//         this.salary=salary;
//     }
//     public displayInfo():void {
//         console.log("Employee details ");
//         console.log(" id is "+this.id);
//         console.log("name is "+this.name);
//         console.log("salary is "+this.salary);
//     }
// }
// let emp1 = new Employee(100,"Ramesh",12000);
// let emp2 = new Employee(101,"Lokesh",16000);
// emp1.displayInfo();
// emp2.displayInfo();

// // short cut constructor initliazation 
// // if we declare the parameter variable with access specifiers 
// // ie public or private it consider as instance variable. 
// class Employee {
//     //private id:number
//     //private name:string
//     //private salary:number;
//     constructor(private id:number,public name:string,private salary:number){
//        //this.id=id;
//         //this.name = name;
//       //  this.salary=salary;
//     }
//     public displayInfo():void {
//         console.log("Employee details ");
//         console.log(" id is "+this.id);
//         console.log("name is "+this.name);
//         console.log("salary is "+this.salary);
//     }
// }
// let emp1 = new Employee(100,"Ramesh",12000);
// let emp2 = new Employee(101,"Lokesh",16000);
// emp1.displayInfo();
// emp2.displayInfo();


// In typescript as well as JS using ES6 we can't write more than 
// constructor. we can write empty or parameter but only one 
class Employee {
    constructor(private id:number=123,public name:string="Unknown",private salary:number=8000){

    }
   public displayInfo():void {
        console.log("Employee details ");
        console.log(" id is "+this.id);
        console.log("name is "+this.name);
        console.log("salary is "+this.salary);
    }
}
let emp1 = new Employee(100,"Ramesh",12000);
let emp2 = new Employee(101,"Ajay");
let emp3 = new Employee(102);
let emp4 = new Employee();
emp1.displayInfo();
emp2.displayInfo();
emp3.displayInfo();
emp4.displayInfo();