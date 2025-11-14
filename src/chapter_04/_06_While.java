package chapter_04;

public class _06_While {
    public static void main(String[] args) {
        int distance =25;
        int move = 0;
        while (distance>move){
            System.out.println("발차기를계속합니다");
            System.out.println("현재 이동거리"+move);
            //move+=3;
        }
        System.out.println("도착하였습니다");
    }
}
