import java.util.Scanner;

class Matrix
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter the no of cols: ");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.println("Enter value: ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(arr[i][j] + " ");
            }
        System.out.println();
        }
    }
}
