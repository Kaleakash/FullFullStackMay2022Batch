function add(a:number,b:number){        // by default any consider 
    console.log(a+" "+b);
}

add(10,20);
//add("Raj"," Deep");
//add(10);
//add();
function sayHello(): string {

    return "Welcome";
}

function getNumber(): number {
    return 100;
}
function info(): void {

}

function hello():any {
 
   // return 100;
  // return "Welcome"
}
// // Optional parameter
// // ? Optional parameter declaration must be right to left.  
// function empInfo(id?:number,name?:string,age?:number) {
//     console.log(" id is "+id+" name is "+name+" age is "+age);
// }

// default initialization parameter
// default parameter declaration must be right to left.  
function empInfo(id:number=0,name:string="Unkown",age:number=18) {
    console.log(" id is "+id+" name is "+name+" age is "+age);
}
empInfo(100,"Ravi",21);
empInfo(101,"Ramesh");
empInfo(102);
empInfo();

// Rest parameter : this parameter is use to receive 0, 1 or many values.
 // syntax ...variableName:dataType[];
 // we can use only one rest parameter in function and it must be 
 // last parameter in function. 
function employeeDetails(id:number,name:string,salary:number,...skillset:string[]){

}
let skillInfo:string[]=["C","C++","java","Python"]

employeeDetails(1,"Ravi",120000,"C");
employeeDetails(2,"Ramesh",160000);
employeeDetails(3,"Ajay",180000,"C","C++");





