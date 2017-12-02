package Module.Task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scannerStart = new Scanner(System.in);
        Scanner scannerStep = new Scanner(System.in);

        System.out.println("Введите координату Х начала(От 0 до 8)");
        int xStart = scannerStart.nextInt();
        System.out.println("Введите координату Y начала(От 0 до 8)");
        int yStart = scannerStart.nextInt();
        System.out.println("Начальная точка: " + "(" + xStart + ":" + yStart +")");
        while (true) {
            System.out.println("Введите Х хода");
            int xStep = scannerStep.nextInt();
            System.out.println("Введите Y хода");
            int yStep = scannerStep.nextInt();
            if (
                    (xStep == xStart - 2 && yStep == yStart - 1) ||
                            (xStep == xStart - 2 && yStep == yStart + 1) ||
                            (xStep == xStart + 2 && yStep == yStart - 1) ||
                            (xStep == xStart + 2 && yStep == yStart + 1) ||
                            (yStep == yStart - 2 && xStep == xStart - 1) ||
                            (yStep == yStart - 2 && xStep == xStart + 1) ||
                            (yStep == yStart + 2 && xStep == xStart - 1) ||
                            (yStep == yStart + 2 && xStep == xStart + 1)

                                    && xStep <= 8 && xStep >= 0
                                    && yStep <= 8 && yStep >= 0)

            {
                System.out.println("Вы походили на: " + "(" + xStep + ":" + yStep + ")");
            } else {
                System.out.println("Неправилный ход");
            }
        }
    }
}
