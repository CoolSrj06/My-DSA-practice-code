package Tree;

public class TreeInsert {

    Height h=new Height();
    static Node root;

    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            insert(nums[i]);
        }
    }

    public void insert(int val){
        root=insert(root,val);
    }
    private Node insert(Node node, int val){
        if(node == null){
            node=new Node(val);
            return node;
        }

        if(node.val>val){
            node.left=insert(node.left,val);
        }

        if(node.val<val){
            node.right=insert(node.right,val);
        }

        node.height=Math.max(h.height(node.left),h.height(node.right))+1;
        return node;
    }
}
