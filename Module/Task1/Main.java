package Module.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя студента");
        Student.setName(Fuckulty.students.add(scanner.nextLine()));
        Fuckulty.exam();
        System.out.println("Поздравляем, вы сдали все экзамены");
        scanner.nextLine();
        System.out.println("Введите имя преподавателя");
        Teacher.setName(scanner.nextLine());
            new Teacher();
            Fuckulty.sredMark();
        if (Fuckulty.getAverageMark()>50){
            System.out.println("Студент прошёл в универ");
            System.out.println("Студент: "+Fuckulty.students.get(0));
            System.out.println("Экзаменатор: "+ Teacher.getName());
            System.out.println("Средний бал: " + Fuckulty.getAverageMark());
            System.out.println("Оценки за экзамены: ");
            for (int i = 0; i<Fuckulty.subjects.length; i++){

                    System.out.println(Fuckulty.subjects[i] +":"+ Teacher.marks.get(i));
                }
            }
        else {
            System.out.println("Студент не прошёл в универ");
            System.out.println("Студент: "+ Fuckulty.students.get(0));
            System.out.println("Экзаменатор: "+ Teacher.getName());
            System.out.println("Средний бал: " + Fuckulty.getAverageMark());
            System.out.println("Оценки за экзамены: ");
            for (int i = 0; i<Fuckulty.subjects.length; i++){
                    System.out.println(Fuckulty.subjects[i] +":"+ Teacher.marks.get(i));
                }
            }
        }
    }

