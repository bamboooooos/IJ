package cla;

import java.util.*;
public class C97 {
    /**
     * @param root: The root of binary tree.
     * @return: An integer
     */
    ArrayList<TreeNode> nodes=new ArrayList<>();
    public int maxDepth(TreeNode root) {
        // write your code here
        int max=0;
        if(root!=null) {
            nodes.add(root);
            max=1;
        }
        int readChild=0;
        int count=0;
        int toRead=1;
        while(nodes.size()>0){
            root=nodes.get(0);
            nodes.remove(0);
            readChild++;
            if(root.left!=null){
                nodes.add(root.left);
                count++;
            }
            if(root.right!=null){
                nodes.add(root.right);
                count++;
            }
            if(readChild>=toRead){
                toRead=count;
                if(count!=0) {
                    max++;
                }
                count=0;
                readChild=0;
            }
        }
        return max;
    }
}
