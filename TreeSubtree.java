import java.util.*;
public class TreeSubtree {

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
        //for main tree
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        //for subtree

        Node subroot=new Node(2);
        subroot.left=new Node(4);
        subroot.right=new Node(5);

        System.out.println(isSubtree(root, subroot));
    
}

public static boolean isSubtree(Node root,Node subroot){ //fun to find locn of subtree in main tree
    if(root==null){
        return false;
    }
    
    if(root.data==subroot.data){
     if(isIdentical(root,subroot)){  //call to check whether identical or not
        return true;
     }
    }
    boolean leftans= isSubtree(root.left, subroot); //ans -true
    boolean rightans= isSubtree(root.right, subroot);

    return leftans || rightans ;
}

public static boolean isIdentical(Node node,Node subroot){ ////fun to check whether identical or not
    if(node==null && subroot==null){
        return true;
    }else if(node==null || subroot==null || node.data!=subroot.data){  //1 null and 1 not null
        return false;
    }
    if(!isIdentical(node.left, subroot.left)){ //check left part of root
        return false;
    }
    if(!isIdentical(node.right, subroot.right)){//check right part of root
        return false;
    }
    return true;
}


}//for class
