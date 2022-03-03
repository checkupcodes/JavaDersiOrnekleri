import java.util.Scanner;

public class pi {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int deger = input.nextInt() ;
        int s = 3;
        double islem = 4;
       for(int i = 1 ; i<deger ;  i++){
        islem -= 4/s;
        s+=2;
        s*=-1;
       }
       System.out.println(islem);
    }
}
