import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("How  much amount do you receiveed");
        Scanner scanner = new Scanner(System.in);
        int Amount = Integer.parseInt(scanner.next());
        int Amount_for_books = (Amount/4)*3;
        System.out.println("Books and supplies :" +Amount_for_books+"$");
        int balance_amount = Amount - Amount_for_books;
        int coffee_price = 2;
        int flash_comp_numbers = 4;
        int subway_ticketfare =3;
        int remaining_distribution = balance_amount/3;
        int num_of_coffess = remaining_distribution/coffee_price;
        int num_of_flashcompjournal = remaining_distribution/flash_comp_numbers;
        int num_of_subway = remaining_distribution/subway_ticketfare;
        int remaining_Amount = remaining_distribution%coffee_price ;
        remaining_Amount += remaining_distribution%flash_comp_numbers;
        remaining_Amount += remaining_distribution%subway_ticketfare;
        System.out.println(num_of_coffess+" coffees");
        System.out.println(num_of_flashcompjournal+" flashcomputers");
        System.out.println(num_of_subway+" subwaytickets");
        System.out.println("you will have "+remaining_Amount+" for white roses");




    }
}