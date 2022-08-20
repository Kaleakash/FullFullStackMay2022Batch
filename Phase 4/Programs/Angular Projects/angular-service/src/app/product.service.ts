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
    return this.http.get<Product[]>("http://localhost:8080/product/findAllProduct");    // by default json consider 
  }

  // post method take two parameter 1st url and 2nd object in json format.
  // by default all method return type json consider.  
  storeProduct(product:any):Observable<string>{
    return this.http.post("http://localhost:8080/product/storeProduct",product,{responseType:'text'});
  }

  updateProduct(product:any):Observable<string>{
    return this.http.put("http://localhost:8080/product/updateProduct",product,{responseType:'text'});
  }
  

  deleteProduct(pid:number):Observable<string> {
    return this.http.delete("http://localhost:8080/product/deleteProduct/"+pid,{responseType:"text"});
  }
}
