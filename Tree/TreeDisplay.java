package Tree;

public class TreeDisplay {
    public void display(){
        display(TreeInsert.root,"Root Node is: ");
    }

    private void display (Node node, String indent){
        if(node==null){
            return;
        }

        System.out.println(indent+node.val);
        display (node.left,"Left child of "+node.val+": ");
        display (node.right,"Right child of "+node.val+": ");
    }
}
