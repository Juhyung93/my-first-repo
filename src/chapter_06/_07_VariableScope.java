package chapter_06;

public class _07_VariableScope {
    int number=0;
    public static void methodA(){
        //System.out.println(number);
    }
    public static void methodB(){
        int result=1;
    }
    public static void main(String[] args) {
        int number=3;

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
