public class INTERFACES {
    
    public static void main(String[] args) {
        queen q=new queen();
        q.moves();
        
    }
}

interface herbivore{

}
interface carnivore{

}
//do for bear
interface chessplayer{
    void moves();
}

class queen implements chessplayer{
    public void moves() {
        System.out.println("up,down,left,right,diagonal(in all 4 directions)");
    }
}

    class rook implements chessplayer{
        public void moves() {
            System.out.println("up,down,left,right");
        }

}

class king implements chessplayer{
    public void moves() {
        System.out.println("up,down,left,right,diagonal-(by 1 step)");
    }

}

