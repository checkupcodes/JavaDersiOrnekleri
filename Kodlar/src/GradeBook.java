public class GradeBook {
    private String title;
    private String teacher;
    private String color;
     
    public GradeBook(){
        
    }

    public GradeBook(String title){
        this.title=title;
    }
    public GradeBook(String title, String color){
        this.title=title;
        this.color=color;
    }
    public GradeBook(String title, String color, String teacher){
        this.title = title;
        this.color = color;
        this.teacher = teacher;
    }

    // Aşağıdaki set değişkenker dışardan değiştirmek istediğimiz kullandık. Çünkü private aslında bura.
    public void setTitle(String title){
        this.title=title;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setTeacher(String teacher){
        this.teacher=teacher;
    }

    // Aşağıdaki set işlemleri de tek tek private tan çağırmak için kullandık
    public String getTeacher(){
        return teacher;
    }
    public String getTitle(){
        return title;
    }
    public String getColor(){
        return color;
    }

    public void displayInfo(){
        System.out.println("title : " + title +" "+ teacher +" " + color);

    }


}
