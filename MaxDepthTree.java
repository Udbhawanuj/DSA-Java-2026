public class MaxDepthTree {

    static class TreeNode {
        int val;
        TreeNode left, right;
               TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }
    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(
                maxDepth(root.left),
                maxDepth(root.right)
        );
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        System.out.println(maxDepth(root));
    }
}

