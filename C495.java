package cla;

import java.util.*;
public class C495 {
    /*
     * @param x: An integer
     * @return: nothing
     */
    private ArrayList<Integer> nodes=new ArrayList<>();
    private int length=-1;
    public void push(int x) {
        // write your code here
        length++;
        if(length<=nodes.size()-1)
            nodes.set(length,x);
        else
            nodes.add(x);
    }

    /*
     * @return: nothing
     */
    public void pop() {
        // write your code here
        if(length>=0){
            nodes.remove(length);
            length--;
        }
    }

    /*
     * @return: An integer
     */
    public int top() {
        // write your code here
        return nodes.get(length);
    }

    /*
     * @return: True if the stack is empty
     */
    public boolean isEmpty() {
        // write your code here
        return length==-1;
    }
}
