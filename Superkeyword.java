public class Superkeyword {
    public static void main(String[] args) {
        horse h=new horse();
        System.out.println(h.color);
;    }
    
}
class animal{
    String color;
    animal(){
        super();
        System.out.println("animal constructor is called");
        
    }
}

class horse extends animal{
    horse(){
        super.color="brown";
        super();
        System.out.println("horse constructor is called");
    }
}

