package chapter_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s="I like Java and Python and C.";
        System.out.println(s);

        //문자열의 길이
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        System.out.println(s.contains("Java"));
        System.out.println(s.indexOf("Java"));
        System.out.println(s.indexOf("and")); //위치
        System.out.println(s.lastIndexOf("and")); //마지막 and  위치
        System.out.println(s.startsWith("I like")); //마지막 and  true/false
        System.out.println(s.endsWith(".")); //true/false
    }
}
