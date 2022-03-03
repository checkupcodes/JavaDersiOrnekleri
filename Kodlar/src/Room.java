public class Room {
    private String roomNo, roomType;
    private int roomCapacity, population;
    /////////
    public Room(){

    }
    public Room(String roomNo, String roomType , int roomCapacity, int population ){
        this.roomNo = roomNo;
        this.roomType = roomType;
        if(roomCapacity < 0 ){
            System.out.println("Kapasite Negatif Olamaz !");
        }
        this.roomCapacity = roomCapacity;
        if(population < 0 ){
            System.out.println("Population negatif Olamaz");
        }
        this.population = population;
    }
    ////////////
    public void setRoom(String rNo, String rType, int rCapacity, int p){
        this.roomNo = rNo;
        this.roomType = rType;
        this.roomCapacity = rCapacity;
        this.population = p;
    }
    public String getRoomNo(){
        return roomNo;
    }
    public String getRoomType(){
        return roomType;
    }
    public int getRoomCapacity(){
        return roomCapacity;
    }
    public int population(){
        return population;
    }
    public void isEmpty(){
        if(this.population == 0){
            System.out.println("Oda boş");
        }else if(this.population < this.roomCapacity){
            System.out.println("Arkada yer var");

        }else{
            System.out.println("Gaptan daha alma");
        }
    }
}
