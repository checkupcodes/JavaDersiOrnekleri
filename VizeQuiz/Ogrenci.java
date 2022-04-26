public class Ogrenci {
    private String ad, soyad, cinsiyet, kimlikNo;
    private int yas;

    public Ogrenci(String ad, String soyad, String cinsiyet, String kimlikNo, int yas) {
        setOgrenci(ad, soyad, cinsiyet, kimlikNo, yas);
    }

    public void setOgrenci(String ad1, String soyad1, String cinsiyet, String kimlikNo, int yas) {
        this.ad = ad1;
        this.soyad = soyad1;
        this.cinsiyet = cinsiyet;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
    }

    public String getOgrenciAd() {
        return ad;
    }

    public String getOgrenciSoyad() {
        return soyad;
    }

    public String getOgrenciCinsiyet() {
        return cinsiyet;
    }

    public String getOgrenciKimlikNo() {
        return kimlikNo;
    }

    public int getOgrenciYas() {
        return yas;
    }

    @Override
    public String toString() {
        return String.format("Kimlik:%s\nAd:%s\nSoyad:%s\nCinsiyet:%s\nYas:%d\n",
                getOgrenciKimlikNo(), getOgrenciAd(), getOgrenciSoyad(), getOgrenciCinsiyet(), getOgrenciYas());
    }
}
