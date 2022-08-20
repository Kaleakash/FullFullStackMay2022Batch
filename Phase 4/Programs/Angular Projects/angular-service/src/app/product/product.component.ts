import { Component, OnInit } from '@angular/core';
import { Product } from '../product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

  products:Array<Product>=[];
  constructor(public ps:ProductService) { } // DI for ProductService

  // component life cycle method which will call automatically 
  // after componentn loaded and it will call only once after constructor. 
  ngOnInit(): void {
    this.loadAllProduct();
  }

  loadAllProduct() {
    this.ps.loadProductData().subscribe(data=>this.products=data,error=>console.log(error),()=>console.log("completed"))
  }

}
