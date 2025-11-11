package client;
import entity.*;
import repository.*;
import java.util.Scanner;

public class TestPMS {
    public static void displayMenu(){
        System.out.println("---------------");
        System.out.println("Choose an option");
        System.out.println("1. Add Product");
        System.out.println("2. Display Products");
        System.out.println("3. Remove Products");
        System.out.println("4. Exit");
        System.out.println("--------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductItems productItems = new ProductItems(); 
        while (true) {
            displayMenu();
            int choice = sc.nextInt();
            if(choice==1){
                System.out.println("Adding Product");
                System.out.println("Enter Product id: ");
                int id = sc.nextInt();
                System.out.println("Enter Product name: ");
                String name = sc.next();
                System.out.println("Enter Product price: ");
                double price = sc.nextDouble();
                System.out.println("Enter Product quantity: ");
                int quantity = sc.nextInt();
                Product p1 = new Product(id, name, name, price, quantity);
                productItems.addProduct(p1);
            }else if(choice==2){
                System.out.println("Display Product:");
                productItems.displayProducts();
            }else if (choice==3) {
                System.out.println("Remove product");
            }else{
                System.out.println("Thanks for visiting!!");
                break;
            }
        }
        sc.close();
    }
}
