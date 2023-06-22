/*Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)*/
import java.util.Scanner;
public class Ex1
{
    public static void main(String[] args) 
    {
    System.out.print("Введите число n: ");
    Scanner iScanner = new Scanner(System.in);
    int number = iScanner.nextInt();
    iScanner.close();

    int sum = 0;
    int comp = 1;
    for(int i = 1; i <= number; i++)
    {
        sum = sum + i;
        comp = comp * i;
    }
    System.out.printf("Сумма чисел до %d = %d", number, sum);
    System.out.println();
    System.out.printf("Произведение чисел до %d = %d", number, comp);
    }
}
   