package com.lohit;

public class Leetcode74 {
    public static void main(String[] args) {

    }
    static boolean findinMatrix(int [][]matrix, int x)
    {
        if(matrix== null|| matrix.length==0||matrix[0].length==0)
        {
            return false;
        }
        int rIndex= matrix.length-1;
        int colIndex=matrix[0].length-1;
        while(colIndex>=0 && rIndex<= matrix.length-1)
        {
            int currentVal= matrix[rIndex][colIndex];
            if(x>currentVal)
            {
                rIndex++;
            }else {
                colIndex--;
            }
        }return false;
    }
}
