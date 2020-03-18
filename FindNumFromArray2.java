package cla;

public class FindNumFromArray2 {
    public boolean Find(int target, int [][] array) {
        for(int[] a:array){
            for(int x:a){
                if(x==target){
                    return true;
                }
            }
        }
        return false;
    }
}
