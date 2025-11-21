package P_Trees;

public class DiameterOfTree {


    public static int getHeight(HeightOfTree.TreeNode node){
        return HeightOfTree.height(node);
    }

    public static int diameter(HeightOfTree.TreeNode root){

        if(root == null) return 0;

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        int currentNodeDiameter = leftHeight + rightHeight + 1;

        return Math.max(currentNodeDiameter, Math.max(diameter(root.left), diameter(root.right)));
    }


   public static void main(String[] args) {
    
        HeightOfTree.TreeNode root = new HeightOfTree.TreeNode(1);

        root.left = new HeightOfTree.TreeNode(2);
        root.right = new HeightOfTree.TreeNode(3);
        root.left.left = new HeightOfTree.TreeNode(4);
        root.left.right = new HeightOfTree.TreeNode(5);
        root.left.left.left = new HeightOfTree.TreeNode(6);
        root.left.right.right = new HeightOfTree.TreeNode(7);
        root.left.left.left.left = new HeightOfTree.TreeNode(10);
        root.left.right.right.right = new HeightOfTree.TreeNode(11);
        
        System.out.println("Diameter of the tree: " + diameter(root));
   }
    
}
