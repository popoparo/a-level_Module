package Module.Task5;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int x = 8;
        int y = 8;

        Scanner scannerX = new Scanner(System.in);
        Scanner scannerY = new Scanner(System.in);
        Scanner scannerXhod = new Scanner(System.in);
        Scanner scannerYhod = new Scanner(System.in);
        System.out.println("Введите координату Х начала");
        int coordinateX = scannerX.nextInt();
        System.out.println("Введите координату Y начала");
        int coordinateY = scannerY.nextInt();

        System.out.println("Введите Х хода");
        int coordXhod = scannerXhod.nextInt();
        System.out.println("Введите Y хода");
        int coordYhod = scannerYhod.nextInt();

    }
}
