import java.util.Scanner;

public class SubTask_2 {
    public Main() {
    }

    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.print("Введите 5 любых чисел массива через пробел: ");

        int i;
        for(i = 0; i < array.length; ++i) {
            array[i] = in.nextInt();
        }

        System.out.println("Элементы массива в обратном порядке: ");

        for(i = array.length - 1; i >= 0; --i) {
            System.out.print(array[i] + " ");
        }

    }
}