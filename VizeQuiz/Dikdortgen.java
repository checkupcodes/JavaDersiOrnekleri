public class Dikdortgen {
    private int uzunluk;
    private int genislik;

    public Dikdortgen(int uzun,int gen){
        setUzunluk(uzun);
        setGenislik(gen);
    }
    public void setUzunluk (int uzun){
        if(uzun<0){uzun = 3;}
        this.uzunluk = uzun;
    }public void setGenislik (int gen){
        if(gen<0){gen = 3;}
        this.genislik = gen;
    }

    public int getUzunluk(){
        return this.uzunluk;
    }public int getGenislik(){
        return this.genislik;
    }

    public int alan(){
        return getGenislik()*getUzunluk();
    }public int[] alan(Dikdortgen dik,int[] alanlar){
        alanlar[0] = this.alan();
        alanlar[1] =dik.alan();
        return alanlar;
    }

    public int cevre (){
        return  (getGenislik() + getUzunluk())*2;
    }public int[] cevre (Dikdortgen dik, int[] cevreler){
        cevreler[0] = this.cevre();
        cevreler[1] = dik.cevre();
        return cevreler;
    }

    public boolean esitMi(Dikdortgen yakup){
        boolean esit = false;
        if(this.alan() == yakup.alan() && this.cevre() == yakup.cevre()){
            System.out.println("Dikdörtgenler eşit");
            return !esit;
        }else {
            System.out.println("Eşit değil");
            return esit;
        }
    }

    @Override
    public String toString()
    {
    return
    String.format("Height:%d\nWidth:%d\n",getUzunluk(),getGenislik() );
    }
}
