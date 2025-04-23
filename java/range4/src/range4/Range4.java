/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package range4;
import java.util.Scanner;
public class Range4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr=new int[15];
        
        System.out.print("Введите нижнюю границу: ");
        int a = sc.nextInt(); //начало
        System.out.print("Введите верхнюю границу: ");
        int b = sc.nextInt(); //конец
        
        int c = b - a;
        
        for(int i = 0; i <15; i++){
            arr[i] = a + (int)(Math.random()*c);
            System.out.print(arr[i]+" ");
        }
    }
    
}
