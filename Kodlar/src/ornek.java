import java.util.Scanner;

public class ornek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int counter = 1;
        int grade;
        while (counter <= 10) {
            grade = input.nextInt();
            total += grade;
            counter++;
        }
        int avg = total / counter;
        System.out.println("Avg: " + avg);
    }
}
