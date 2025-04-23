/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package range3;

import java.util.Random;

public class Range3 {
    public static void main(String[] args) {
        int chisla = 21;
        int nice = 0;
        int good = 0;
        int ok = 0;
        int bad = 0;

        Random random = new Random();

        System.out.println("Результаты бросков кубиков:");

        for (int i = 0; i < chisla; i++) {
            int poluch = random.nextInt(6) + 1; // Генерация значения от 1 до 6
            System.out.println(poluch + " ");

            if (poluch >= 4) {
                nice++;
            } else if (poluch ==6) {
                good++;
            } else if (poluch == 1) {
                ok++;
            } else {
                bad++;
            }
        }
        System.out.println("Успех: " + nice);
        System.out.println("Критический успех: " + good);
        System.out.println("Критический провал: " + ok);
        System.out.println("Провал: " + bad);
    }
}

    
    
