// literal style 
let emp1 = {id:100,name:"Ravi",age:21};
document.write("<br> Literal style object creation ");
document.write("<br> Id is "+emp1.id);
document.write("<br> Name is "+emp1.name);
document.write("<br> Age is "+emp1.age);

// function style object creation ES5 style  
// function Employee() {
//     this.id = 100;
//     this.name = "Raj Deep";         // instance variable consider 

//     this.display = function() {
//         document.write("<br/>Employee details");
//         document.write("<br/>id is "+this.id);
//         document.write("<br/>name is "+this.name)
//     }
// }
// //Employee();
// var emp2 = new Employee();      // memory creation;
// emp2.display();
// var emp3 = new Employee();      // memory creation;
// emp3.display();

// function style object creation with parameter ES5 style 
// function Employee(id,name) {
//     this.id = id;
//     this.name = name;         // instance variable consider 

//     this.display = function() {
//         document.write("<br/>Employee details");
//         document.write("<br/>id is "+this.id);
//         document.write("<br/>name is "+this.name)
//     }
// }
// //Employee();
// var emp2 = new Employee(1,"Raju");      // memory creation;
// emp2.display();
// var emp3 = new Employee(2,"Lokesh");      // memory creation;
// emp3.display();
// class style object creation ES6 style 
// class Employee {
//         id=100;
//         name="Ravi";                // instance variable 

//         display() {
//             document.write("<br/> Employee details are ")
//             document.write("<br> id is "+this.id);
//             document.write("<br/> Name is "+this.name);
//         }
// }
// document.write("<br/> Class style object creation<br/>");
// let emp2 = new Employee();
// emp2.display();

// // class style object creation with empty constructor 

// class Employee {
//     id=100;
//     name="Ravi";                // instance variable 

//     constructor(){
//         document.write("<br/> Object created...")
//     }
//     display() {
//         document.write("<br/> Employee details are ")
//         document.write("<br> id is "+this.id);
//         document.write("<br/> Name is "+this.name);
//     }
// }
// document.write("<br/> Class style object creation<br/>");
// let emp2 = new Employee();
// emp2.display();


// class style object creation with parameter constructor 

class Employee {
    // id=100;
    // name="Ravi";                // instance variable 

    constructor(id,name){
        document.write("<br/> Object created...")
        this.id = id;
        this.name = name;
    }
    display() {
        document.write("<br/> Employee details are ")
        document.write("<br> id is "+this.id);
        document.write("<br/> Name is "+this.name);
    }
}
document.write("<br/> Class style object creation<br/>");
let emp2 = new Employee(100,"Ravi");
emp2.display();
let emp3 = new Employee(101,"Raj");
emp3.display();





