// Multi-Dimensional - 2D array

public class TwoDimensionalArray{
    public static void main(String[] args) {

        int[][] mda = {{1,2,3,4},{6,7,8,9}}; // This array has 2 rows and 4 colums

        for(int i=0; i< mda.length; i++){
            for(int j=0; j<mda[i].length; j++){
                System.out.print(mda[i][j] + " ");
            }
            System.out.println();
        }

        // 2-D can also be written like this ->

        int[][] mda2 = new int[2][3];
        mda2[0][0] = 101;
        mda2[0][1] = 102;
        mda2[0][2] = 103;
        mda2[1][0] = 201;
        mda2[1][1] = 202;
        mda2[1][2] = 203;

        System.out.println("new array => \n");
        for(int i=0; i< mda2.length; i++){
            for(int j=0; j<mda2[i].length; j++){
                System.out.print(mda2[i][j] + " ");
            }
            System.out.println();
        }

    }
}
