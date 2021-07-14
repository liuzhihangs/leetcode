//给定一个二叉树的根节点 root ，返回它的 中序 遍历。 
//
// 
//
// 示例 1： 
//
// 
//输入：root = [1,null,2,3]
//输出：[1,3,2]
// 
//
// 示例 2： 
//
// 
//输入：root = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：root = [1]
//输出：[1]
// 
//
// 示例 4： 
//
// 
//输入：root = [1,2]
//输出：[2,1]
// 
//
// 示例 5： 
//
// 
//输入：root = [1,null,2]
//输出：[1,2]
// 
//
// 
//
// 提示： 
//
// 
// 树中节点数目在范围 [0, 100] 内 
// -100 <= Node.val <= 100 
// 
//
// 
//
// 进阶: 递归算法很简单，你可以通过迭代算法完成吗？ 
// Related Topics 栈 树 哈希表 
// 👍 873 👎 0


package com.liuzhihang.leetcode.editor.cn;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
    public static void main(String[] args) {

        Solution solution = new BinaryTreeInorderTraversal().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    public class TreeNode {
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

    class Solution {

        // 中序遍历 左 根 右 非递归
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> integerList = new LinkedList<>();


            Stack<TreeNode> nodeStack = new Stack<>();

            TreeNode temp = root;

            while (temp != null || !nodeStack.isEmpty()) {

                if (temp != null) {
                    nodeStack.push(temp);
                    temp = temp.left;
                } else {
                    TreeNode pop = nodeStack.pop();
                    integerList.add(pop.val);
                    temp = pop.right;
                }

            }


            return integerList;
        }


        // // 中序遍历 左 根 右
        // public List<Integer> inorderTraversal(TreeNode root) {
        //     List<Integer> integerList = new LinkedList<>();
        //
        //     inorderTraversal(root, integerList);
        //
        //     return integerList;
        // }
        //
        // public void inorderTraversal(TreeNode root, List<Integer> integerList) {
        //
        //     if (root == null) {
        //         return;
        //     }
        //     inorderTraversal(root.left, integerList);
        //     integerList.add(root.val);
        //     inorderTraversal(root.right, integerList);
        // }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
