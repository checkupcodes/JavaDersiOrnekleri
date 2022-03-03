public class Rectangle {
    private double weight;
    private double height;
    final double pi = 3.21;
    ////////////////
    public Rectangle(){

    }
    public Rectangle(double data , double mata){
        this.height = data;
        this.weight = mata;
    }
    //////////////////
    public void SetHeight(double data, double mata){
        this.height = data;
        this.weight = mata;
    }
    public double getHeight(){
        return height;
    }
    public double getWeight(){
        return weight;
    }
    /////////////
    

    public double  getArea(){
        return getHeight() * getWeight();
    }
     
    public double  getPerimeter(){
        return 2*(height+weight);
    }
    public void findMaxArea(Rectangle x){
        if (this.getArea() < x.getArea()){
            System.out.println("İlk girilen Objenin değeri daha büyük ! ");
        }
    }
    public void displayInfo(){
        System.out.println("W : " + getWeight() +" H : " + getHeight() + " Area : " + getArea() + " Perimeter : " + getPerimeter());
    }


}
