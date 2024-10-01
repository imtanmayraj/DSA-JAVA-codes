public class polymorphism {
    public static void main(String[] args) {

        // calculator calc=new calculator();
        // System.out.println(calc.sum(1,2));
        // System.out.println(calc.sum((float)3.5,4));
        // System.out.println(calc.sum(1,4,8)); 
        
        deer d=new deer();
        d.eat();
    }
    
}


//function overriding

class animal{
    void eat(){
        System.out.println("eats anything");
    }
}
class deer extends animal{
    void eat() {
        System.out.println("eats grass");
    }
}
class calculator{
    int sum(int a,int b){
        return a+b;


    }

    float sum(float a,float b){
        return a+b;
    }

    int sum(int a,int b,int c){
        return a+b+c;
    }
}
