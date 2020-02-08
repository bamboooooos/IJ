package cla;

public class C927 {
    /**
     * @param str: a string
     * @return: return a string
     */
    public char[] reverseWords(char[] str) {
        // write your code here
        StringBuilder str5 = new StringBuilder();
        for (char s : str) {
            str5.append(s);
        }
        String[] string=(str5.toString()).split("\\s+");
        String result="";
        for(int i=string.length-1;i>0;i--){
            result+=(string[i]+" ");
        }
        result+=string[0];
        return result.toCharArray();
    }
}
