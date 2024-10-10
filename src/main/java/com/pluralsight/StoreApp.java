package com.pluralsight;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class StoreApp {

    public static void main(String[] args) {

        ArrayList<Product> inventory = getInventory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %d | Name: %s | - Price: $%.2f%n",
                    p.getId(), p.getName(), p.getPrice());
        }
    }
    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<>();
        inventory.add(new Product(4567, "2x4 (grade B)", 9.99f));
        inventory.add(new Product(1234, "Hammer", 19.49f));
        inventory.add(new Product(2345, "Box of nails", 9.29f));
        inventory.add(new Product(6039, "Tools Bag", 40.99f));
        inventory.add(new Product(9234, "Soap", 4.50f));



        return inventory;


    }
}
