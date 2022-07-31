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
