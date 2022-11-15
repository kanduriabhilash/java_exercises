import java.util.Scanner;

public class Main {
    public static void main(String[] args)

    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a");
        int a = scan.nextInt();
        System.out.println("Enter b");
        int b = scan.nextInt();
        System.out.println("enter c");
        int c = scan.nextInt();
        System.out.println("Enter x");
        double x =scan.nextDouble();
        double value = (((double) (a+b)/2)*(Math.pow(x,3)))+((Math.pow((a+b),2))*(Math.pow(x,2))) +a +b +c;
        System.out.println("value of polynomial :" + value);


    }
}