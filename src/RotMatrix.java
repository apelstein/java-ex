public class RotMatrix {

    public void printMat(int[][] mat){

        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j < mat[0].length-1; j++){
                System.out.print(mat[i][j] + ", ");
            }
            System.out.print(mat[i][mat.length-1]+"\n");
        }
    }

    public int[][] rotate(int[][] mat){
        int n = mat.length;
        int[][] res = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                res[j][n-1-i] = mat[i][j];
            }
        }
        return res;
    }

    public void rotateInPlace(int[][] mat){
        int n = mat.length;
        for(int i = 0; i < n/2; i++){
            int last = n - i - 1;
            int first = i;
            for(int j = first; j < last; j++){
                int offset = j - first;
                int corner = mat[first][j];
                mat[first][j] = mat[last-offset][first];
                mat[last-offset][first] = mat[last][last-offset];
                mat[last][last-offset] = mat[first + offset][last];
                mat[first + offset][last] = corner;

            }
        }
    }
}
