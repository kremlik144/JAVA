package Seminar.Sem2;

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
import java.io.*;
import java.util.Scanner;

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

/*
import java.util.Scanner;
import java.util.logging.*;
import java.util.Arrays;
import java.io.*;

class project2{
    public static void main(String[] args){
        try
        {
            Logger logger = Logger.getLogger(project2.class.getName());
            FileHandler fh = new FileHandler("Seminar\\Sem2\\task_2_log.txt");
            logger.addHandler(fh);
            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);

            Scanner in = new Scanner(System.in);
            System.out.print("Введите элементы массива через пробел: ");
            String numberLine = in.nextLine();
            in.close();

            String [] numberArrayStr = numberLine.split(" ");
            int [] newNumberArrayInt = new int[numberArrayStr.length];

            for(int i = 0; i < numberArrayStr.length; i++)
            {
                int newNum = Integer.parseInt(numberArrayStr[i]);
                newNumberArrayInt[i] = newNum;
            }

            logger.info("Исходный массив: " + Arrays.toString(newNumberArrayInt));
            boolean isSorted = false;
            int buf;
            int count = 0;
            while(!isSorted)
            {
                isSorted = true;
                for (int i = 0; i < newNumberArrayInt.length-1; i++)
                {
                    count++;
                    if(newNumberArrayInt[i] > newNumberArrayInt[i+1])
                    {
                        isSorted = false;
 
                        buf = newNumberArrayInt[i];
                        newNumberArrayInt[i] = newNumberArrayInt[i+1];
                        newNumberArrayInt[i+1] = buf;
                        logger.info("Операция №" + count + ". Местами поменялись:" + 
                                    buf +" и " + newNumberArrayInt[i]);
                        System.out.println(Arrays.toString(newNumberArrayInt));
                    }
                }
            }
            logger.info("Отсортированный массив: " + Arrays.toString(newNumberArrayInt));

        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }    
        catch(SecurityException ex)
        {
            System.out.println(ex.getMessage());
        }  
    }
}
*/



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

/* 
import java.io.*;
import java.util.Scanner;

class project2{
    public static void main(String[] args)
    {
        String[] demonstrationArr = splitLine();
        for(String y: demonstrationArr) System.out.println(y);
    }

    private static String[] splitLine()
    {
        String lineFromFile = "";

        try
        {
            FileReader reader = new FileReader("Seminar\\Sem2\\task_3.txt");
            Scanner scan = new Scanner(reader);
            
            while(scan.hasNextLine())
            {
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

        String [] arrayLine = lineFromFile.split(", ");
        String [] resultArray = new String[arrayLine.length];
        StringBuilder workLine = new StringBuilder("Студент ");
        int count = 0;
        int countInArr = 0;

        for(String line: arrayLine)
        {
            line = line.substring(1, (line.length()-1));
            String [] arrayKeyVal = line.split(",");
            
            for(String lineKeyVal: arrayKeyVal)
            {
                String [] endArray = lineKeyVal.split(":");
                String value = endArray[1].substring(1, (endArray[1].length()-1));
                
                switch(count)
                {
                    case 0:
                    workLine.append(value);
                    workLine.append(" получил ");
                    count++;
                    break;

                    case 1:
                    workLine.append(value);
                    workLine.append(" по предмету ");
                    count++;
                    break;

                    case 2:
                    workLine.append(value);
                    count = 0;
                    break;
                }

            }
            String stringLine = workLine.toString();
            resultArray[countInArr] = stringLine;
            workLine.delete(8, workLine.length());
            countInArr++;   
        }    
        return resultArray;
    }
}
*/