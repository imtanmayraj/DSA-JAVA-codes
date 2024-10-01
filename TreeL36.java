import java.util.*;
import java.util.ArrayList;
import java.util.concurrent.TransferQueue;
public class TreeL36 {

    static class Node{
        Node left,right;
        int data;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
   public static void main(String[] args) {
    Node root=new Node(1);
    root.left=new Node(2);
    root.right=new Node(3);
    root.left.left=new Node(4);
    root.left.right=new Node(5);
    root.right.left=new Node(6);
    root.right.right=new Node(7);

    // printklevel(root, 1, 3);

    // int n1=4,n2=3;
    // Node p=lowestcommonancestor(root, n1, n2);
    // Node p=lca2(root, n1, n2);
    // System.out.println(p.data);

    // System.out.println(minDistance(root, n1, n2));
    // int n=5,k=1;
    // KAncestor(root, n,k);

   TransformintoSumTree(root);
   printpreorder(root);
   } 

   public static void printklevel(Node root,int level,int k){
    //base case
    if(root==null){
        return;

    }
    if(level==k){
        System.out.print(root.data+" ");
        return;
    }
    printklevel(root.left, level+1, k);
    printklevel(root.right, level+1, k);
   }
   //approach 1

   public static Node lowestcommonancestor(Node root,int n1,int n2){
    ArrayList<Node>path1=new ArrayList<>();
    ArrayList<Node>path2=new ArrayList<>();

    getpath(root,n1,path1);
    getpath(root,n2,path2);
    //last common ancestor
    int i=0;
    for(i=0;i<path1.size() &&i< path2.size() ;i++){
        if(path1.get(i)!=path2.get(i)){
            break;
        }
        //last equal node -> i-1th   
    }
    Node lca=path1.get(i-1);
        return lca;
   }


   public static boolean getpath(Node root,int n,ArrayList<Node>path){

    if(root==null){
        return false;
    }
    path.add(root);
    
    if(root.data==n){
        return true;
    }
    boolean foundleft=getpath(root.left, n, path);
    boolean foundright=getpath(root.right, n, path);

    if(foundleft||foundright){
        return true;

    }
    path.remove(path.size()-1);
    return false;
   }
//approach 2
   public static Node lca2(Node root,int n1,int n2){

    //base case--root -=null
    if(root==null||root.data==n1 || root.data==n2){
        return root;

    }
    Node leftlca=lca2(root.left,n1,n2);
    Node rightlca=lca2(root.right,n1,n2);

    //leftlca=val ,rightlca=null
    if(rightlca==null){
    return  leftlca;
    }
    if(leftlca==null){
    return rightlca;
    }

    return root;

   }

   public static int minDistance(Node root,int x,int y){
    Node lca=lca2(root,x,y);

    int dist1=nodetolcaDist(lca,x);
    int dist2=nodetolcaDist(lca,y);

    return dist1+dist2;
   }

   public static int nodetolcaDist(Node root,int n){
    if(root==null){
        return -1;

    }
    if(root.data==n){
        return 0;
    }
    int leftdist=nodetolcaDist(root.left, n);
    int rightdist=nodetolcaDist(root.right, n);

    if(leftdist==-1 && rightdist==-1){
        return -1;

    }else if(leftdist==-1){
        return rightdist+1;
    }else{
        return leftdist+1;
    }

   }

   

   public static int KAncestor(Node root,int n,int k){
    
    //base case
    if(root==null){
        return -1;
    }
    if(root.data==n){
        return 0;

    }
    int leftdist=KAncestor(root.left,n,k);
    int rightdist=KAncestor(root.right, n, k);

    
    if(leftdist==-1 && rightdist==-1){
        return -1;
    }
    int max=Math.max(leftdist,rightdist);

    if(max+1==k){
        System.out.println(root.data);
    }
    return max+1;
   }

   public static int TransformintoSumTree(Node root){

    //base case
    if(root==null){
        return 0;
    }

   int leftchild=TransformintoSumTree(root.left);
   int rightchild=TransformintoSumTree(root.right);

   int oldval=root.data;

//    int newleft=root.left ==null?0:root.left.data ;
//    int newright=root.right ==null?0:root.right.data ;

//    root.data=newleft+leftchild+newright+rightchild;
root.data=leftchild+rightchild;
   return oldval+root.data;
   }

   public static void printpreorder(Node  root){
    if(root==null){
        return;
    }
    System.out.print(root.data+" ");
    printpreorder(root.left);
    printpreorder(root.right);
   }

  
}//for class
