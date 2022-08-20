import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from './product';

@Injectable({
  providedIn: 'root'  // it register in app.module.ts file in provider attribute 
})
export class ProductService {

  constructor(public http:HttpClient) { }     // DI for HttpClient which help to rest api.
  
  // loadProductData() {
  //   this.http.get("http://localhost:8080/product/findAllProduct").subscribe(data=>console.log(data),error=>console.log(error),()=>console.log("completed"));
  // }

  loadProductData() :Observable<Product[]>{
    return this.http.get<Product[]>("http://localhost:8080/product/findAllProduct");
  }
}
