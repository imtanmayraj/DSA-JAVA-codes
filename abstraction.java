public class abstraction {
    public static void main(String[] args) {
        // horse h=new horse();
        // h.eat();
        // h.walk();

        // chicken c=new chicken();
        // c.eat();
        // c.walk();

        mustang myhorse=new mustang();
        
    }
    
}
abstract class animal{
String color;
    animal(){
        System.out.println("animal constructor called");
        color="brown";
    }
    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();
}

class horse extends animal{
    horse(){
        System.out.println("horse constructor called");
    }
    void changecolor(){
        color="dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class chicken extends animal {
    void walk(){
        System.out.println("walks on 2 legs");
    }
}

class mustang extends horse{
    mustang(){
        System.out.println("mustang constructor called");
    }
}