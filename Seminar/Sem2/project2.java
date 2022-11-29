package Seminar.Sem2;

import java.io.*;
import java.util.Scanner;

/*
1. В файле содержится строка с исходными данными в такой форме:
   {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
   Требуется на её основе построить и вывести на экран новую строку,
   в форме SQL запроса:
   SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";

   Для разбора строки используйте String.split. 
   Сформируйте новую строку, используя StringBuilder. 
   Значения null не включаются в запрос.
*/

/* 
class project2{
    public static void main(String[] args){
        String lineFromFile = "";
        StringBuilder resultLine = new StringBuilder("SELECT * FROM students WHERE ");

        try
        {
            FileReader reader = new FileReader("Seminar\\Sem2\\task_1.txt");
            Scanner scan = new Scanner(reader);

            while(scan.hasNextLine()){
                lineFromFile = scan.nextLine();
                lineFromFile = lineFromFile.substring(1, (lineFromFile.length()-1));
            }
            reader.close();
            scan.close(); 
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }
        
        String [] arrayAllData = lineFromFile.split(",");
        int count = 0;

        for(String line: arrayAllData){
            line = line.trim();
            String [] arrayKeyVal = line.split(":");
            String key = arrayKeyVal[0].substring(1, (arrayKeyVal[0].length()-1));
            String value = arrayKeyVal[1].substring(1, (arrayKeyVal[1].length()-1));
            char dm = (char)34;

            if(value.compareTo("null") != 0 && count == 0){
                resultLine.append(key);
                resultLine.append(" = ");
                resultLine.append(dm + value + dm);
                count++;
                continue;
            }
            if(value.compareTo("null") != 0 && count == 1){
                resultLine.append(" AND ");
                resultLine.append(key);
                resultLine.append(" = ");
                resultLine.append(dm + value + dm);
            }
        }

        System.out.println("SQL запрос: " + resultLine);
    
    }
}
*/



/*
2. Реализуйте алгоритм сортировки пузырьком числового массива,
   результат после каждой итерации запишите в лог-файл.
*/

class project2{
    public static void main(String[] args){

    }
}




/*
3. В файле содержится строка с данными:
   [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, 
   {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, 
   {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

   Напишите метод, который разберёт её на составные части и,
   используя StringBuilder создаст массив строк такого вида:

   Студент Иванов получил 5 по предмету Математика.
   Студент Петрова получил 4 по предмету Информатика.
   Студент Краснов получил 5 по предмету Физика.
 
 */