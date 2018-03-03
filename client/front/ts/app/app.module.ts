import {NgModule} from "@angular/core";
import {AppComponent} from "./app.component";
import {BrowserModule} from "@angular/platform-browser";
import {HttpService} from "../provider/HttpService";
import {HttpModule} from "@angular/http";
import {LoginFormComponent} from './loginPage/login.component';

@NgModule({
    imports:[
        BrowserModule, HttpModule,LoginFormComponent
    ],
    declarations:[AppComponent],
    bootstrap:[AppComponent],
    entryComponents:[AppComponent],
    providers:[HttpService]
})
export class AppModule{}
