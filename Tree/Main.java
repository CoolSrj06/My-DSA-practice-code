package Tree;

import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        /**BinaryTree bt =new BinaryTree();

        bt.createRoot(sc);
        bt.display();

         **/


        /**
         BTS bst=new BTS();
         int arr1[]={1,2,3,4,5};
         int arr[]={ 5, 2, 7, 1, 4, 6, 9, 8, 3, 10 };
         //bst.populate(arr);

         bst.populatedSorted(arr1);
         bst.display();

**/
        /**
        TreeInsert ti=new TreeInsert();
        TreeDisplay td=new TreeDisplay();
        int arr[]={ 1,2,3,4,5,6,7,8 };
        ti.populate(arr);
        td.display();
         **/

        AVL avl= new AVL();
        int arr[]=new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i]=i+1;
        }
        avl.populate(arr);
        System.out.println("Height is: "+avl.height());
        avl.display();
    }
}
