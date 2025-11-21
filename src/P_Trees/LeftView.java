package P_Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LeftView {

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

    public static List<Integer> leftView(TreeNode root){

        List<Integer> result = new ArrayList<>();

        Queue<TreeNode> queue = new java.util.LinkedList<>();

        queue.offer(root);
        int levelSize = queue.size();
        int lastIndex = 1;

        while(!queue.isEmpty()){

                TreeNode currentNode = queue.poll();
                // System.out.print(currentNode.val + " ");

                if(currentNode.left != null)
                    queue.offer(currentNode.left);

                if(currentNode.right != null)
                    queue.offer(currentNode.right);

                if(lastIndex == 1){
                    result.add(currentNode.val);
                }

                if(lastIndex == levelSize){
                    lastIndex = 1;
                    levelSize = queue.size();
                }
                else
                lastIndex++;

        }

        return result;

    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(9);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        List<Integer> arr = leftView(root);

        for(Integer ele : arr){
            System.out.println(ele);
        }
        
    }
    
}
