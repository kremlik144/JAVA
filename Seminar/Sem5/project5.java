package Seminar.Sem5;

/*
    1. Даны 2 строки, написать метод, который вернет true, если эти строки
    являются изоморфными и false, если нет.Строки изоморфны, если одну букву
    в первом слове можно заменить на некоторую букву во втором слове, при этом: 
    - повторяющиеся буквы одного слова меняются на одну и ту же букву с
    сохранением порядка следования. 
    (Например, add - egg изоморфны)
    - буква может не меняться, а остаться такой же. (Например, note - code)

    Пример 1:
    Input: s = "foo", t = "bar"
    Output: false

    Пример 2:
    Input: s = "paper", t = "title"
    Output: true
*/

/* 
import java.util.*;

public class project5 
{
    public static boolean isMorphic(String strIn, String strOut)
    {
        if(strIn.length() != strOut.length()) return false;

        Map<Character, Character> encoding = new HashMap<>();

        for(int i = 0; i < strIn.length(); i++)
        {
            if(encoding.containsKey(strIn.charAt(i)))
            {
                if(!encoding.get(strIn.charAt(i)).equals(strOut.charAt(i))) return false;
            } else encoding.put(strIn.charAt(i), strOut.charAt(i));
        }
        return true;        
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Входная строка: ");
        String strIn = scanner.nextLine();
        System.out.println("Выходная строка: ");
        String strOut = scanner.nextLine();

        System.out.println(isMorphic(strIn, strOut));

        scanner.close();
    }
}
*/



/*
    2. Написать программу, определяющую правильность расстановки скобок в выражении.
    Пример 1: a+(d*3) - истина
    Пример 2: [a+(1*3) - ложь
    Пример 3: [6+(3*3)] - истина
    Пример 4: {a}[+]{(d*3)} - истина
    Пример 5: <{a}+{(d*3)}> - истина
    Пример 6: {a+]}{(d*3)} - ложь

*/

/* 
import java.util.*;

public class project5 
{
    public static boolean checkBrackers(String strIn, Map<Character, Character> bracking)
    {
        Deque<Character> stack = new ArrayDeque<>();
        
        for(int i = 0; i < strIn.length(); i++)
        {   
            // проверяем является ли символ открывающейся скобкой 
            if(bracking.containsKey(strIn.charAt(i))) stack.add(strIn.charAt(i));

            // проверяем является ли символ закрывающейся скобкой 
            else if(bracking.containsValue(strIn.charAt(i))) 
            {
                if(stack.isEmpty()) return false;
                char openingBr = stack.pollLast() ;
                if(strIn.charAt(i) != bracking.get(openingBr)) return false;
            }
        }
        return stack.isEmpty(); // упрощенная и укороченная запись 
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Входная строка: ");
        String strIn = scanner.nextLine();
        scanner.close();

        Map<Character, Character> bracking = new HashMap<>();

        bracking.put('<', '>');
        bracking.put('{', '}');
        bracking.put('[', ']');
        bracking.put('(', ')');
        
        System.out.println(checkBrackers(strIn, bracking));
    } 
}
*/