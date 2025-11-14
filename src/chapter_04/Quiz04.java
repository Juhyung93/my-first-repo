package chapter_04;

public class Quiz04 {
    public static void main(String[] args) {
        int hour=4;
        int fee=hour*4000;
        int maxDayCost=30000;
        boolean smallCar=true;
        boolean disCar=true;

        if (fee>maxDayCost){
            fee=maxDayCost;
        }
        if(smallCar||disCar){
            fee/=2;
        }
        System.out.println(fee);
    }
}
