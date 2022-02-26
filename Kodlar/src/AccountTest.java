import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Banka hesabınıza hoşgeldiniz");
        System.out.print("1. hesabınızdaki bakiyeyi giriniz: ");
        double balance1 = input.nextDouble();
        System.out.print("2. hesabınızdaki bakiyeyi giriniz: ");
        double balance2 = input.nextDouble();

        
     

        

    
        Account account1 = new Account(balance1);
        Account account2 = new Account(balance2);

        account1.setBalance(balance1);
        account2.setBalance(balance2);

        System.out.println("1.hesap değer : " + account1.getBalance());
        System.out.println("2.hesap değer : " + account2.getBalance());
     


        System.out.println("1.account eklenecek değer : ");
        double degerekle1 = input.nextDouble();
        System.out.println("2.account eklenecek değer : ");
        double degerekle2 = input.nextDouble();

        account1.credit(degerekle1);
        account2.credit(degerekle2);

        System.out.println("Hesabınızın güncel durumu aşağıdadır");


        System.out.println("1.hesap değer : " + account1.getBalance());
        System.out.println("2.hesap değer : " + account2.getBalance());





        
    }
}
