package chapter_03;

public class Quiz3 {
    public static void main(String[] args) {
        String validateNo="931123-1010329";
        //System.out.println(validateNo.substring(0,8));
        System.out.println(validateNo.substring(0,validateNo.indexOf("-")+2));
        System.out.println(validateNo.indexOf("-"));

    }
}
