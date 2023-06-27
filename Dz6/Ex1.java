package Java.Dz6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1 
{
    public static void main(String[] args) 
    {
        List<Notebook> notebooks = new ArrayList<>();

        Notebook Lenovo = new Notebook();
        Lenovo.name = "Lenovo";
        Lenovo.ozu = 8;
        Lenovo.memory = 500;
        Lenovo.op = "Windows 8";
        Lenovo.color = "Black";
        notebooks.add(Lenovo);

        Notebook Asus = new Notebook();
        Asus.name = "Asus";
        Asus.ozu = 16;
        Asus.memory = 500;
        Asus.op = "Windows 10";
        Asus.color = "White";
        notebooks.add(Asus);

        Notebook Msi = new Notebook();
        Msi.name = "Msi";
        Msi.ozu = 16;
        Msi.memory = 1000;
        Msi.op = "Windows 10";
        Msi.color = "Grey";
        notebooks.add(Msi);

        Notebook Huawei = new Notebook();
        Huawei.name = "Huawei";
        Huawei.ozu = 32;
        Huawei.memory = 1500;
        Huawei.op = "Windows 10";
        Huawei.color = "Silver";
        notebooks.add(Huawei);

        Notebook Xiaomi = new Notebook();
        Xiaomi.name = "Xiaomi";
        Xiaomi.ozu = 64;
        Xiaomi.memory = 2000;
        Xiaomi.op = "Windows 11";
        Xiaomi.color = "Gold";
        notebooks.add(Xiaomi);

        System.out.print("1 - ОЗУ\n2 - Объем ЖД\n3 - Операционная система\n4 - Цвет\n5 - Выход\nВведите цифру, соответствующую необходимому критерию: ");
        Scanner iScanner = new Scanner(System.in);
        int select = iScanner.nextInt();
        System.out.println();
        while (select != 5)
        {
            switch (select)
            {
            case 1:
            System.out.print("Введите минимальное количество ОЗУ (Гб): ");
            int OzuSelect = iScanner.nextInt();
            System.out.println();
            for (Notebook notebook : notebooks) 
            {
                if (notebook.ozu >= OzuSelect) 
                {
                    System.out.println();
                    System.out.println(notebook);
                }
            }
            System.out.println("1 - ОЗУ\n2 - Объем ЖД\n3 - Операционная система\n4 - Цвет\n5 - Выход\nВведите цифру, соответствующую необходимому критерию: ");
            select = iScanner.nextInt();
            continue;
            case 2:
            System.out.print("Введите минимальное количество ЖД (Гб): ");
            int memorySelect = iScanner.nextInt();
            System.out.println();
            for (Notebook notebook : notebooks) 
            {
                if (notebook.memory >= memorySelect) 
                {
                    System.out.println();
                    System.out.println(notebook);
                }
            }
            System.out.println("1 - ОЗУ\n2 - Объем ЖД\n3 - Операционная система\n4 - Цвет\n5 - Выход\nВведите цифру, соответствующую необходимому критерию: ");
            select = iScanner.nextInt();
            continue;
            case 3:
            System.out.print("Введите операционную систему (Windows 8/10/11): ");
            String opSelect = iScanner.nextLine();
            String opSelect1 = iScanner.nextLine();
            System.out.println();
            for (Notebook notebook : notebooks) 
            {
                if (notebook.op.equals(opSelect1))
                {
                    System.out.println();
                    System.out.println(notebook);
                }
            }
            System.out.println("1 - ОЗУ\n2 - Объем ЖД\n3 - Операционная система\n4 - Цвет\n5 - Выход\nВведите цифру, соответствующую необходимому критерию: ");
            select = iScanner.nextInt();
            continue;
            case 4:
            System.out.print("Введите цвет (Black/White/Grey/Silver/Gold): ");
            String colorSelect = iScanner.nextLine();
            String colorSelect1 = iScanner.nextLine();
            System.out.println();
            for (Notebook notebook : notebooks) 
            {
                if (notebook.color.equals(colorSelect1))
                {
                    System.out.println();
                    System.out.println(notebook);
                }
            }
            System.out.println("1 - ОЗУ\n2 - Объем ЖД\n3 - Операционная система\n4 - Цвет\n5 - Выход\nВведите цифру, соответствующую необходимому критерию: ");
            select = iScanner.nextInt();
            continue;
            default :
            System.out.println("Нету такой кнопки");
            System.out.println();
            System.out.println("1 - ОЗУ\n2 - Объем ЖД\n3 - Операционная система\n4 - Цвет\n5 - Выход\nВведите цифру, соответствующую необходимому критерию: ");
            select = iScanner.nextInt();
            continue;
            }
        }
        if (select == 5);
        {
            System.out.println("До свидания");
        }
        iScanner.close();
    }
}
