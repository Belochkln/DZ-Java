/*Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.*/
package Java.Dz2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.ConsoleHandler;

public class Ex2 
{   
    public static void main(String[] args) throws IOException 
    {
        FileWriter file = new FileWriter("Sorting.txt");
        ConsoleHandler info = new ConsoleHandler();
        System.out.println("Дан числовой массив: ");
        int numbers[] = {5,8,2,5,1,3,4,7};
        for(int i = 0; i < 8; i++)
        {
            System.out.print(numbers[i] + " ");
        }

        for(int j = 0; j < 4; j++)
        {
            for(int i = 1; i < 8; i++)
            {

                if (numbers[i-1] > numbers[i])
                {
                    int temp = numbers[i];
                    numbers[i] = numbers[i-1];
                    numbers[i-1] = temp;
                    file.write((i-1) + " элемент поменялся с " + i);
                    file.write("\n");
                }
            }
        }
        System.out.println();
            for(int i = 0; i < 8; i++)
        {
            System.out.print(numbers[i] + " ");
        }
        file.close();
    } 
}
