package cla;

import java.util.*;





public class C174 {
    /**
     * @param head: The first node of linked list.
     * @param n: An integer
     * @return: The head of linked list.
     */
    ArrayList<ListNode> list=new ArrayList<>();
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // write your code here
        while(head!=null){
            list.add(head);
            head=head.next;
        }
        list.add(null);
        if(list.size()>n+1) {
            list.get(list.size() - n - 2).next = list.get(list.size() - n );
        }else{
            return list.get(1);
        }
        return list.get(0);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
