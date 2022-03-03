public class ReactangleTest {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.SetHeight(12, 15);
        r.displayInfo();

        ///////////
        Rectangle obje = new Rectangle(5,10);
        obje.displayInfo();

        r.findMaxArea(obje);
    }
}
