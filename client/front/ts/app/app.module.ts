import {NgModule} from "@angular/core";
import {BrowserModule} from "@angular/platform-browser";
import {HttpModule} from "@angular/http";
import {LoginFormComponent} from "./loginPage/login.component";
import {AppComponent} from "./app.component";
import {HttpService} from "../provider/HttpService";

@NgModule({
    imports:[
        BrowserModule, HttpModule
    ],
    declarations:[AppComponent, LoginFormComponent],
    bootstrap:[AppComponent],
    entryComponents:[AppComponent],
    providers:[HttpService]
})
export class AppModule{}
