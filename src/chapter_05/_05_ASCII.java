package chapter_05;

public class _05_ASCII {
    public static void main(String[] args) {
/*        char c='a'; //대문자는 65부터 소문자는 97부터, 숫자는 48부터
        System.out.println(c);
        System.out.println((int)c);*/
        String[][]seats3=new String[10][15];
        char ch='A';
        for (int i = 0; i < seats3.length ; i++) {//세로
            for (int j = 0; j <seats3[i].length ; j++) {
                seats3[i][j]=String.valueOf(ch)+(j+1);
                System.out.print(seats3[i][j]+" ");
            }
            ch++;
            System.out.println();
        }
    }
}
