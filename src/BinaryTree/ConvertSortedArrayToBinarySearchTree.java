package BinaryTree;

/**
 * @author away
 * @date 2021-12-02 13:25
 */
public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums,0,nums.length-1);
    }

    private TreeNode build(int[] nums, int start, int end) {
        if (end < start) {
            return null;
        }
        int mid = (end-start)/2+start;
        int rootval = nums[mid];
        TreeNode root = new TreeNode(rootval);
        root.left = build(nums,start,mid-1);
        root.right = build(nums,mid+1,end);

        return root;

    }


}
