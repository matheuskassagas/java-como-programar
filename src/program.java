import com.company.entities.lambda.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class program {

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        List<User> list = new ArrayList<>();

        list.add(new User("Maria", "maria@gmail.com", 3200.00));
        list.add(new User("Alex", "alex@gmail.com", 1900.00));
        list.add(new User("Marco", "marco@gmail.com", 1700.00));
        list.add(new User("Bob", "bob@gmail.com", 3500.00));
        list.add(new User("Anna", "anna@gmail.com", 2800.00));

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        List<String> emails = list.stream()
                .filter(x -> x.getSalary() > salary)
                .map(x -> x.getEmail())
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ":");
        emails.forEach(System.out::println);

        double sum = list.stream()
                .filter(x -> x.getName().charAt(0) == 'M' )
                .map(x -> x.getSalary())
                .reduce(0.0, (x,y) -> x + y);

        System.out.println("Sum of salary from people whose name starts with 'M': " + String.format("%.2f", sum));
    }
}
