package com.company.entities.polimorfismo.employee;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainEmployee {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n)?: ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHours = sc.nextDouble();
            if (ch == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                list.add(new OutsourcedEmployee(name, hours, valuePerHours, additionalCharge));
            }else{
                list.add(new Employee(name, hours, valuePerHours));
            }
        }
        System.out.println();
        System.out.println("PAYMENTS: ");
        for (Employee x: list){
            System.out.println(x.getName() + " - $ " + String.format("%.2f", x.payment()));
        }



    }
}
