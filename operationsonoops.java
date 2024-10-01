public class operationsonoops {
    public static void main(String[] args) {
        
        // fish shark=new fish();
        // shark.eat();

        dog lufi=new dog();
        lufi.eat();
        lufi.legs=4;
        System.out.println(lufi.legs);
    }
    
}


//base class
class animal{
   String color;
    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breaths");
    }
}

// //derived class -single inheritance

// class fish extends animal{
//     int fins;

//     void swim(){
//         System.out.println("swims in water");
//     }
// }


//dmultiinheritance

class mammals extends animal{
    void walk(){
        System.out.println("walks");
        
    }
    // int legs;
}
class fish extends animal{
    void swim(){
        System.out.println("swim");
    }
}

class bird extends animal{
    void fly(){
        System.out.println("fly");
    }
}


class dog extends mammals{
    String breed;
}