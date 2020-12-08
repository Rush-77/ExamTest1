import { Component } from '@angular/core';

@Component({
    selector:"ptab",
    templateUrl : './ptab.component.html',
    styleUrls : ['./ptab.component.css']
})

export class PtabComponent{
    name = "Rushikesh";
    sal = 7000;
    
    flag = false;

    arr=[{num:1,alpha:"A"},{num:2,alpha:"B"},{num:3,alpha:"C"},{num:4,alpha:"D"},{num:5,alpha:"E"}]

    changeFlag(){
        this.flag = !this.flag;
    }
}