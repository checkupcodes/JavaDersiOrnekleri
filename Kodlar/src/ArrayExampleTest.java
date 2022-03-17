import java.util.Random;

import javax.swing.plaf.synth.SynthStyle;

public class ArrayExampleTest {
    public static void main(String[] args) {
        

        ArrayExample classNesnesi = new ArrayExample();

        int[] r=  new int[14];
        Random m = new Random();
        // z.displayArray(r);
        // z.assignArray(r, m);
        // z.displayArray(r);

        // int[] myArray = {1,2,3,4,5,6,6,7};
        // classNesnesi.displayArray(myArray);
        // classNesnesi.func(myArray);
        // classNesnesi.displayArray(myArray);

        int[] coin = new int[2];

        for(int i = 0; i <14 ; i++){
            ++coin[m.nextInt(2)];
        }
        classNesnesi.payPayda(coin);
        
    }

    
}
