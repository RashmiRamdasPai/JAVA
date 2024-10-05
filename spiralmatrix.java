//Write the elements of matrix in spiral order
import java.util.*;
public class twodarrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns= sc.nextInt();
    
        int matrix[][] = new int[rows][columns];
        int rowBegin =0;
        int rowEnd = rows-1;
        int columnBegin = 0;
        int columnEnd = columns-1;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        while(rowBegin<=rowEnd && columnBegin<=columnEnd){
            for(int j=columnBegin;j<=columnEnd;j++){
                System.out.print(matrix[rowBegin][j]);
            }
            rowBegin++;
            for(int i=rowBegin;i<=rowEnd;i++){
                System.out.print(matrix[i][columnEnd]);
            }
            columnEnd--;
            for(int i=columnEnd;i>=columnBegin;i--){
                System.out.print(matrix[rowEnd][i]);
            }
            rowEnd--;
            for(int i=rowEnd;i>=rowBegin;i++ )
              System.out.print(matrix[i][columnBegin]);
            columnBegin++;

        }
    
    }}
