package Home.HW3;

/*
    1. Реализовать алгоритм сортировки слиянием.
*/

/* 
import java.util.Arrays;

public class project3
{
    public static int[] mergeSort(int[] sortArr)
    {
        int[] buffer1 = Arrays.copyOf(sortArr, sortArr.length);
        int[] buffer2 = new int[sortArr.length];
        int[] result = mergeSortInner(buffer1, buffer2, 0, sortArr.length);
        return result;
    }

    public static int[] mergeSortInner(int[] buffer1, int[] buffer2, int startIndex, int endIndex) 
    {
        if (startIndex >= endIndex - 1) 
        {
            return buffer1;
        }

        //уже отсортирован
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);

        //слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;

        while (index1 < middle && index2 < endIndex) 
        {
            result[destIndex++] = sorted1[index1] < sorted2[index2] ? sorted1[index1++] : sorted2[index2++];
        }

        while (index1 < middle)
        {
            result[destIndex++] = sorted1[index1++];
        }

        while (index2 < endIndex)
        {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
    
    public static void main(String args[]) {
        int[] sortArr = {12, 6, 4, 1, 15, 10};
        int[] result = mergeSort(sortArr);
        System.out.println(Arrays.toString(result));
    }
}
*/



/*
    2. Пусть дан произвольный список целых чисел. Удалить из него чётные числа. 
*/

/*
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;


public class project3
{
    private static ArrayList<Integer> arrayGenerate(int size)
    {  
        Random rand = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < size; i++ ) arr.add(rand.nextInt(21));
        return arr;
    }

    private static ArrayList<Integer> arrayFilter(ArrayList<Integer> numList)
    {
        for(int i = 0; i < numList.size(); i++)
        {
            if(numList.get(i) % 2 == 0 )
            {
                numList.remove(i);
                i--;
            }
        }
        return numList;

    }
    
    public static void main(String[] args)
    {
        System.out.print("Введите размерность списка: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        in.close();

        ArrayList<Integer> numberList = arrayGenerate(size);
        ArrayList<Integer> workArray = (ArrayList<Integer>) numberList.clone();
        ArrayList<Integer> resultList = arrayFilter(workArray);

        System.out.printf("Сгенерированный список: %s \nОтфильрованный список: %s",
                         numberList, resultList);
    }
}
*/



/*
    3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и
    среднее арифметичское этого списка.
*/

/*
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class project3
{
    private static ArrayList<Integer> arrayGenerate(int size)
    {  
        Random rand = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < size; i++ ) arr.add(rand.nextInt(21));
        return arr;
    }

    private static ArrayList scanerValue(ArrayList<Integer> arList)
    {
        ArrayList res = new ArrayList<>();

        int min = arList.get(0);
        int max = arList.get(1);
        int sum = 0;

        for(int i = 0; i < arList.size(); i++ )
        {
            if(arList.get(i) < min) min = arList.get(i);
            if(arList.get(i) > max) max = arList.get(i);
            sum += arList.get(i);
        }

        res.add(min);
        res.add(max);
        res.add((double)sum / arList.size());

        return res;
    }

    public static void main(String[] args)
    {
        System.out.print("Введите размерность списка: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        in.close();

        ArrayList<Integer> numberList = arrayGenerate(size);
        System.out.printf("Сгенерированный список целых чисел: %s \n", numberList);

        ArrayList resultValue = scanerValue(numberList);
        System.out.printf("min = %d, max = %d, sr = %.1f", resultValue.get(0), resultValue.get(1), 
                        resultValue.get(2)); 
    }
}
*/