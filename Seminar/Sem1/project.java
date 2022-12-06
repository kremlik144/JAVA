package Seminar.Sem1;
// import java.util.Scanner;
// import java.util.ArrayList;
// import java.lang.Integer;


/* 
 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
    n! (произведение чисел от 1 до n) 
*/

/* 
public class project {
    public static void main (String args[]){
        System.out.print("Enter the number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int factorial_num = 1;
        for(int i = 1; i < num + 1; i++){
            factorial_num *= i;           
        }
        
        double triangular_number = (num * (num + 1)) * 0.5;

        System.out.printf("Your number = %d; Triangular number = %.0f; %d! = %d",
                          num, triangular_number, num, factorial_num);

    }
}
*/



/* 
 2. Вывести все простые числа от 1 до 1000  
*/
/* 
public class project {
    public static void main (String args[]){
        int right_border = 1000;
        ArrayList<Integer> arr_lst = new ArrayList<Integer>();
       
        for(int i = 2; i < right_border; i++){
            int count = 0;
            for(int j = 1; j <= i+1; j++){
                if(i % j == 0) count++;
            }
            if(count == 2) arr_lst.add(i);          
        }  
        System.out.print(arr_lst);
    }
}
*/



/* 
 3. Реализовать простой калькулятор  
*/
/*  
public class project {
    public static void main (String args[]){
        
        System.out.print("Enter the first number: ");
        Scanner in1 = new Scanner(System.in);
        int num1 = in1.nextInt();

        System.out.print("Enter an arithmetic operation(+, -, *, /): ");
        Scanner in2 = new Scanner(System.in);
        String operation = in2.nextLine();

        System.out.print("Enter the second number: ");
        Scanner in3 = new Scanner(System.in);
        int num2 = in3.nextInt();

        switch(operation){
            case "+":
                System.out.printf("%d + %d = %d", num1, num2, num1+num2);
                break;
            case "-": 
                System.out.printf("%d - %d = %d", num1, num2, num1-num2);
                break;
            case "*": 
                System.out.printf("%d * %d = %d", num1, num2, num1*num2);
                break;
            case "/": 
                float new_num1 = num1;
                System.out.printf("%d / %d = %f", num1, num2, new_num1/num2);
                break;
        } 

        in1.close();
        in2.close();
        in3.close(); 
    }
}
*/



/*  
4. *Задано уравнение вида q + w = e, q, w, e >= 0. 
    Некоторые цифры могут быть заменены знаком вопроса, например 1? + ?5 = 69.
    Требуется восстановить выражение до верного равенства. Предложить хотя 
    бы одно решение или сообщить, что его нет.
*/
/* 
public class project {
    public static void main (String args[]){

        // уравнение 1? + ?5 = 69
        
        boolean flag = false;

        for(int i = 0; i <=9; i++){

            String num1 = "1" + i;
            Integer x = new Integer(num1);

            for(int j = 1; j <= 6; j++){
                String num2 = j + "5";
                Integer y = new Integer(num2);
        
                if(x + y == 69){
                    System.out.printf("%d + %d = 69", x, y);
                    flag = true;
                }
            }
        }
        if(flag == false) System.out.print("Решений нет");
       
    }
}
*/