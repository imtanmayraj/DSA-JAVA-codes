import java.util.*;
public class Treeheight {
    
    static class Node{
        int data;
        Node left,right;

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

        System.out.println("height of tree is "+height(root));
        System.out.println("total no. of nodes :"+CountNodes(root));
        System.out.println("sum of all nodes is ="+SumofNodes(root));

        System.out.println("approach 1--T.c=O(n2)-largest diameter b/w any 2 leaves of tree is  :"+diameter(root));

        System.out.println("approach 2--T.c=O(n)-largest diameter b/w any 2 leaves of tree is  :"+diameter2(root).diam);
    }

    public static int height(Node root){
        if(root==null){
            return 0;

        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh, rh)+1;
    }

    public static int CountNodes(Node root){
        if(root==null){
            return 0;

        }
        int lcount=height(root.left);
        int rcount=height(root.right);
        return lcount+rcount+1;
    }

    public static int SumofNodes(Node root){
        if(root==null){
            return 0;

        }
        int lsum=SumofNodes(root.left);
        int rsum=SumofNodes(root.right);
        return lsum+rsum+root.data;
    }

    public static int diameter(Node root){
        if(root==null){
            return 0;

        }
        int ldiam=diameter(root.left);
        int rdiam=diameter(root.right);
        int lh=height(root.left);
        int rh=height(root.right);

        int selfdiam=lh+rh+1;

       
        return Math.max(selfdiam,Math.max(ldiam,rdiam));
    }

    static class Info{
        int diam;
        int ht;

        public Info(int diam,int ht){
            this.diam=diam;
            this.ht=ht;
        }
  }

  public static Info diameter2(Node root){
    //base case
    if(root==null){
        return new Info(0,0);
    }

    Info leftInfo=diameter2(root.left);
    Info rightInfo=diameter2(root.right);

    int diam=Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht+rightInfo.ht+1);

    int ht=Math.max(leftInfo.ht, rightInfo.ht)+1;

    return new Info(diam,ht);

  }
}//for class
