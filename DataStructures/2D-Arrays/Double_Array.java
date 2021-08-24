import java.util.Scanner;

class Double_Array
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
        System.out.println("Original Array: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Doubled Array: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(arr[i][j]%2==0)
                continue;
                else
                System.out.print((arr[i][j])*2 + " ");
            }
            System.out.println();
        }
    }
}
