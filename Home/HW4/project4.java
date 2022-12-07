package Home.HW4;

/*
    1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод,
    который вернет “перевернутый” список.
*/

/* 
import java.util.LinkedList;
import java.util.ArrayDeque;

public class project4 
{
    public static ArrayDeque<Integer> coup (LinkedList <Integer> firstList)
    {
        ArrayDeque<Integer> lastList = new ArrayDeque<>();
        for(Integer num: firstList) lastList.addFirst(num);
        return lastList;
    }

    public static void main(String[] args) 
    {
        LinkedList<Integer> initialList = new LinkedList<>();
        for(int i = 1; i < 6; i++) initialList.add(i);
        
        ArrayDeque<Integer> result = coup(initialList); 
        System.out.printf("Исходный список: %s\nПеревернутый список: %s", initialList,
                         result);
    }   
}
*/



/* 
    2. Реализуйте очередь с помощью LinkedList со следующими методами:
    enqueue() - помещает элемент в конец очереди,
    dequeue() - возвращает первый элемент из очереди и удаляет его,
    first() - возвращает первый элемент из очереди, не удаляя.
*/

/* 
import java.util.LinkedList;

public class project4 
{
    public static void enqueue(LinkedList<Integer> list, int number)
    {
        list.addLast(number);
    } 

    public static Integer dequeue(LinkedList<Integer> list)
    {
        Integer first = list.removeFirst();
        return first;
    } 

    public static Integer first(LinkedList<Integer> list)
    {
        Integer first = list.getFirst();
        return first;
    }

    public static void main(String[] args) 
    {
        LinkedList<Integer> initialList = new LinkedList<>();
        for(int i = 1; i < 6; i++) initialList.add(i);

        System.out.printf("Изначальный список - %s\n", initialList);

        enqueue(initialList, 10);
        System.out.printf("Список после метода enqueue() - %s\n", initialList);

        Integer firstRemove = dequeue(initialList);
        System.out.printf("Список после метода dequeue() - %s. 1-й элемент - %d\n",
                         initialList, firstRemove);
        
        Integer firstGet = first(initialList);
        System.out.printf("Список после метода first() - %s. 1-й элемент - %d\n",
                         initialList, firstGet);
    }
}
*/