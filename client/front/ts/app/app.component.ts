import {Component} from "@angular/core";

//import {HttpService} from "../provider/HttpService";
import "rxjs/add/operator/toPromise";

@Component({
    selector: 'app',
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.css']
})
export class AppComponent {
   /* private text: string;
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
    */
}
