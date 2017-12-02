package Module.Task1;


import java.util.ArrayList;
import java.util.Scanner;



public class Teacher {
    private static int mark;
    private static String name;
    public static ArrayList<Integer> marks = new ArrayList<Integer>();

    public Teacher() {


        for (int j = 0; j < Fuckulty.students.size(); j++) {
            System.out.println("Студент: " + Fuckulty.students.get(j));
            for (int k = 0; k < Fuckulty.subjects.length; k++) {
                System.out.println("Поставьте оценку за экзамен: " + Fuckulty.subjects[k]);
                Scanner scanner = new Scanner(System.in);
                marks.add(setMark(scanner.nextInt()));

            }

        }

    }


    public static int getMark() {
        return mark;
    }

    public static Integer setMark(Integer mark) {
        return mark;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Teacher.name = name;
    }
}

