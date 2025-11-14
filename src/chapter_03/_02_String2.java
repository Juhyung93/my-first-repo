package chapter_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s="  I like Java and Python and C.  ";
        System.out.println(s.replace(" and",",")); //변환
        System.out.println(s.substring(7)); //7번째 위치부터시작 , 문자열 자르기
        System.out.println(s.substring(s.indexOf("Java")));
        System.out.println(s.substring(s.indexOf("Java"),s.indexOf(".")));
        System.out.println(s.substring(7,15));
        System.out.println(s.trim()); //앞뒤 공백 제거

    }
}
