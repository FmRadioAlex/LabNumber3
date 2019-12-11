package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Person person =new Person();
        int choise;
        double deposit;
        boolean isCorrectly;
        String FIO;
        Persons persons=new Persons(5);
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.println("\n"+
                    "\n1.Для выдачу сведений о каждом из вкладчиков (по фамилии)  " +
                    "\n2. Для выдачи сведений о вкладчиках, у которых срок договора свыше 12 месяцев" +
                    "\n3. Для выдачи сведений о вкладчиках, вклад которых превышает заданную сумму" +
                    "\n4. Для удаление записей о вкладчиках с заданной фамилией" +
                    "\n5. Для выдачи сведений о каждом из вкладчиков");
            System.out.println("You choise");
            choise = scanner.nextInt();
            scanner.skip("\n");
            switch (choise) {
                case 1: {
                    System.out.println("Введите фамилию клиента: ");
                    String Surname = scanner.next();
                    persons.getWithFIO(Surname);
                    break;
                }
                case 2: {
                    System.out.println("Выдача вкладчика которые срок договора свыше 12 мейсяцув");
                    System.out.println(persons.getWithGrateTempDeposit(12));
                    break;
                }
                case 3: {
                    System.out.println("Ведите сумму вклада: ");
                    deposit=scanner.nextDouble();
                    System.out.println("\n"+deposit);
                    System.out.println(persons.getWithDeposit(deposit
                    ));
                    break;
                }
                case 4: {
                    System.out.println("Ведите Фамилию для удаления ");
                    {
                       FIO=scanner.nextLine();
                       System.out.println("\n"+FIO);
                       persons.deleteList(FIO);
                   }
                    break;
                }
                case 5:{
                      System.out.println(persons.toString());
                    break;
                }
                case 0:
                    return;
                default:
                    System.out.println("Error");
                    break;
            }
        }
    }
}
