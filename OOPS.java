public class OOPS {
    
    public static void main(String[] args) {
        
        pen p1=new pen();
        p1.setcolor("blue");
        // System.out.println(p1.color);
        p1.settip(5);

        bankaccount myacc=new bankaccount();
        myacc.username="tanmay raj";

        // myacc.password="xysfjkbnfjk";

        student s1=new student();
        s1.name="tanmay";
        s1.roll=167;
        // s1.password="abcd";

        s1.marks[0]=90;
        s1.marks[1]=80;
        s1.marks[2]=70;

        student s2=new student(s1);
        // s2.password="xyz";

        s1.marks[2]=95;

        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }

        



        // student s2=new student("tanmay");
        // student s3=new student(167);
        


    }
}

class pen{
    String color;
    int tip;

    //grtterfunction
    String getcolor(){
        return this.color;
    }

    int gettip(){
        return this.tip;
    }

    void setcolor(String newcolor){
        // color=newcolor;
        //setter
        this.color=newcolor;
    }

    void settip(int newtip){
        // tip=newtip;
        this.tip=newtip;
    }
}

class student{
    String name;
    int age,roll;
    float percentage;
    int marks[];

    class address{
        String city;
    }

    //shallow copy constructor
    // student(student s1){
    //     marks=new int[3];
    //     this.marks=s1.marks;
    //     this.name=s1.name;
    //     this.roll=s1.roll;
    // }
//deep copy constructor

student(student s1){
    marks=new int[3];
    this.name=s1.name;
    this.roll=s1.roll;

    for(int i=0;i<marks.length;i++){
        this.marks[i]=s1.marks[i];
    }
}

    // student(String name){
    //     this.name=name;
    //     System.out.println(s1.name);
    //}

    //parameterized constructor
    student(String name){
        marks=new int[3];
        this.name=name;
    }
    student(int roll){
        marks=new int[3];
        this.roll=roll;
    }

    
    student(){
        marks=new int[3];
        System.out.println("constructor is called");
    }

    void calcpercentage(int phy,int chem,int math){
        percentage=(phy+chem+math)/3;
    }
}

class bankaccount{
    public String username;
    private String password;

    public void setpassword(String pswd){
        password=pswd;
    }
}
