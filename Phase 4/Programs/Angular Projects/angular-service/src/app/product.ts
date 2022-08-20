// This class is use to map our json data which retrieve from backend technologies 
// backend JavaBean , Fronend Model class 
// Angular Model class, Java Entity class and MySQL Table must be match. 
export class Product {
    constructor(public pid:number,
        public pname:string,
        public price:number,
        public url:string){}
}


// this code for join table. 
// export class TrainerStudent {
//     constructor(public trainer:Trainer,
//         public stuent:Student){

//         }
// }
// export class Trainer {

// }
// export class Student {

// }