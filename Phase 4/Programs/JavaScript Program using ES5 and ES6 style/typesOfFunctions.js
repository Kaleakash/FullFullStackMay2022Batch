// Normal Function 
display1();
function display1() {
    document.write("<br/> Normal style function");
}
display1();

// expression style function 
var display3 = function display2() {
    document.write("<br/> Expression style function with name")
}
display3();
// expression style function 
//display4();       
var display4 = function() {
    document.write("<br/> Exprssion style function without name");
}
display4();

// arrow function 
let display5 = ()=> document.write("<br/>Arrow function");
display5();

// expression style funtion with parameter 
let add1 = function(a,b){
    var sum = a+b;
    return sum;
}
document.write("<br> Sum of two number using expression style is "+add1(10,20));
// arrow style function with parameter 
let add2 = (a,b)=>a+b;
document.write("<br/> Sum of two number using arrow style is "+add2(10,20));
// find largest using arrow style 
let findLargest = (a,b)=> {
    if(a>b){
        return "a is largest";
    }else {
        return "b is largest"
    }
}
document.write("<br/> find largest "+findLargest(10,4));

// user-defined callback function 

function greeting(fname,callback){
    return "Welcome "+callback(fname);
}

let maleInfo = function(fname){
    return "Mr "+fname;
}
let femaleInfo = (fname)=> "Miss "+fname;

document.write("<br/> "+greeting("Raj",maleInfo));
document.write("<br/> "+greeting("Seeta",femaleInfo));
document.write("<br> "+greeting("Mahesh",function(fname){
    return "Mr "+fname;
}))
document.write("<br/> "+greeting("Meeta",(fname)=> "Miss "+fname));

// IIFE style function 

(function(){
    document.write("<br/>IIFE function")
})();

(function(a,b){
    var sum = a+b;
    document.write("<br>sum of two number using IIFE style "+sum);
})(10,20);















































