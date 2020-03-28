import java.util.*;
import java.util.LinkedList;

public class MyTree {


    public static int size = 0;

    public static void insert(TreeNode root, int newVal){
        if(root == null){
            root = new TreeNode(newVal);
            size++;
        } else if(newVal > root.val){
            if(root.right == null){
                root.right = new TreeNode(newVal);
                size++;

            } else {
                insert(root.right, newVal);
            }
        } else {
            if(root.left == null){
                root.left = new TreeNode(newVal);
                size++;

            } else {
                insert(root.left, newVal);
            }
        }
    }

    public static void visitInOrder(TreeNode root){
        if(root != null){
            visitInOrder(root.left);
            visit(root);
            visitInOrder(root.right);
        }
    }

    public static void bfsVisit(TreeNode root){
        ArrayList<MyPair> arr = new ArrayList<>();
        bfsHelper(root, 0, arr);
        for(int i = 0; i<19; i++){
            for(MyPair myPair: arr){
                if(myPair.last == i){
                    System.out.println(myPair.first + ", ");
                }
            }
            System.out.println(" \\");
        }
    }

    public static void bfsHelper(TreeNode root, int row, ArrayList<MyPair> arr){
        arr.add(new MyPair(root.val, row));
        if(root.left != null){
            bfsHelper(root.left, row +1, arr);
        }
        if(root.right != null){
            bfsHelper(root.right, row +1, arr);
        }
    }

    public static void printArr(int[] arr){
        System.out.println(arr[0]);
        for(int i=1; i < arr.length; i++){
            System.out.print(arr[i]);
            if(isCounter2Power(i)){
                System.out.println("  \\");
            } else {
                System.out.print(", ");
            }
        }
    }



    public static boolean isCounter2Power(int counter){
        int cand = 0;
        int pow = 1;
        while(cand < counter){
            cand += Math.pow(2, pow);
            pow++;
        }
        if(cand == counter){
            return true;
        }
        return false;
    }

    public static void visit(TreeNode root){
        System.out.println(root.val + ", ");

    }
}
