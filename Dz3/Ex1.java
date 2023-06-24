/*Нужно удалить из него чётные числа*/
package Java.Dz3;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Ex1
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
        for(int i = 0; i < list.size(); i++)
        {
            if (list.get(i) % 2 == 0)
            {
                list.remove(i);
            }
        }
       System.out.println("Данный список без чётных чисел : " + list); 
    }
}
/*Не понимаю, почему когда 2 чётных числа стоят рядом, он удаляет только первое, а во всех остальных случаях работает.*/