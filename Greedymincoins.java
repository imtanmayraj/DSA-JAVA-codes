import java.util.*;
public class Greedymincoins {

    public static void main(String[] args) {
        Integer notes[]={1,2,5,10,20,50,100,500,2000};

        Arrays.sort(notes,Comparator.reverseOrder());
        int countofnotes=0;
        int amount=590;

        ArrayList<Integer>ans=new ArrayList<>();

        for(int i=0;i<notes.length;i++){
            if(notes[i]<=amount){
                while(notes[i]<=amount){
                countofnotes++;
                ans.add(notes[i]);
                amount-=notes[i];
                }

            }
        }
        System.out.println("minimun no. of notes needed = "+countofnotes);

        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }
}
