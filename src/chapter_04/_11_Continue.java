package chapter_04;

public class _11_Continue {
    public static void main(String[] args) {
        //Continue
        int max=20; //최대 판매수량
        int sold=0; //현재 판매수량
        int noShow=17;
        for (int i = 1; i < 50; i++) {
            System.out.println(i+"주문하신 치킨 나왔습니다.");
            if(i==noShow){
                System.out.println(i+"번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                 continue; //for문 아래에있는걸 건너뛰고 다음 i로 넘어감
            }
            sold++;
            if (sold == max) {
                System.out.println("주문하신 치킨이 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");

        sold=0;
        int index=1;
        while(index<50){
            index++;
            System.out.println(index+"번손님 주문하신 치킨나왔습니다.");

            if (index==noShow){
                System.out.println(index+"번 손님, 주문하신 치킨 나왔습니다.");
                continue;
            }
            sold++;
            if (sold == max) {
                System.out.println("금일 재고가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");
    }
}
