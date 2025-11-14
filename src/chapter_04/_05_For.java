package chapter_04;

public class _05_For {
    public static void main(String[] args) {
/*        for (int i = 0; i < 10; i++) {
            System.out.println("안녕하세요 니코입니다"+i);
        }*/
/*        for (int i = 0; i < 10; i++) {
            if (i % 2==0) {
                System.out.println("안녕하세요 니코입니다"+i);
            }
        }*/
        for (int i = 0; i <10 ; i++) {
            System.out.print(i);
        }
        System.out.println();
        for (int i = 0; i <10 ; i+=2) {
            System.out.print(i);
        }
        System.out.println();
        for (int i = 1; i <10 ; i+=2) {
            System.out.print(i);
        }
        System.out.println();
        int sum=0;
        for (int i = 1; i <11 ; i++) {
            sum+=i;
            System.out.println(sum);
        }
        for (int i = 1; i <=10 ; i++) {
            System.out.print(i);
        }
    }
}
