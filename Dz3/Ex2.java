package Java.Dz3;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Ex2 
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
        for(int j = 0; j < (list.size()); j++)
        {
            for(int i = 1; i < list.size(); i++)
            {
                if(list.get(i-1) > list.get(i))
                {
                    int temp = list.get(i-1);
                    list.set(i - 1, list.get(i));
                    list.set(i, temp);
                }
            }
        }
         System.out.println("Минимальное значение: " + list.get(0));
    }
}
