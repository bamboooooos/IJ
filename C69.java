package cla;

import java.util.*;

public class C69 {
    /**
     * @param root: A Tree
     * @return: Level order a list of lists of integer
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        // write your code here
        ArrayList<TreeNode> nodes=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        if(root!=null) {
            nodes.add(root);
            ArrayList<Integer> firstVal=new ArrayList<>();
            firstVal.add(root.val);
            result.add(firstVal);
        }
        int readChild=0;
        int count=0;
        int toRead=1;
        List<Integer> oneOrTwoNodes=new ArrayList<>();
        while(nodes.size()>0){
            root=nodes.get(0);
            nodes.remove(0);
            readChild++;
            if(root.left!=null){
                nodes.add(root.left);
                count++;
                oneOrTwoNodes.add(root.left.val);
            }
            if(root.right!=null){
                nodes.add(root.right);
                count++;
                oneOrTwoNodes.add(root.right.val);
            }
            if(readChild>=toRead){
                if(count!=0) {
                    result.add(oneOrTwoNodes);
                }
                toRead=count;
                count=0;
                readChild=0;
                oneOrTwoNodes=new ArrayList<>();
            }
        }
        return result;
    }
}
