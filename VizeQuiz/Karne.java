public class Karne {
    Ogrenci ogrenci;
    int[] notlar;
    int[] kredi;
    String[] dersAd;

    public Karne(Ogrenci ogrenci,String[] dersAd,int[] notlar,int[] kredi){
        this.ogrenci = ogrenci;
        this.dersAd=dersAd;
        this.notlar=notlar;
        this.kredi=kredi;
    }
    public Ogrenci getOgrenci(){
        return ogrenci;
    }public void setOgrenci(Ogrenci o){
        this.ogrenci=o;
    }

    public int[] getNotlar(){
        return notlar;
    }public void setNotlar(int[] notlar){
        this.notlar=notlar;
    }

    public int[] getKredi(){
        return kredi;
    }public void setKredi(int[] kredi){
        this.kredi = kredi;
    }


    public void yazKarne(){
        System.out.println(ogrenci);
        System.out.println("DersAd\tDersNot\tDersKredi\t");
        for (int i=0;i<3;i++){
            System.out.println(dersAd[i]+"\t"+notlar[i]+"\t"+kredi[i]);
        }
        findOrt();
    }

    public void findOrt(){
        int toplam = 0;
        int krediToplam = 0;

        double ortlama;
        for(int i = 0;i<kredi.length;i++){
            toplam += notlar[i]*kredi[i];
            krediToplam += krediToplam + kredi[i];
        }
        ortlama = toplam / krediToplam;
        System.out.println(ortlama);
    }
}
