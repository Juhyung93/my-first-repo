package chapter_03;

public class _03_String3 {
    public static void main(String[] args) {
        String s1="Java";
        String s2="Python";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals("Java"));
        System.out.println(s1.equals("java"));
        System.out.println(s1.equalsIgnoreCase("java"));

        s1="1234"; //벽에 붙은 메모지
        s2="1234"; //같은값이 이미 있을때 s1,s2 같은곳을 참조함
        System.out.println(s1.equals(s2)); //true (내용)
        System.out.println(s1==s2); //true (참조)

        s1=new String("1234");
        s2=new String("1234");
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        //문자열에서 내용 비교시 equals를 쓰는게맞음
    }
}
