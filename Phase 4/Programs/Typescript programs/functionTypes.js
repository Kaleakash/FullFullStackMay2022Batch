function add(a, b) {
    console.log(a + " " + b);
}
add(10, 20);
//add("Raj"," Deep");
//add(10);
//add();
function sayHello() {
    return "Welcome";
}
function getNumber() {
    return 100;
}
function info() {
}
function hello() {
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
function empInfo(id, name, age) {
    if (id === void 0) { id = 0; }
    if (name === void 0) { name = "Unkown"; }
    if (age === void 0) { age = 18; }
    console.log(" id is " + id + " name is " + name + " age is " + age);
}
empInfo(100, "Ravi", 21);
empInfo(101, "Ramesh");
empInfo(102);
empInfo();
// Rest parameter : this parameter is use to receive 0, 1 or many values.
function employeeDetails(id, name, salary) {
    var skillset = [];
    for (var _i = 3; _i < arguments.length; _i++) {
        skillset[_i - 3] = arguments[_i];
    }
}
var skillInfo = ["C", "C++", "java", "Python"];
employeeDetails(1, "Ravi", 120000, "C");
employeeDetails(2, "Ramesh", 160000);
employeeDetails(3, "Ajay", 180000, "C", "C++");
