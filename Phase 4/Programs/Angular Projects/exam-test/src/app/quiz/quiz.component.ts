import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Questions } from '../questions';
@Component({
  selector: 'app-quiz',
  templateUrl: './quiz.component.html',
  styleUrls: ['./quiz.component.css']
})
export class QuizComponent implements OnInit {

  questions:Array<Questions>=[];
  selectedAnswers = new Map();
  constructor(public http:HttpClient) { }     // DI for HttpClient

  ngOnInit(): void {
    this.http.get("/assets/questions.json").
    subscribe((result:any) =>this.questions=result.questions,error=>console.log(error),()=>console.log("completed"))
  }


  correctAns(qnumber:number,ans:string){
    console.log("event fired..")
    console.log(qnumber+" "+ans);
    this.selectedAnswers.set(qnumber,ans);
    console.log(this.selectedAnswers);
  }
}
