import java.util.Scanner;

public class Tahmin {

    public static double faktor(int sayi){
        int carpim = 1;
        for(int i = 1; i< 4;i++){
            carpim = carpim *i;
        }
        return carpim;
    }
    public static void main(String[] args) {
        double e = 1;

        Scanner input = new Scanner(System.in);
        int girilenSayi = input.nextInt();
        for (int i = 1; i < girilenSayi; i++) {
            e = e + 1/faktor(i);
            System.out.println(e);
        }

        System.out.println("E sayisi tahminen :" + e);
    }
}
