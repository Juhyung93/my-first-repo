package chapter_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        String[]coffees={"아메리카노","카페모카","라뗴","카푸치노"};
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i]);
        }

        for (String Coffee:coffees){
            System.out.println(Coffee);
        }


    }
}
