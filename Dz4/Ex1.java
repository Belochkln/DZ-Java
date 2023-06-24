/*Умножьте два числа и верните произведение в виде связанного списка.*/
package Java.Dz4;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Ex1 
{
    public static void main(String[] args) 
    {
        Deque<Integer> firstNum = new ArrayDeque<Integer>();
        Deque<Integer> secondNum = new ArrayDeque<Integer>();
        int random = ThreadLocalRandom.current().nextInt(1, 5);
        for (int i = 0; i < random; i++)
        {
            int random2 = ThreadLocalRandom.current().nextInt(1, 10);
            firstNum.add(random2);
        }
        int random3 = ThreadLocalRandom.current().nextInt(1, 5);
        for (int i = 0; i < random3; i++)
        {
            int random2 = ThreadLocalRandom.current().nextInt(1, 10);
            secondNum.add(random2);
        }
        System.out.println("Первый Deque: " + firstNum);
        System.out.println("Второй Deque: " + secondNum);

        double numOne = 0;
        double numTwo = 0;
        int firstsize = firstNum.size();
        int secondsize = secondNum.size();
        for(int i = 0; i < firstsize; i++)/*Почему когда я исспользовал firstNum.size() в цикле for(int i = 0; i < firstNum.size(); i++) 
                                            цикл заканчивался раньше чем нужно, а с превобразованием в переменную всё заработало?*/
        {
            double temp = Math.pow(10, i);
            numOne = numOne + firstNum.pop() * temp;
             /*System.out.println(i); Использовал для проверки до скольки доходила i, по причине сверху было на 2 "прохода" меньше*/
        }
        for(int i = 0; i < secondsize ; i++)
        {
            double temp = Math.pow(10, i);
            numTwo = numTwo + secondNum.pop() * temp;
        }
        double res = numOne * numTwo;
        int result = (int) res;
        System.out.printf("%.0f * %.0f = %d", numOne, numTwo, result);
        System.out.println();
        
        LinkedList<Integer> llresult = new LinkedList<Integer>();
        String length = Double.toString(result);
        for(int i = length.length() - 3; i >= 0; i--)
        {
            double temp = Math.pow(10, i);
            double sum = (res - res % temp)/temp;
            res = result % temp;
            int num = (int) sum;
            llresult.add(num);
        }
        System.out.println("В виде связанного списка: " + llresult);
    }
}