package com.company;

public class Person {

    public Person(){

    }
    String FIO, contractNumber,address;
    double contractTerm, deposit;
    public Person(String FIO,String contractNumber,String address,double deposit,double contractTerm)
    {
        this.FIO=FIO;
        this.contractNumber=contractNumber;
        this.address=address;
        this.deposit=deposit;
        this.contractTerm=contractTerm;
    }


    public boolean CheckCorrectFIO(String str){
        return str.matches("^[A-Z]([a-z -]{0,})");

    }
    public double CheckCorrectNumber(double number){
            if (number < 0) {
              number=-1;
            }
            return number;
    }

    @Override
    public String toString() {
        return "\nPerson { "+ "FIO='" + FIO + '\'' +
                ", contractNumber='" + contractNumber + '\'' +
                ", address='" + address + '\'' +
                ", deposit='" + deposit + '\'' +
                ", contractTerm=" + contractTerm +
                "}";

    }
}
