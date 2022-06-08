import java.util.Arrays;
import java.util.Scanner;

public class Marks {
    public static void main(String[]args){
//        int [][]marks =new int[3][3];

        int sum=0;
        int total=0;
       int[][] marks={
                {10,20,40,30,20},
                {10,20,30,20,20},
                {10,20,15,65,68}

        };

        for(int i =0;i<3;i++){
            for(int j = 0;j<2;j++){
                System.out.print(marks[i][j]+" ");
               sum = sum+marks[i][j];
            }
            System.out.println(sum);

            System.out.println();
        }

    }
}
