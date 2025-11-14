package chapter_05;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {
/*        String[][]seats=new String[][]{
                {"A1","A2","A3"},
                {"B1","B2","B3"},
                {"C1","C2","C3"}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(seats[i][j]);
            }
        }*/

        String[][]seats3=new String[10][15];
        String[] eng={"A","B","C","D","E","F","G","H","I","J"};
        for (int i = 0; i < seats3.length ; i++) {//세로
            for (int j = 0; j <seats3[i].length ; j++) {
                seats3[i][j]=eng[i]+(j+1);
                System.out.print(seats3[i][j]+" ");
            }
            System.out.println();
        }

    }
}
