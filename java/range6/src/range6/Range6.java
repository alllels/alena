/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package range6;
import java.util.Scanner;
public class Range6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr=new int[15];
        System.out.print("Введите нижниюю границу ");
        int a = sc.nextInt();
        System.out.print("Введите верхнюю границу ");
        int b = sc.nextInt();
        int c = b - a;
        for(int i=0; i<15; i++){
        arr[i] = a + (int)(Math.random()*c);
            System.out.print(arr[i]+" ");
    }
    int j = 0;
    int e = 0;
    
    for(int i=0; i<15;i++){
    if(arr[i]%2==0){
        j++;
    }else {
        e++;
    }
    }
    System.out.println("\nКоличество четных чисел: " + j); 
    System.out.println("\nКоличество нечетных чисел: " + e);
    }
    
  
    }

    

