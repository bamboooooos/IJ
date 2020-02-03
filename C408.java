package cla;

public class C408 {
    /**
     * @param a: a number
     * @param b: a number
     * @return: the result
     */
    public String addBinary(String a, String b) {
        int aLength=a.length();
        int bLength=b.length();
        boolean add=false;
        String result="";
        if(bLength<aLength){
            int t=bLength;
            bLength=aLength;
            aLength=t;
            String c=a;
            a=b;
            b=c;
        }
        int i;
        for(i=1;i<=aLength;i++){
            if(a.charAt(aLength-i)==b.charAt(bLength-i)){
                if(a.charAt(aLength-i)=='1'){
                    if(add){
                        result+="1";
                    }else{
                        result+="0";
                        add=true;
                    }
                }else{
                    if(add){
                        result+="1";
                        add=false;
                    }else{
                        result+="0";
                    }
                }
            }else{
                if(add){
                    result+="0";
                }else{
                    result+="1";
                }
            }
        }
        for(;i<=bLength;i++){
            if(!add){
                for(;i<=bLength;i++){
                    result+=b.charAt(bLength-i);
                }
                break;
            }
            if(b.charAt(bLength-i)=='1'){
                result+="0";
            }else{
                result+="1";
                add=false;
            }
        }
        if(add){
            result+="1";
        }
        return new StringBuilder(result).reverse().toString();
    }
}
