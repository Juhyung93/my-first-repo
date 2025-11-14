package chapter_01;

public class _05_VariableName {
    public static void main(String[] args) {
        //변수 이름짓는법
        //1. 저장할 값에 어울리는 이름
        //2. 밑줄, 문자, 숫자 사용 가능 (공백 사용 불가)
        //3. 밑줄 또는 문자로 시작 가능
        //4. 한 단어 또는 2개 이상 단어 연속
        //5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어는 제외)
        //6. 예약어 사용 불가 (public, static, void, int, ...)

        //입국 신고서(여행)
        String nationality = "대한민국";
        String firstName = "주형";
        String lastName = "박";
        String dateOfBirth = "1993-11-23";
        String residentialAddress = "무슨호텔";
        String flightNo="KE657";
        String _flightNo="KE657";
        String flight_no_2="KE657";
        String item1="안경";
        String item2="안경";
        //String 3item="안경";

        //절대 변하지 않는 상수는 대문자로 , 상수앞에는  final
        final String CODE="KR";
        //CODE = "US";
    }
}
