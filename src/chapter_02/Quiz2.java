package chapter_02;

public class Quiz2 {
    public static void main(String[] args) {
        int height=115;
        String result=(height>120)?("탑승 가능합니다"):("탑승 불가능합니다");
        System.out.println("키가 "+height+"이므로 "+result);
        height=121;
        result=(height>120)?("탑승 가능합니다"):("탑승 불가능합니다");
        System.out.println("키가 "+height+"이므로 "+result);

    }
}
