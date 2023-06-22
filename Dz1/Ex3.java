/*Реализовать простой калькулятор (+-/*)*/
import java.util.Scanner;
public class Ex3 
{
     public static void main(String[] args) 
    {
    System.out.print("Введите число: ");
    Scanner iScanner = new Scanner(System.in);
    float number = iScanner.nextFloat();
    System.out.print("Введите знак (+-/*): ");
    Scanner iScanner2 = new Scanner(System.in);
    String znak = iScanner2.next();
    System.out.print("Введите второе число: ");
    Scanner iScanner3 = new Scanner(System.in);
    float number2 = iScanner.nextFloat();
    iScanner3.close();
    iScanner.close();
    iScanner2.close();
    float sum = 0;
    switch (znak)
    {
        case "+":
            sum = number + number2;
            break;
        case "-":
            sum = number - number2;
            break;
        case "/":
            sum = number / number2;
            break;
        case "*":
            sum = number * number2;
            break;
    }
    System.out.printf("%f ", number);
    System.out.printf(znak);
    System.out.printf(" %f = %f", number2, sum);
    }
}