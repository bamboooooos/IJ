package cla;

public class C165 {
    /**
     * @param l1: ListNode l1 is the head of the linked list
     * @param l2: ListNode l2 is the head of the linked list
     * @return: ListNode head of linked list
     */
    ListNode result;
    ListNode nextNode;
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1!=null&&l1!=null){
            if(l1.val>l2.val){
                nextNode=l2;
                result=nextNode;
                l2=l2.next;
            }else{
                nextNode=l1;
                result=nextNode;
                l1=l1.next;
            }
        }else{
            if(l1==null){
                nextNode=l2;
                result=nextNode;
                l2=l2.next;
            }else{
                nextNode=l1;
                result=nextNode;
                l1=l1.next;
            }
        }
        while(l1!=null||l2!=null){
            if(l1==null){
                nextNode.next=l2;
                nextNode=nextNode.next;
                l2=l2.next;
            }else{
                if(l2==null){
                    nextNode.next=l1;
                    nextNode=nextNode.next;
                    l1=l1.next;
                }else{
                    if(l1.val>l2.val){
                        nextNode.next=l2;
                        nextNode=nextNode.next;
                        l2=l2.next;
                    }else{
                        nextNode.next=l1;
                        nextNode=nextNode.next;
                        l1=l1.next;
                    }
                }
            }
        }
        return result;
    }
}


