package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static List<List<Integer>> levelOrder(TreeNode root) {
        HashMap<Integer, List<Integer>> result = new HashMap<>();
        if (root != null) getList(root, result, 0);
        return new ArrayList<>(result.values());
    }

    private static void getList(TreeNode node, HashMap<Integer, List<Integer>> result, int level) {
        if (!result.containsKey(level)) result.put(level, new ArrayList<>());
        result.get(level).add(node.val);
        if (node.left != null) getList(node.left, result, level + 1);
        if (node.right != null) getList(node.right, result, level + 1);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
