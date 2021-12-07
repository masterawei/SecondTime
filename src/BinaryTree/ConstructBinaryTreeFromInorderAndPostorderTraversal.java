package BinaryTree;

import org.omg.PortableServer.POA;

/**
 * @author away
 * @date 2021-11-30 10:16
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return construct(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);

    }

    private TreeNode construct(int[] inorder, int instart, int inend, int[] postorder, int poststart, int postend) {
        if (instart > inend || poststart > postend) {
            return null;
        }

        int rootval = postorder[postend];
        TreeNode root = new TreeNode(rootval);
        int idx = -1;
        int count =0;
        for (int i = instart; i <= inend; i++) {
            if (inorder[i] == rootval) {
                idx = i;
                break;
            }
            count++;
        }

        root.left = construct(inorder, instart, idx - 1, postorder, poststart, poststart + count - 1);
        root.right = construct(inorder,idx+1,inend, postorder,poststart+count,postend-1);

        return root;

    }

}
