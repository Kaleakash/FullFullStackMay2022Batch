// let num1=[];                // literal style 
// let num2 = new Array();     // created using new keyword. 
// document.write("<br/> Size of array "+num1.length);
// document.write("<br/> Size of array "+num2.length);
// num1.push(10);      // it will add element at last 
// num1.push(20);
// num1.push(30);
// num1.unshift(40);       // it will add element at begining 
// num1.unshift(50);
// document.write("<br> All elements from array "+num1);
// document.write("<br/> Size of array "+num1.length);
// num1.pop();     // it will remove the elements from last 
// num1.shift();   // it will remove the elements from begining 
// document.write("<br> All elements from array "+num1);
// document.write("<br/> Size of array "+num1.length);
//let num3 = [10,20,30,40,50,60]; // array literal style with initialization
//document.write("<br/> "+num3)
// 1st parameter index position and 2nd parameter number of elements to remove  
//num3.splice(2,1);       //move to 2nd index position and remove 1 elements
//num3.splice(2,3);       //move to 2nd index position and remove 3 elements
// 1st parameter index position, 2nd number of element to delete 
// 3rd, 4th...nth add the element from that index position 
//num3.splice(2,0,100);   // 2nd index position, 0 element remove and add 100 
//num3.splice(2); // from 2nd index position remove all elements 
//num3.splice(2,1,100);     // replace on 2nd index position by 100
//num3.splice(2,0,100);       // add 100 on index position 
//num3.splice(2,1,"hello");
//document.write("<br/> "+num3) 
// let num5 = ["Ravi","Ajay","vijay","Lokesh","Mahesh"];
// document.write("All names "+num5);
// num5.sort();
// document.write("<br/>After Sort")
// document.write("<br/>All names "+num5);

let names = ["Ravi","Ajay","vijay","Lokesh","Mahesh"];
// document.write("Retreive the names one by one using for loop<br/>");
// for(let i=2;i<names.length;i=i+2){
//     document.write("<br> "+names[i]);
// }
// document.write("<br/>using for of loop<br/>")
// for(let name of names){
//     document.write("<br> "+name);
// }
// document.write("<br/> for in loop <br/>")
// for(let i in names){
//     document.write("<br> index position "+i+" value "+names[i]);
// }
// document.write("<br/> display the value using callback <br/>")

//1st 
//names.forEach(display);
// function display(n,i){
//     document.write("<br> "+n+" "+i);
// }

//2nd 
// names.forEach(function display(n,i){
//     document.write("<br> "+n+" "+i);
// })

//3rd 
names.forEach((n,i)=>document.write(n+" "+i));







