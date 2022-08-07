//interface with variable and methods 
// interface Abc {
//     id:number;
//     name:string;
//     dis(): void;
// }

// class Employee implements Abc {
//     id:number=100;
//     name:string ="Raj Deep";
//     dis() : void {
//         console.log("this Abc interface function");
//     }
// }

// interface with only variable. 
interface Emp {
    id:number;
    name:string;
    age?:number;
}
let emp1:Emp = {id:100,name:"Ravi",age:21};
let emp2:Emp = {id:101,name:"Ramesh",age:34};
let emp3:Emp = {id:102,name:"Kishor"};

// interface with only functions
export interface Bike {
    speed():void;
}

