package Module.Task3;

public class Task3 {
    public static void main(String[] args) {
        int[] mas = new int[10];
        System.out.print("Массив: ");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 10);
            System.out.print(mas[i]+" ");
        }
        System.out.println(" ");
        System.out.println("Кол-во различных элементов массива: "+ differentCounter(mas));
    }

    static int differentCounter(int[] mas){
        int counter = 0;
        int differCounter = 0;
        int result = 0;
        for (int i = 0; i < mas.length; i++) {
            counter++;
            for (int j = i + 1; j < mas.length; j++) {
                if (mas[j] == mas[i]) {
                    differCounter++;
                    break;
                }
            }
        }
        return result = (differCounter - counter)*(-1);
    }
}
