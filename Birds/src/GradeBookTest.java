import java.util.Scanner;

import javax.swing.text.html.StyleSheet;

public class GradeBookTest {
    public static void main(String[] args) {
        GradeBook m = new GradeBook();
        m.displayInfo();

        GradeBook n = new GradeBook("Java","Yellow","Ali");
        n.displayInfo();

        n.setTitle("Cekap");
        
        n.displayInfo();

        Scanner input = new Scanner(System.in);

        System.out.print("Şimdi sana gönderdiğim değerleri gir : ");
        String title = input.nextLine();
        String color = input.nextLine();
        String teacher = input.nextLine();

        GradeBook x =  new GradeBook(title,teacher,color);
        x.displayInfo();
        color = input.nextLine();
        x.setColor(color);
        x.displayInfo();
    }
}
