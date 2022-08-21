import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Product } from '../product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

  productRef = new FormGroup({
    pid:new FormControl(),
    pname:new FormControl(),
    price:new FormControl(),
    url:new FormControl()
  })

  products:Array<Product>=[];
  constructor(public ps:ProductService) { } // DI for ProductService
  storeMsg:string="";
  buttonName:string ="Add Product";

  // component life cycle method which will call automatically 
  // after componentn loaded and it will call only once after constructor. 
  ngOnInit(): void {
    this.loadAllProduct();
  }

  loadAllProduct() {
    this.ps.loadProductData().subscribe(data=>this.products=data,error=>console.log(error),()=>console.log("completed"))
  }

  addProduct(){
    //alert("event fired")
    let product = this.productRef.value;
    //console.log(product);
   
    if(this.buttonName=="Add Product"){
      
      this.ps.storeProduct(product).subscribe(result=>this.storeMsg=result,error=>this.storeMsg=error,()=> {
        this.loadAllProduct();
        console.log("completed...");
      })

    }else {

      this.ps.updateProduct(product).subscribe(result=>this.storeMsg=result,error=>this.storeMsg=error,()=> {
        this.loadAllProduct();
        console.log("completed...");
      })
      this.buttonName="Add Product";
    }
    
    this.productRef.reset();
  }

  deleteProduct(pid:number){
    //console.log(pid);
    this.ps.deleteProduct(pid).subscribe(result=>console.log(result),error=>console.log(error),()=>{
      this.loadAllProduct();
    });
  }

  updateProduct(product:any) {
      this.productRef.get("pid")?.setValue(product.pid);      // change formcontrolname value 
      this.productRef.get("pname")?.setValue(product.pname); // change formcontrolname value
      this.productRef.get("price")?.setValue(product.price);  // change formcontrolname value
      this.productRef.get("url")?.setValue(product.url);    
      this.buttonName="Update Product";
  }
}
