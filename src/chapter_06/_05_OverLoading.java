package chapter_06;

public class _05_OverLoading {
    //메소드 오버로딩
    //같은 이름의 메소드를 여러번 선언
    //1. 전달값의 타입이 다르거나
    //2. 전달값의 갯수가 다르거나
    public static int getPower(int number){
        int result=number*number;
        return result;
    }
    public static int getPower(String strNumber){
        int number=Integer.parseInt(strNumber);
        return number*number;
    }
    public static int getpower(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getPower(3));
        System.out.println(getPower("4")); //같은이름으로 불러올때 전달값을 따라 메소드를 실행함
        System.out.println(getpower(3,3)); //전달값의 개수에 따라서도 메소드를 골라 실행함
    }
}
