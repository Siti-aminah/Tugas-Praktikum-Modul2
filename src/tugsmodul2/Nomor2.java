package tugsmodul2;

public class Nomor2 {
  public static void main(String[] args){
         int[][] A = {
            {1, 3},
            {5, 7},
            {9, 4}
        };
        
        int[][] B = {
            {5, 6},
            {8, 9},
            {3, 7}
        };
        
        if((A.length == B.length) && (A[0].length == B[0].length)){
            int[][] C = new int[A.length][A[0].length];
            for(int i = 0; i < A.length; i++){
                for(int j = 0; j < A[0].length; j++){
                    C[i][j] = B[i][j] - A[i][j];
                }
            }
            
            for(int[] c: C){
                for(int q: c){
                    System.out.print(q+ " ");
                }
                System.out.println();
            }
            System.out.println("Siti Aminah Dauda");
        }
        else{
            System.out.println("Ukuran matriks tidak sama");
        }
    }
    
}    

