package Tree;

public class AVL {

    class Node {
        int val;
        Node left;
        Node right;
        int height;

        public Node(int val) {
            this.val = val;
        }
    }

        private Node root;

        public void populate(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                insert(nums[i]);
            }
        }

        public void insert(int val){
            root=insert(root,val);
        }
        private Node insert(Node node,int val){
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


            node.height = Math.max(height(node.left), height(node.right)) + 1;
            return rotate(node);
        }

        public int height() {
            return height(root);
        }

        public int height(Node node){
            if(node==null)
                return -1;
            return node.height;
        }

        public Node rotate(Node node){
            if(height(node.left)-height(node.right)>1){
                //left heavy
                if(height(node.left.left)-height(node.left.right)>0){
                    //left heavy
                    return rightRotate(node); // jab left left heavy ho to sirf 1 baar right rotate karna hota hai
                }
                if(height(node.left.left) - height(node.left.right) < 0) {
                    //left-right heavy
                    node.left = leftRotate(node.left);
                    return rightRotate(node);
                }
            }

            if(height(node.left)-height(node.right)< -1){
                //right heavy
                if(height(node.right.left)-height(node.right.right)<0){
                    //right heavy
                    return leftRotate(node); // jab left left heavy ho to sirf 1 baar right rotate karna hota hai
                }
                if(height(node.right.left) - height(node.right.right) > 0) {
                    //right-left heavy
                    node.right = rightRotate(node.right);
                    return leftRotate(node);
                }
            }

            return node;
        }
        private Node rightRotate(Node p) {
            Node c=p.left;
            Node t=c.right;

            c.right=p;
            p.left=t;

            p.height=Math.max(height(p.left),height(p.right))+1;
            c.height=Math.max(height(c.left),height(c.right))+1;

            return c;
        }

        private Node leftRotate(Node p){
            Node c=p.right;
            Node t=c.left;

            c.left=p;
            p.right=t;

            p.height=Math.max(height(p.left),height(p.right))+1;
            c.height=Math.max(height(c.left),height(c.right))+1;

            return c;
        }

    public void display(){
        display (root,"");
    }
    private void display(Node node, String intend){
        if(node==null){
            return;
        }
        System.out.println(intend+node.val);
        display(node.left,intend+"\t");
        display(node.right,intend+"\t");
    }
}
