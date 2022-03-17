import javax.print.attribute.SetOfIntegerSyntax;

public class JavaDersiTest {
    public static void main(String[] args) {
        int grades[] = {100,100,65,75,53,76,86,45,76,86,56,78,99,87};
        JavaDersi sekizb = new JavaDersi("sinif",grades);
        sekizb.displayMsg();
        sekizb.getogrenciler();
        System.out.println(sekizb.getAverage());
    }
}
