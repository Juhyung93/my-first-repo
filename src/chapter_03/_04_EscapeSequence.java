package chapter_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        //특수문자, 이스케이프 문자
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        System.out.println("자바가\n너무\n재밌어요\n");

        //해물파전  9000원
        //김치전  8000원
        //부추전  7000원
        System.out.println("해물파전\t9000원");
        System.out.println("김치전\t9000원");
        System.out.println("부추전\t9000원");

        //\\"역슬래쉬
        System.out.println("C:\\Program Files\\Java"); //역슬레쉬 2개를 작성해야 역슬래쉬 하나로 인식함

        //\":큰 따옴표
        //단비가 "냐옹"이라고 했어요
        System.out.println("단비가 \"냐옹\"이라고 했어요");

        //단비가 '뭘봐?'라는 표정을 지었어요
        System.out.println("단비가 \'뭘봐?\'라는 표정을 지었어요");
        System.out.println("단비가 '뭘봐?'라는 표정을 지었어요");
        //둘다 작동됨, 그럼 언제 사용하나
        char c='A';
        //c=''';
        c='\'';
        System.out.println(c);
    }
}
