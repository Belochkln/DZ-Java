/*Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"} */
package Java.Dz2;

import java.util.Scanner;

public class Ex1 
{
     public static void main(String[] args) 
    {
        System.out.println("Введите параметры для фильтрации: ");
        StringBuilder sb = new StringBuilder();
        Scanner iScanner = new Scanner(System.in);
        String data = iScanner.nextLine();
        iScanner.close();
        String Newdata = data.replaceAll(", ", " AND ");

        sb.append(Newdata);
        for(int i = 0; i < sb.length(); i++)
        {
            if(sb.charAt(i) == '{' || sb.charAt(i) =='}' || sb.charAt(i) =='"')
            {
                sb.setCharAt(i, ' ');
            }
            if(sb.charAt(i) == ':')
            {
                sb.setCharAt(i, '=');
            }
        }
        System.out.print("select * from students where");
        System.out.print(sb);
    }   
}
/* Усовие задачи ОЧЕНЬ не понятное, что конкрено требовалось не понятно, сделал как в образце и объясняли на семинарах */