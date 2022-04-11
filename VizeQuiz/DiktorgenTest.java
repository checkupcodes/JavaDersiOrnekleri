import java.util.Random;

public class DiktorgenTest {
    public static void main(String[] args) {
        System.out.println("İki nesne oluşturalım");
        Random random = new Random();

        Dikdortgen name1 = new Dikdortgen(2, 5);
        Dikdortgen name2 = new Dikdortgen(14, 14);

        System.out.println(name1);
        System.out.println(name2);
        System.out.println("**************");

        name2.setUzunluk(name2.getUzunluk()*2);
        name2.setGenislik(name2.getGenislik()*2);

        name1.setUzunluk(name1.getUzunluk()*14);
        name1.setGenislik(name1.getGenislik()*14);
        System.out.println(name1);
        System.out.println(name2);
        System.out.println("**************");


        if(name1.esitMi(name2) == false){
            System.out.println("Dikdrotgenler eşit değil");
            Dikdortgen name3 = new Dikdortgen(1+(random.nextInt(5)), (1+random.nextInt(5)));
            Dikdortgen name4 = new Dikdortgen(1+(random.nextInt(5)), (1+random.nextInt(5)));
            Dikdortgen name5 = new Dikdortgen(1+(random.nextInt(5)), (1+random.nextInt(5)));
            System.out.println(name3);
            System.out.println(name4);
            System.out.println(name5);
        }



    }
}
