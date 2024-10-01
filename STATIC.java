public class STATIC {
    public static void main(String[] args) {
        
        student s1=new student();
        s1.schoolname="JMV";

        student s2=new student();
        System.out.println(s2.schoolname);
    }
    
}

class student{
    String name;
    int roll;

    static String schoolname;

    void setname(String name){
        this.name=name;
    }

    String getname(){
        return this.name;
    }

}
