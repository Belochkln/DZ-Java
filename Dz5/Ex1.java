/*Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами, 
их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.*/
package Java.Dz5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex1 
{
    private static String tel;

    public static void main(String[] args) 
    {
        System.out.print("1. Добавить контакт \n2. Вывести всех \n3. Выход \nВыберите действие: ");
        Scanner iScanner = new Scanner(System.in);
        int select = iScanner.nextInt();

        Map<String,ArrayList> mapname = new HashMap<String,ArrayList>();
        while (select != 3)
        {
            switch (select)
            {
            case 1:
            ArrayList<String> multipletel = new ArrayList<String>();
            String o = iScanner.nextLine();/* */
            System.out.print("Введите имя: ");
            String name = iScanner.nextLine();
            System.out.print("Введите телефон: ");
            String tel = iScanner.nextLine();
            for(var item : mapname.entrySet())
            {
                if (name.equals(item.getKey()))
                {
                    ArrayList<String> temp = new ArrayList<String>();
                    temp = item.getValue();
                    for(int i = 0; i<temp.size();i++)
                    {
                        String word = temp.get(i);
                        multipletel.add(word);
                    }
                }
            }
            multipletel.add(tel);
            mapname.put(name,multipletel);
            System.out.print("1. Добавить контакт \n2. Вывести всех \n3. Выход \nВыберите действие: ");
            select = iScanner.nextInt();
            continue;
            case 2:
            System.out.println("Все контакты: ");
            for (var item : mapname.entrySet()) 
            {
            System.out.println("Имя: " + item.getKey() +" Телефон: "+ item.getValue());
            }
            System.out.print("1. Добавить контакт \n2. Вывести всех \n3. Выход \nВыберите действие: ");
            select = iScanner.nextInt();
            continue;

            default: 
            System.out.println("Нету такого действия");
            }

        }
        if (select == 3)
        {
            System.out.println("Вы вышли");
        }
        iScanner.close();
    }
}
