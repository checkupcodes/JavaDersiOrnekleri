import javax.swing.plaf.synth.SynthStyle;

public class JavaDersi {
    private String coursename;
    private int[] grades;

    public JavaDersi(String courseName, int[] grades){
        this.coursename=courseName;
        //setCourseName(courseName);
        this.grades = grades;
    }
    public void setCourseName(String courseName){
        this.coursename = courseName;
    }
    public String getCourseName(){
        return this.coursename;
    }

    public void displayMsg(){
        System.out.println("Mesajiniz : " + getCourseName());
    }

    public int getMinimum(){
        int min = grades[0];
        for(int i = 1 ; i<grades.length;i++){
            if(min>grades[i]){
                min=grades[i];
            }
        }
        return min;
    }
    public int getMaximum(){
        int max = grades[0];
        for(int i = 1 ; i<grades.length;i++){
            if(max<grades[i]){
                max=grades[i];
            }
        }
        return max;
    }
    public double getAverage(){
        int toplam= 0;
        int ogrenci_sayisi = 1;
        for(int i =0; i<grades.length;i++){
            toplam = toplam + grades[i];
            ogrenci_sayisi = ogrenci_sayisi + 1;
        }
        double sonuc = toplam / ogrenci_sayisi;
        return sonuc; 
    }
    public void getogrenciler(){
        System.out.println("8-A Sifini 10 öğrencisi ve Matematik notlari");
        for(int a = 1; a<=grades.length ; a++){
            System.out.println(a + ". Öğrenci notu : " + grades[a -1]);

        }
    }
}
