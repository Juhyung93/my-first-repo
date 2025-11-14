package chapter_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        //if else 문 사용
/*        int ranking=1;
        if (ranking == 1) {
            System.out.println("전액 장학금");
        } else if (ranking==2||ranking==3) {
            System.out.println("반액 장하금");
        } else{
            System.out.println("장학금 대상 아님");
        }*/

        //switchc case
        int ranking=2; //switch는 정확한 값 비교 (==)만 가능
        switch (ranking){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2: //break 안써놓으면 다음거가 실행됨
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상이 아닙니다");
        }
    }
}
