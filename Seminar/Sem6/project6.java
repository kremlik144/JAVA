package Seminar.Sem6;


/*
    1. Напишите метод, который заполнит массив из 1000 элементов 
    случайными числами от 0 до 24. 
    - Создайте метод, в который передайте заполненный выше массив, 
    и с помощью Set вычислите процент уникальных значений в данном массиве,
    и верните его в виде числа с плавающей запятой.

    Для вычисления процента используйте формулу:
    процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
 
*/

/* 
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class project6 
{
    public static int[] createArray(int size)
    {
        Random random = new Random();
        int[] array = new int[size];

        for(int i = 0; i < size; i++)
        {
            array[i] = random.nextInt(25);
        }
        return array;
    }

    public static double createSet(int[] arr) {
        Set<Integer> unik = new HashSet<>();
        for(int value: arr)
        {
            unik.add(value);
        }
        return (double)(unik.size() * 100) / arr.length;
    }

    public static void main(String[] args) 
    {
        int size = 1000;
        int[] arr = createArray(size);     
        System.out.println(createSet(arr));    
    }
}
*/



/*
    2. Продумайте структуру класса Кот. Какие поля и методы будут актуальны 
    для приложения, которое является
    а) информационной системой ветеринарной клиники
    б) архивом выставки котов
    в) информационной системой Театра кошек Ю. Д. Куклачёва
    Можно записать в текстовом виде, не обязательно реализовывать в java.
*/


public class project6 
{
    public static void main(String[] args) 
    {
        Cat mursik = new Cat("Mursik", "Siam", "Ivan Inanow");
        System.out.println(mursik.toString());

        Award award = new Award(1, "Best Cat 2022");
        mursik.addAward(award);
        System.out.println(mursik.toString());
    }
    
}

