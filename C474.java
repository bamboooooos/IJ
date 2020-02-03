package cla;

import java.util.*;

public class C474 {
    /*
     * @param root: The root of the tree
     * @param A: node in the tree
     * @param B: node in the tree
     * @return: The lowest common ancestor of A and B
     */
    ArrayList<ParentTreeNode> AParents=new ArrayList<>();
    ArrayList<ParentTreeNode> BParents=new ArrayList<>();
    public ParentTreeNode lowestCommonAncestorII(ParentTreeNode root, ParentTreeNode A, ParentTreeNode B) {
        // write your code here
        ParentTreeNode parent=A.parent;
        AParents.add(A);
        BParents.add(B);
        while(parent!=null){
            AParents.add(parent);
            parent=parent.parent;
        }
        parent=B.parent;
        while(parent!=null){
            BParents.add(parent);
            parent=parent.parent;
        }
        if(AParents.size()<BParents.size()){
            for(ParentTreeNode Aparent:AParents){
                for(ParentTreeNode Bparent:BParents){
                    if(Aparent==Bparent){
                        return Aparent;
                    }
                }
            }
        }else{
            for(ParentTreeNode Bparent:AParents){
                for(ParentTreeNode Aparent:BParents){
                    if(Bparent==Aparent){
                        return Bparent;
                    }
                }
            }
        }
        return null;
    }
}
