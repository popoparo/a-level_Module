package Module.Task1;


import java.util.ArrayList;
import java.util.Scanner;

public class Fuckulty {
    public static int averageMark;
    public static  String[] subjects = {"English", "Programm", "Ddos"};
    public static ArrayList<String> students = new ArrayList<String>();


    public Fuckulty(String[] subjects, int averageMark) {
        this.averageMark = averageMark;
        this.subjects = subjects;
        exam();
    }
    public static void sredMark(){
        for (int i = 0; i<Teacher.marks.size(); i++){
            setAverageMark(getAverageMark()+Teacher.marks.get(i));
        }
        setAverageMark(getAverageMark()/Teacher.marks.size());
    }

    public static void exam(){
        for (int i =0; i<subjects.length; i++){
            System.out.println("Нажмите 1 чтобы сдать экзамен");
            System.out.println(subjects[i]);
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                System.out.println("Вы сдали экзамен");
            }
        }

    }

    public static int getAverageMark() {
        return averageMark;
    }

    public static void setAverageMark(int averageMark) {
        Fuckulty.averageMark = averageMark;
    }
}
