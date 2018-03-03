import {Component} from "@angular/core";

import "rxjs/add/operator/toPromise";
import {HttpService} from "../provider/HttpService";

@Component({
    selector: "app",
    template: 'text is {{text}}'
    //templateUrl: './app.component.html',
   // styleUrls: ['./app.component.css']
})
export class AppComponent {
    private text: string;

    ngOnInit(): void{
        this.httpService.get("\getMainText").toPromise().then(
            result =>{
                this.text = result.json().text;
            },
            error =>{
                this.text = "Something is wrong";
            }
        )
    }
    constructor(private httpService:HttpService){

    }

}
