//exercise 1 age Asks the user for age

import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
        System.out.println("provide your age: ");
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.next());
        int currentyear = 2022;
        int birthyear = currentyear - age;
        System.out.println("your year of birth is :"+birthyear);

    }
}
