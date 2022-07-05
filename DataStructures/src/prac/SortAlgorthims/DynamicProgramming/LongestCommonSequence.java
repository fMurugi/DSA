package prac.SortAlgorthims.DynamicProgramming;

import java.util.Arrays;

public class LongestCommonSequence {
    public static void lcs(char s [],char t []){
        int rows=s.length+1;
        int columns = t.length+1;

        int [][] cost=new int [rows][columns];///create a 2 d array or table

        //fill the first row with zeros and columns  with zeros
        for(int i = 0;i<columns;i++){
            cost[0][i] = 0;
        }
        for(int i = 0;i<rows;i++){
            cost[i][0] = 0;
        }


        //loop through the two strings while filling the table
        for(int i=0;i<s.length;i++){
            for(int j = 0;j<t.length;j++){
                int costRows = i+1;  // start filling the tale from index 1,1
                int costColumns = j+1;

                if(s[i]==t[j]){
                    cost[costRows][costColumns] = 1+cost[costRows-1][costColumns-1];
                }else{
                    if(cost[costRows][costColumns-1]>cost[costRows-1][costColumns]){
                        cost[costRows][costColumns] = cost[costRows][costColumns-1];
                    }else{
                        cost[costColumns][costRows] = cost[costRows-1][costColumns];
                    }
                }
            }

        }

        //take the last index of the two cross sections to be the length of lcs
        int index = cost[rows-1][columns-1];
        System.out.println("length of longest common subsequence: "+index);

        char lcs [] = new char [index ];
        int temp = index-1;

        int  m = s.length-1, n =t.length-1;
        while(m>=0 && n>=0){
            if(s[m]==t[n]){
                lcs [temp]=s[m];
                temp--;
                m--;
            } else if (cost[m-1][n]>cost[m][n-1]) {
                m--;

            }
            n--; //move one column upwards
        }

        System.out.println(Arrays.toString(lcs));
    }

    public static void main(String[] args) {
        char []x  = {'a','b','a','a','b','a'};
        char [] y = {'b','a','b','b','a','b'};

        lcs(x,y);
    }


}
