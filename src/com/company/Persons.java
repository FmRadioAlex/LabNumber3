package com.company;

import java.util.ArrayList;

public class Persons {
    ArrayList<Person> list;
boolean isCorrectly=false;
    int i;

    public Persons (){
        this.list=new ArrayList();
    }
    public  Persons (int lenght){
        list=new ArrayList(lenght);
        addToList(new Person("Bred", "w4tn1u" , "Еврейская 24а", 21321, 233));
        addToList(new Person("Frank", "w12rfq" , "Фонтанская 36", 46343, 3));
        addToList(new Person("Chip", "w421rq" , "Прошкарина 21", 435323, 26));
        addToList(new Person("Lion", "feb43" , "За-ШОООО-НИНАДО д.Позязя", 1243, 43));
        addToList(new Person("Nudes", "OUFB3" , "На этом спасибо", 2, 15));
    }
    public Persons getWithGrateTempDeposit(double temp)
    {
        Persons sublist=new Persons();
        for (Person person:this.list) {
            if (person.contractTerm > temp){
                sublist.addToList(person);
            }

        }
        return  sublist;
    }
    public  Persons getWithDeposit(double temp){
        Persons sunlist=new Persons();
        for (Person person:this.list) {
            if (person.deposit>temp){
                sunlist.addToList(person);
            }
        }
        return sunlist;
    }

    @Override
    public String toString() {
        return ""+this.list;
    }
    public void getWithFIO(String Surname) {
        for (int i = 0; i < this.list.size(); i++) {
            if (list.get(i).FIO.toLowerCase().equals(Surname.toLowerCase())) {
                System.out.println(  this.list.get(i));
            }
        }

    }

    public void addToList(Person person){
        this.list.add(person);
    }

    public void deleteList(String FIO){

        for (int i = 0; i < this.list.size(); i++) {
            if (list.get(i).FIO.toLowerCase().equals(FIO.toLowerCase()))
                this.list.remove(i);
            }

        }
    }


