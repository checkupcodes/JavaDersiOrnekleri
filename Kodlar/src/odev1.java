public class odev1 {
    
}
class dikdorgen{
    private int uzunluk;
    private int genislik;
    public dikdorgen(int uzunluk,int genislik){
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }
    public void setUzunluk(int uzunlukDegeri){
        if(uzunlukDegeri <0){
            uzunlukDegeri =3;
        }
        this.uzunluk = uzunlukDegeri;
    }
    public void setGenislik(int genislikDegeri){
        if(genislikDegeri <0){
            genislikDegeri =3;
        }
        this.genislik = genislikDegeri;
    }
    public int getUzunluk(){
        return this.uzunluk;
    }
    public int getGenislik(){
        return this.genislik;
    }



    public int cevreHesapla(){
        int cevre = (this.genislik + this.uzunluk) * 2;
        return cevre;
    }
    public int alanHesapla(){
        int alan = this.genislik * this.uzunluk;
        return alan;
    }
}