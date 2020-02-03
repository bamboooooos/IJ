package cla;

public class C365 {
    public int countOnes(int num) {
        int counts=0;
        for(int i=0;i<32;i++){
            if(num%2!=0)
                counts++;
            num=num>>1;
        }
        return counts;
    }
}
