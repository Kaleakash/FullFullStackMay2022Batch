var a=10;
a=20;
var a=30;


let b=10;
b=20;
//let b=30;         // Error in JS 
for(var i=0;i<10000;i++){

}
document.write("Value of i "+i)
for(let j=0;j<10000;j++){

}
//document.write("<br/>Value of j "+j)  // we can't access 
const c=1000;
//c=2000;           // we can't change the value 
function info() {
    name1="Raj Deep";                   // global scope consider outside function can access 
    var name2 = "Ravi Kumar";       // function scope consider insider function we can access 
    let name3 = "Ajay Kumar";
}

info();
alert(name1)
alert(name2);