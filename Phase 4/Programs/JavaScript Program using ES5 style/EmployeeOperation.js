function addEmployee() {
    //alert("Event fired...");
    var name = document.getElementById("uname").value;
    var age = document.getElementById("age").value;

    var pTag = document.createElement("p");// p tag ready 
    var pTagContent = document.createTextNode("Name is "+name+" Age is "+age); // content for p tag ready 

    pTag.appendChild(pTagContent);      // added content inside p tag 
    pTag.setAttribute("class","myClass");

    document.getElementById("output").appendChild(pTag);    // added p inside inside div tag 

    document.getElementById("uname").value="";
    document.getElementById("age").value="";
}