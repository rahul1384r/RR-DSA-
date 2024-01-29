import java.util.Scanner;

public class spiral_matrix_2darray {
    public static void main(String[] args) {
        int arr[][]=new int[4][4];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        // spiral matrix code
        int startRow=0;
        int endRow=arr.length-1;
        int startCol=0;
        int endCol=arr[0].length-1;

        while(startRow<=endRow && startCol<=endCol){
            // top
            for(int j=0;j<=endCol;j++){
                System.out.print(arr[startRow][j]);
            }
            // right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(arr[i][endCol]);
            }
            // bottom
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(arr[endRow][j]);
            }
            // left
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(arr[i][startCol]);
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        
    }
}
