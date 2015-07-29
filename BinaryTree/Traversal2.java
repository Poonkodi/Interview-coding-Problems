package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Traversal2 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> pre_list=new ArrayList<Integer>();
        Stack<TreeNode> node_stack=new Stack<TreeNode>();
        if(root==null)
        return pre_list;
        node_stack.push(root);
        while(!node_stack.isEmpty())
        {
            TreeNode element=node_stack.pop();
            pre_list.add(element.val);
            if(element.right!=null)
            node_stack.add(element.right);
            if(element.left!=null)
            node_stack.add(element.left);
        }
        return pre_list;
        
    }
}
