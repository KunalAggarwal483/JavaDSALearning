package P_Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class ZigZagT {

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static List<List<Integer>> ZigZagTraversal(TreeNode root){

        List<List<Integer>> result = new ArrayList<>();

        Queue<TreeNode> queue = new java.util.LinkedList<>();

        queue.offer(root);
        int levelCounter = 1;

        while(!queue.isEmpty()){

            int levelSize = queue.size();

            List<Integer> currentLevel = new ArrayList<>();

            for(int i =0; i< levelSize; i++){

                TreeNode currentNode = queue.poll();

                if((levelCounter & 1) == 1){
                    currentLevel.add(currentNode.val);
                } else {
                    currentLevel.add(0, currentNode.val);
                }

                if(currentNode.left != null)
                    queue.offer(currentNode.left);

                if(currentNode.right != null)
                    queue.offer(currentNode.right);
            
            }
            
            levelCounter++;
            result.add(currentLevel);

        }

        return result;

    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);
        root.right.right.left = new TreeNode(10);
        root.right.right.right = new TreeNode(11);

        List<List<Integer>> levels = ZigZagTraversal(root);

        for(List<Integer> level : levels){
            System.out.println(level);
        }
        
    }
    
}
