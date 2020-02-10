package cla;

import java.util.*;
public class C374 {
    /**
     * @param matrix: a matrix of m x n elements
     * @return: an integer list
     */
    public List<Integer> spiralOrder(int[][] matrix) {
        // write your code here
        List<Integer> result=new ArrayList<>();
        int m=matrix.length;
        int n=0;
        if(m!=0){
            n=matrix[0].length;
        }
        for(int i=0;i<m/2&&i<n/2;i++){
            for(int j=i;j<n-i;j++){
                result.add(matrix[i][j]);
            }
            for(int j=i+1;j<m-i;j++){
                result.add(matrix[j][n-i-1]);
            }
            for(int j=n-i-2;j>=i;j--){
                result.add(matrix[m-i-1][j]);
            }
            for(int j=m-i-2;j>=i+1;j--){
                result.add(matrix[j][i]);
            }
        }
        if(m>=n&&n%2!=0){
            System.out.println("1");
            int i=n/2;
            for(int j=i;j<m-i;j++){
                result.add(matrix[j][i]);
            }
        }
        else if(n>m&&m%2!=0){
            System.out.println("2");
            int i=m/2;
            for(int j=i;j<n-i;j++){
                result.add(matrix[i][j]);
            }
        }
        return result;
    }
}
