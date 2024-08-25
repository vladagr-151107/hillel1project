package App;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter your name");
        String name1 = scanner.next();

        System.out.println("What do you want to buy?");
        String product1 = scanner.next();

        System.out.println("How much does it cost?");
        double priceOfPhone = scanner.nextDouble();

        System.out.println("Please, enter your street(just a name) and a number of the house after that");
        String address1 = scanner.next();
        int numberOfTheHouse1 = scanner.nextInt();

        System.out.println("Please, enter your name");
        String name2 = scanner.next();

        System.out.println("What do you want to buy?");
        String product2 = scanner.next();
        System.out.println("How much does it cost?");
        double priceOfLaptop = scanner.nextDouble();

        System.out.println("Please, enter your home address and a number of the house after that");
        String address2 = scanner.next();
        int numberOfTheHouse2 = scanner.nextInt(numberOfTheHouse1);

        System.out.println("Order No 1 Client: " + name1 + ".");
        System.out.println("Product: " + product1 + ",");
        System.out.println("price EUR " + priceOfPhone + ".");
        System.out.println("Address: " + address1 + "street, " + numberOfTheHouse1);
        System.out.println("Order No 2 Client: " + name2 + ".");
        System.out.println("Product: " + product2 + ",");
        System.out.println("price EUR " + priceOfLaptop + ".");
        System.out.println("Address: " + address2 + "street, " + numberOfTheHouse2);

        System.out.println("Added to make some changes with comments");
    }
}
