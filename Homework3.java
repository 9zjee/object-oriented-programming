import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count, max, min;

        System.out.println("몇 개의 수를 입력할 예정인가요? ");
        count = scanner.nextInt();

        int[] numbers = new int[count];

        System.out.println("수를 입력하세요: ");

        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        min = numbers[0];
        max = numbers[0];

        for (int i = 1; i < count; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.printf("최대값: %d\n", max);
        System.out.printf("최소값: %d\n", min);



    }
}