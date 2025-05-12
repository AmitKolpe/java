
import java.util.Scanner;



class matrix{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter the number of row:");
        int row = sc.nextInt();
        System.out.println("Enter the number of colums:");
        int col = sc.nextInt();
        
        int[][] matrix1 = new int[row][col];
        int[][] matrix2 = new int[row][col];
        int[][]result = new int[row][col];


        System.out.println("Enter element of 1st matrix:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter element of 2nd matrix:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix2[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                result[i][j]= matrix1[i][j]+ matrix2[i][j];
            }
        }

        System.out.println("Sum of Two matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println(result[i][j]+" ");
            }
            System.out.println();
        }
    




    }
}