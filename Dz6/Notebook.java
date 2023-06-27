package Java.Dz6;

public class Notebook 
{
    int ozu;
    int memory;
    String op;
    String color;
    String name;

    @Override
    public String toString() 
    {
        String res = String.format("Ноутбук: %s\nКоличество ОЗУ (Гб): %d\nКоличество памяти ЖД (Гб): %d\nОперационная система: %s\nЦвет: %s\n", name, ozu, memory, op, color);
        return res;
    }
}
