package Module.Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int randNumber = 1 + (int) (Math.random() * 15);
        Scanner scanner = new Scanner(System.in);
        int o = 5;
        for (int k = 1; k <= 5; k++) {
            System.out.println("Количество попыток:" + o);
            o--;
            System.out.println("Введи число от 1-го до 15-ти:");
            int a = scanner.nextInt();
            if (a == randNumber) {
                System.out.println("Congratulation");
                break;
            } else {
                System.out.println("Ошибка");
                if (a>randNumber){
                    System.out.println("Бери меньше");
                }
                else{
                    if (a<randNumber){
                        System.out.println("Бери больше");
                    }
                }
            }
        }
        System.out.println("Иди нахуй!");

    }
}