/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcul;
import java.util.Scanner;


public class Calcul {
    public static void main(String[] args) {
        System.out.println("Введита операцию");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        //Микушина Надежда Эдуардовна
        Scanner scanner = new Scanner (System.in);
        int operation = scanner.nextInt();
        
        System.out.println("Введите первое число: ");
        int x = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int y = scanner. nextInt();
        
        int result =0；
        
        if (operation == 1)
            result = x + y;
        else if (operation == 2)
            result = x - y;
        else if (operation == 3)
            result=x*y;
        else if (operation == 4)
            result = x / y;
        System.out.println ("Результат = " + result);
        System.out.println("Микушина");
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
