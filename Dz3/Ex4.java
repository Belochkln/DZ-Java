/*Найти среднее ариф. значение*/
package Java.Dz3;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Ex4 
{
    public static void main(String[] args) 
    {
        int random = ThreadLocalRandom.current().nextInt(1, 10 + 1);
        ArrayList<Integer> list = new ArrayList<Integer>(random);
        for (int i = 0; i < random; i++)
        {
            int random2 = ThreadLocalRandom.current().nextInt(1, 100 + 1);
            list.add(random2);
        }
        System.out.println("Данный список целых чисел: " + list);
        float sred = 0;
        for(int i = 0; i < list.size(); i++)
        {
            sred = sred + list.get(i);
        }
        System.out.println("Среднее арифметическое значение: " + (sred/random));
    }
}
