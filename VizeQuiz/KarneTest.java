public class KarneTest {
    public static void main(String[] args) {
        
        Ogrenci muh = new Ogrenci("Muhammed", "Ali", "Erkek", "3423423462", 51);
        String[] dersAd = {"mat","fen","sosyal"};
        int[] notlar = {65,23,87};
        int[] kredi = {4,5,2};
        Karne karne = new Karne(muh, dersAd, notlar, kredi);
        karne.yazKarne();


    }
}
