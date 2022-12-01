package Lecture.Lec3;

// Работа с элементами коллекции ArrayList

import java.util.ArrayList; // Импортируем класс

public class ArrayList_01
{
   public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<Integer>(); // явно указываем теп данных котоорый будет храниться 
       // ArrayList list = new ArrayList(); сырой тип Odject, возможны ошибки 
       list.add(2809);


       for (Object o : list) {
           System.out.println(o);
       }
   }
}
