package chapter_06;

public class _03_Return {
    //호텔 전화번호
    public static String getPhoneNumber(){ //return일때 void대신 형 작성 //반환값 없을 시 void
        String phoneNumber="02-1234-5678";
        return phoneNumber;
    }
    //호텔 주소
    public static String getAddress(){
        return "서울시 어딘가";
    }
    //호텔 액티비티
    public static String getActivity(){
        return "탁구장,볼링장.노래방";
    }
    public static void main(String[] args) {
        //반환값
        String contactNumber=getPhoneNumber();
        System.out.println(contactNumber);
        String address=getAddress();
        System.out.println(address);
        System.out.println(getActivity());
    }
}
