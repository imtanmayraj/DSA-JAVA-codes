import java.util.Arrays;
import java.util.Collections;

public class GreedyChocolate {
    public static void main(String[] args) {
        int n=4,m=6;

        Integer costVer[]={2,1,3,1,4};
        Integer costHor[]={4,1,2};

        Arrays.sort(costVer,Collections.reverseOrder());
        Arrays.sort(costHor,Collections.reverseOrder());

        int h=0,v=0;
        int hp=1,vp=1;
        int cost=0;

        while(h<costHor.length && v<costVer.length){
            //if vercost<horcost
            if(costVer[v]<=costHor[h]){ //select hor cut
                cost+=(costHor[h]*vp);
                hp++;
                h++;

            }else{ //ver cut
                cost+=(costVer[v]*hp);
                vp++;
                v++;
            }
        }
        while(h<costHor.length){
            cost+=(costHor[h]*vp);
                hp++;
                h++;
        }

        while(v<costVer.length){
            cost+=(costVer[v]*hp);
            vp++;
            v++;
        }

        System.out.println("minm. cost of cutting the chocolate is = "+cost);
    }
    
}
