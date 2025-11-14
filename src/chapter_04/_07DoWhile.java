package chapter_04;

public class _07DoWhile {
    public static void main(String[] args) {
        //do while은 무조건 한번은 실행함
        int move=5;
        do{
            System.out.println("발차기를 계속합니다.");
            System.out.println(move);
            move +=3;
        }while(move<3);
    }
}
