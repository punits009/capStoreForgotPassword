import { Component } from "@angular/core";
import { PasswordFormat } from "./model/PasswordFromat";
import { PasswordService } from "./PassService";
import { PasswordEmail } from "./model/PasswordEmail";


@Component({
    selector:'getPass',
    templateUrl:'getPassword.html'
})

export class PasswordComponent{

     emailid: string=null;
     category: string=null;
     answer1: string=null;
     answer2: string=null;

     model: PasswordFormat = new PasswordFormat();

     result:PasswordEmail
     er:Error
     constructor(private service:PasswordService){}

     get()
     {
        this.model.email = this.emailid;
        this.model.category = this.category;
        this.model.answer1 = this.answer1;
        this.model.answer2 = this.answer2;

         this.service.forgotpassword(this.model).subscribe(
             data=>this.result=data,
             err=>this.er=err

         )
     }
     ch=false;
    change()
    {
        this.ch=true;
    }
    fchange()
    {
        this.ch=false;
    }
     
}