import java.util.Scanner;

public class Faktoriel {
    public static int bulFaktoriel(int sayi){
        int carpim = 1;
        for (int i = 1 ; i<=sayi ; i++){
           carpim = carpim * i;
        }
        return carpim;
    }
    
    public static void main(String[] args) {
        for (int i = 3; i <= 5; i++) {
            System.out.println(i + "\t" + i +"! =" + bulFaktoriel(i) + "\t\t" + i +"*"+ (i-1) +"! =" + bulFaktoriel(i) + "\t\t" + i +"*"+ (i-1) +"*"+ (i-2) +"! =" + bulFaktoriel(i));
            System.out.print("\n");

        }
    }
}
