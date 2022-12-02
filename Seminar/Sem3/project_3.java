package Seminar.Sem3;


/*
    1. Заполнить список 10 случайными числами. Отсортировать список методом sort(),
    и вывеси его на экран  
*/

/*
import java.util.ArrayList;
import java.util.Random;

public class project_3 
{
    public static void main(String[] args) 
    {
        Random rand = new Random();
        
        ArrayList<Integer> intList = new ArrayList<>(10);

        for(int i = 0; i < 10 ; i++) intList.add(rand.nextInt(15));
        
        System.out.println(intList.toString());

        intList.sort(new IntegerComporator()); // intList.sort(null) - или так вот можно 

        System.out.println(intList.toString()); 

    }
}
*/



/*
    2. Заполните список названиями планет солнечной системы в произвольном порядке
    с повторениями. Вывести название каждой планеты и количество его повторений в списке.
*/

/*
import java.util.ArrayList;
import java.util.Random;

class project_3
{
    public static void main(String[] args)
    {
        String[] planetStr = {"Меркурий", "Венера", "Земля", "Марс", "Юпитер","Сатурн", "Нептун", "Уран"};
        ArrayList<String> repeetPlanet = new ArrayList<>();
        Random rand = new Random();
        
        for(int i = 0; i < 10; i++)
        {
            repeetPlanet.add(planetStr[rand.nextInt(8)]);
        }

        System.out.println(repeetPlanet.toString());
        
        ArrayList<String> moutPlanet = new ArrayList<>(); // список отсканированных планет

        for(String value: repeetPlanet)
        {
            Integer count = 0;

            for(int i = 0; i < repeetPlanet.size(); i++)
            {
                String value2 = repeetPlanet.get(i);
                if(value.equals(value2)) 
                {
                    count++;            
                }
            }  

            if(moutPlanet.contains(value) == false)
            {
                System.out.println(value + " " + count + " раз");
                moutPlanet.add(value);
            }
            
        }

    }
}
*/



/*
    3. Создать список типа ArrayList<String>.
    Поместить в него как строки, так и целые числа.
    Пройтись по списку, найти и удалить целые числа.
*/

 /*
import java.util.ArrayList;
import java.util.Random;

class project_3
{
    public static void main(String[] args) 
    {
        ArrayList strList = new ArrayList<String>();
        strList.add("Это");
        strList.add(23);
        strList.add(23);
        strList.add("И это");
        strList.add(33);  
        
        for(int i = 0; i < strList.size(); i++)
        {
            if(strList.get(i) instanceof Integer)
            {
                strList.remove(i);
                i--;  // костыль для воизбежания пропуска элементов
            }

        }
        System.out.println(strList.toString());


    }
}
*/