package Home.HW5;

/* 
    1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
       что один человек может иметь несколько телефонов.
*/

/* 
import java.util.*;
import java.util.regex.Pattern;

public class project5 
{
    private static Pattern p = Pattern.compile("^[a-zA-Z]*$");
    
    // проверка того, что ФИ состоит только из букв
    public static boolean isAlpha(String s) {
        return p.matcher(s).find();
    }

    public static Map addNewContact(Map<String, ArrayList> telephoneBook, String name, String phone) 
    {
        // добавление контакта в базу с учетом того, что его там еще нет
        if(!telephoneBook.containsKey(name))
        {
            ArrayList<String> numPhone = new ArrayList<>();
            numPhone.add(phone);
            telephoneBook.put(name, numPhone);
        }
        // привязываем второй номер контакту, если он не такой же, какой уже есть в базе
        else if(telephoneBook.containsKey(name) & telephoneBook.containsValue(phone))
        {
            ArrayList<String> numPhone = telephoneBook.get(name);
            numPhone.add(phone);
            telephoneBook.put(name, numPhone);
        }
        return telephoneBook;
    }


    public static void main(String[] args)
    {
        boolean flag = true;
        Integer operations = 0;
        Scanner scanner = new Scanner(System.in);
        Map<String, ArrayList> humanAndPhone = new HashMap<>();

        while(flag)
        {
            if(operations == 0)
            {
                System.out.print("Введите ФИ контакта: ");
                String strName = scanner.nextLine().trim();
                if(!isAlpha(strName.replace(" ", "")))
                {
                    System.out.println("Введены неккоректные данные!");
                    continue;
                }

                String regex = "\\d+";
                System.out.print("Введите номер контакта: ");
                String strPhone = scanner.nextLine().trim();
                if(!strPhone.matches(regex))
                {
                    System.out.println("Введены неккоректные данные! Вернемся в самое начало.");
                    continue;
                }
                addNewContact(humanAndPhone, strName, strPhone);                
            }
            
            System.out.println("Выберите цифру: 1- добавить контакт, 2- вывести контакты, 3- выйти");
            String mod = scanner.nextLine();
            if(mod.equals("1"))
            {
                operations = 0; 
            }
            else if(mod.equals("2"))
            {
                for(String key: humanAndPhone.keySet())
                {
                    System.out.printf("Контакт - %s. Телефон - %s.\n", key, humanAndPhone.get(key));
                }
                
                operations++;
            }
            else if(mod.equals("3")) flag = false;
            else
            {
                System.out.println("Вы ввели неккоректные данные. Программа закрывается");
                return;
            }
        }
        scanner.close();
    }
}
*/



/*
    2. Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. 
       Написать программу, которая найдет и выведет повторяющиеся имена с 
       количеством повторений. Отсортировать по убыванию популярности. 
*/

/* 
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.TreeMap;

public class project5 
{

    public static ArrayList<String> generateListNames() 
    {
        Random rand = new Random();
        String [] names = {"Ivan", "Nicola", "Maks", "Vlad", "Roman", "Alexander"};
        ArrayList<String> namesList = new ArrayList<>();

        for(int i = 0; i < 15; i++) namesList.add(names[rand.nextInt(names.length)]);
        return namesList;
    }

    public static TreeMap<String, Integer> popularitySorting(ArrayList<String> namesList) 
    {
        TreeMap<String, Integer> resultList = new TreeMap<>();

        for(String value: namesList)
        {
            Integer count = 0;

            for(int i = 0; i < namesList.size(); i++)
            {
                if(value.equals(namesList.get(i))) count++;            
            }  

            if(resultList.containsKey(value) == false) resultList.put(value, count);
        }
        return resultList;
    }

    public static void popularityPrint(TreeMap<String, Integer> popularityList)
    {
        Collection<String> keys = popularityList.keySet();
        
        while(keys.size() > 0)
        {
            Integer maxCount = 0;
            String name = "";
            for(String ky: keys)
            {
                if(popularityList.get(ky) > maxCount)
                {
                    maxCount = popularityList.get(ky);
                    name = ky;
                }
            }
            System.out.printf("%s - %d раз(а)\n", name, maxCount);
            keys.remove(name);
        }
    }

    public static void main(String[] args)
    {
        ArrayList<String> namesList = generateListNames();
        //System.out.println(namesList); для наглядной проверки 
        TreeMap<String, Integer> popularityList = popularitySorting(namesList);
        //System.out.println(popularityList); для наглядной проверки 
        popularityPrint(popularityList);
    }
}
*/



/*
    3. Реализовать алгоритм пирамидальной сортировки (HeapSort).
*/

/* 
public class project5
{
    public void sort(int arr[])
    {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i=n-1; i>=0; i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

     void heapify(int arr[], int n, int i)
    {
        int largest = i; 
        int l = 2*i + 1; 
        int r = 2*i + 2;

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String args[])
    {
        int arr[] = {12, 11, 13, 5, 6, 7};

        project5 ob = new project5();
        ob.sort(arr);

        System.out.print("Отсортированный массив: ");
        printArray(arr);
    }
}
*/