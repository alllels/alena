/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");
        double s = sc.nextDouble();
        double poluch = 0;
        
        // Определение процента в зависимости от суммы вклада
        switch ((int) s / 100) { 
            case 0:
                poluch = 0.05; // 5%
                break;
            case 1:
                poluch = 0.07; // 7%
                break;
            case 2:
                poluch = 0.10; // 10%
                break;
            default:
                poluch = 0.10; // 10% для сумм больше 200
                break;
        }

        // Расчет итоговой суммы
        double vse = s + (s * poluch);
        
        // Вывод результата
        System.out.printf("Процент по вкладу " + poluch + ", полученнная сумма после начисления процентов " + vse);
        
        sc.close(); // Закрываем объект sc
    }
}


