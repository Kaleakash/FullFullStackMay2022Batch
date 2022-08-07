import { Component } from "@angular/core";

@Component({
    selector:"my-child-tag",
    templateUrl:"./child.component.html"
})
export class ChildComponent {
    msg:string ="This is child component";
}
