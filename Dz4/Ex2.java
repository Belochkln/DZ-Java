/*Сложите два числа и верните сумму в виде связанного списка. Одно или два числа могут быть отрицательными.*/
package Java.Dz4;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

public class Ex2 
{
     public static void main(String[] args) 
    {
        int random1 = ThreadLocalRandom.current().nextInt(-1000, 1000);
        int random2 = ThreadLocalRandom.current().nextInt(-1000, 1000);
        System.out.println("Первое число: " + random1);
        System.out.println("Второе число: " + random2);
        double summa = random1 + random2;
        System.out.printf("Сумма: %.0f", summa);
        System.out.println();

        LinkedList<Integer> llresult = new LinkedList<Integer>();
        String length = Double.toString(summa);
        if(summa < 0)
        {
            summa = summa * (-1);
            for(int i = length.length() - 4; i >= 0; i--)
            {
                double temp = Math.pow(10, i);
                double sum = (summa - summa % temp)/temp;
                summa = summa % temp;
                int num = (int) sum;
                llresult.add(num);
            }
        System.out.println("В виде связанного списка: -" + llresult);/*Не знаю нужен ли был "-" внутри связанного списка, в задании не написано)*/
        }
        else
        {
            for(int i = length.length() - 3; i >= 0; i--)
            {
            double temp = Math.pow(10, i);
            double sum = (summa - summa % temp)/temp;
            summa = summa % temp;
            int num = (int) sum;
            llresult.add(num);
            }
        System.out.println("В виде связанного списка: " + llresult);
        }  
    }
}
