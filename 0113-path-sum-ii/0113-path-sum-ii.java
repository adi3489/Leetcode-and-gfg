/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        // List<List<Integer>> res= new ArrayList<>();
        // if(root==null)
        // return res;
        // helper(root,targetsum,res, sum,ArrayList<>());
        // return res;
        // }
        // public void helper(TreeNode root,int targetsum,List<List<Integer>> res,int sum,List<Integer>List){
 List<Integer> currPath = new ArrayList<>();
        
        List<List<Integer>> allPaths = new ArrayList<>();
        pathSum(root, targetSum, currPath, allPaths);
        return allPaths;
    }
    
    public void pathSum(TreeNode root, int targetSum, List<Integer> currPath, List<List<Integer>> allPaths) {
        
        if(root == null) {
            return;
        }
        /*
          1. Agar node leaf node, koi child nahin hai, or targetsum bann gaya to allPath list mein 
             currentPath list ko add krdia.
          2. If statement mein topi utarna(backtrack krna) na bhulna, path add krne ke baad.

          1. If node is a leaf node i.e no left and right child and target sum is achieved 
             add the currentPath into all path
          2. Do not forget to backtrack in if statement i.e remove after adding path.
        */
        if(root.left == null && root.right == null && targetSum - root.val == 0) {
            currPath.add(root.val);
            allPaths.add(new ArrayList<>(currPath));
            currPath.remove(currPath.size() - 1);
            return;
        }
        
        //Add the current node in the potential currentPath list.
        //jis node pr hain usko consider krenge to usko currentPath list mein add krdia
        currPath.add(root.val); //Topi pehnana(Wearing The Cap)
        
        //Two choices(Left, Right) -> decrement target sum by root's(current node) value.
        //Do choices hain left jao and right jao -> targetSum mein se current node ki value minus krdo
        pathSum(root.left, targetSum - root.val, currPath, allPaths);
        pathSum(root.right, targetSum - root.val, currPath, allPaths);
        //Backtracking(Topi Utarna(Pehle jaisi list krna)/Taking of the cup(undo))
        currPath.remove(currPath.size() - 1); 

        }

}