package Day2;

import java.lang.Math;
/**
 * Assignment2 - Finds the location of the greatest value in 2d array
 * @author - Kaxian Situ
 */

 public class Assignment2{

    public static void main(String[] args) {
        int[][] twoD_arr= new int[10][10];

        for(int i = 0;i<10;i++) //populates 2d array with numbers from 1-1000
        {
            for(int j = 0; j<10;j++)
            {
                twoD_arr[i][j]= (int)(Math.random()*999+1);
            }
        }

        int max = Integer.MIN_VALUE;
        int col=0;
        int row=0;
        for(int i = 0;i<10;i++) //find and return the biggest value
        {
            for(int j = 0; j<10;j++)
            {
                if(max<twoD_arr[i][j])
                {
                    col = i;
                    row = j;
                    max = twoD_arr[i][j];
                }
            }
        }
        System.out.printf("The biggest number in array is %d on row %d, column %d", max, row, col);
    }
 }