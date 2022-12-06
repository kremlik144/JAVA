package Seminar.Sem4;


/*
    1. Реализовать консольное приложение, которое в цикле:
    - Принимает от пользователя строку вида text ~ num
    - Нужно разделить строку по ~, сохранить text в связный список на позицию num.
    - Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
*/

/*
import java.util.Scanner;
import java.util.LinkedList;

public class project4
{
    public static void main(String[] args) 
    {
        LinkedList<String> userLst = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 6; i++)
        {
            System.out.print("Введите строку типа text~num: \n");
            String userInput = sc.nextLine();
    
            String[] parts = userInput.split("~");

            if(parts.length != 2) throw new IllegalStateException("Invalid Input");
            if(parts[0].equals("print")) System.out.println(userLst.remove(Integer.parseInt(parts[1])));
            else userLst.add(Integer.parseInt(parts[1]), parts[0]);
            System.out.println(userLst);
        }

        sc.close();
    }    
}
*/