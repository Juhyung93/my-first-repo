package chapter_04;

public class _01_If {
    public static void main(String[] args) {
        int hour=12;
        if(hour>14 && hour>12){  //2개 이상일때는 중괄호 무조건
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷추가");
            System.out.println("샷추가3");
        }
        System.out.println("커피 주문 완료");
    }
}
