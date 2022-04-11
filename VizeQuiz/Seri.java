import java.util.Scanner;

public class Seri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int girilenPayda =input.nextInt();
        double r = 1;
        int oruntu = 4;
        for(int i = 0; i < girilenPayda ; i++){
            if(i%2==0){
                r = r + 1/(5 + oruntu);
            }else{
                r = r * 1/(9 + oruntu); 
            }
        }

        System.out.println("Sonsuz seri r değeri : " + r);
    }
}
