import java.util.Random;

public class ArrayExample {

    public void displayArray(int[] r){
    System.out.println("İndex | Value \t,");
    for(int i = 0; i<r.length;i++){
        System.out.println(i + "\t" + r[i]);
        }
    }

    public void assignArray(int[] r, Random m){
        for(int i = 0; i<r.length;i++){
            r[i] = 1 + m.nextInt(15);
        }
    }
    
    public void func(int[] r){
        for(int i = 0; i<r.length ; i++){
            r[i] = r[i] *2 +1;
        }
    } 

    public void sumArray(int[]r){
        int total = 0;
        for(int value:r){
            total += value;
        }
        System.out.println("Total : " + total);
    } 
    public void payPayda(int[] e){
        for(int i = 0; i<2;i++){
            if(i==0){
                System.out.println("Yazi " + e[0] + "/" + (e[0]+e[1]) + " olasılık"); //coin[0]
            }else{
                System.out.println("Tura " +e[1] + "/" +(e[0]+e[1]) + " olasılık"); // coin[1]
            }
        }
    }
}
