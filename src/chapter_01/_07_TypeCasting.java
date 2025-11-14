package chapter_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        //형변환 정수형에서 실수형으로, 실수형에서 정수형으로

        //int score=93+93.8;

        int score=93;
        System.out.println(score);
        System.out.println((double)score);
        System.out.println((float)score);

        float score_f=93.2F;
        double score_d=93.3;
        System.out.println((int)score_f);
        System.out.println((int)score_d);

        //숫자를 문자열로
        String s1 =String.valueOf(93);
        s1= Integer.toString(97);
        System.out.println(s1);

        String s2 = "98.8";
        s2=Double.toString(98.8);
        System.out.println(s2);

        //문자열을 숫자로
        int i=Integer.parseInt("93");
        double d=Double.parseDouble("93.2");
        System.out.println(i);
        System.out.println(d);
        System.out.println("98.8");
        System.out.println(98.8);
    }
}
