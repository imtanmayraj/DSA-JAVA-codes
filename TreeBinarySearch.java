public class TreeBinarySearch {

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
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;

        for(int i=0;i<values.length;i++){
            root=Insert(root, values[i]);
        }

        // printInorder(root);

        // if(search(root, 15)){
            
        //     System.out.println("found");
        // }
        // else{l
           
        //     System.out.println("not found");
        // }

        // System.out.println();

        // root=deletenode(root,7);
        // System.out.println();
        // printInorder(root);

        printinrange(root, 5, 12);
    }

    
    public static Node Insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }

        if(val<root.data){
            root.left=Insert(root.left, val);
        }else{
            root.right=Insert(root.right, val);
        }
        return root;
    }
    
    

    public static void printInorder(Node  root){
        if(root==null){
            return;
        }
        
        printInorder(root.left);
        System.out.print(root.data+" ");
        printInorder(root.right);
       }


       public static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){
            return search(root.left, key);
        }
        else{
            return search(root.right, key);
        }
       }

       public static Node deletenode(Node root,int val){
        if(val>root.data){
            root.right=deletenode(root.right,val);
        }
        else if(val<root.data){
            root.left=deletenode(root.left,val);
            
        }
        else{
            //case 1
            if(root.left==null && root.right==null){
                return null;
            }
            //case 2-single child
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }


            //case 3
            Node IS=findinordersuccessor(root.right);
            root.data=IS.data;
            root.right=deletenode(root.right, IS.data);
        }
        return root;
       }

       public static Node findinordersuccessor(Node root){
        while (root.left!=null){
            root=root.left;
        } 
        return root;
       }


       public static void printinrange(Node root,int k1,int k2){
        if(root==null){
            return;
        }
        if(root.data>=k1 && root.data<=k2){
            printinrange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printinrange(root.right, k1, k2);
        }else if(k1>root.data){
            printinrange(root.left, k1, k2);
        }
        else{
            printinrange(root.right, k1, k2);
        }

        }
       
}//class
