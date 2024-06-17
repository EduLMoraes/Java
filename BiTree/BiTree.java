public class BiTree{
    public Integer root; 
    public BiTree right;
    public BiTree left;

    public static void main(String args[]){
        BiTree bitree = new BiTree(5);

        bitree.new_node(7, bitree);
        bitree.new_node(1, bitree);
        bitree.new_node(3, bitree);
        bitree.new_node(10, bitree);
        bitree.new_node(145, bitree);
        bitree.new_node(-90, bitree);
        bitree.new_node(9, bitree);
        bitree.new_node(73, bitree);
        bitree.new_node(71, bitree);
        bitree.new_node(74, bitree);
        bitree.new_node(-91, bitree);
        bitree.new_node(-89, bitree);
        bitree.new_node(0, bitree);

        bitree.get_tree(bitree);
    }
    

    public BiTree(Integer root){
        this.root = root;
        this.right = null;
        this.left = null;
    }

    public Integer new_node(Integer value, BiTree node){
        if (node.root == null){
            node.root = value;
            return 0;
        }else if(node.root >= value && node.left == null){
            node.left = new BiTree(value);
            return 0;
        }else if (node.root >= value && node.left != null){
            return new_node(value, node.left);
        }else if (node.root <= value && node.right == null){
            node.right = new BiTree(value);
            return 0;
        }else{
            return new_node(value, node.right);
        }
    }


    public void get_tree(BiTree node){
        if(node != null){
            get_tree(node.left);

            System.out.print("("+ node.root+ ")");
            
            get_tree(node.right);
        }
    }
}