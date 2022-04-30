package com.company;

public class Main {

    public static void main(String[] args) {
        ClientInfo customer = new ClientInfo();
        customer.name = "Alex";
        customer.age = 18;
        customer.moneyInAccount = 900;
        customer.credit = true;
        //S( customer.credit1 = false;

        Car car = new Car();
        car.price = 400_000;

        if (customer.age < 18) {
            int whenToCome = 18 - customer.age;
            System.out.println("Sorry" + "," + "come again in" + " " + whenToCome + " " + "years.");
            return;
        }

        int enoughMoney = customer.moneyInAccount - car.price;
        int monthlyPayment = enoughMoney * -1 / 3 / 12;

        if (enoughMoney > 0) {
            System.out.println("Congratulations, you can take your car!");
        } else {
            System.out.println("Would you like to take credit?");

            if (customer.credit) {

                System.out.println("Your monthly payment is " + monthlyPayment + "UAH" + "\n" +
                        "Congratulations! You can take your car!");
            } else {
                System.out.println("Come again later, we will be glad to see you soon");
            }
        }
    }
}