import { Injectable } from "@angular/core";
import { HttpClient, HttpHeaders } from "@angular/common/http";
import {Observable} from 'rxjs';
import { PasswordFormat } from "./model/PasswordFromat";
import { PasswordEmail } from "./model/PasswordEmail";




@Injectable({
    providedIn:'root'
})

export class PasswordService{

    constructor(private http:HttpClient){

    }

    forgotpassword(pass:PasswordFormat){
        let options = { "headers": 
                    new HttpHeaders({"Content-Type": "application/json" }) };
        return this.http.post<PasswordEmail>('http://localhost:5000/forgot/getPass',pass,options);
    }
    

}
