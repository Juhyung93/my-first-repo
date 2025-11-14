package chapter_01;

public class _03_Variable {
    public static void main(String[] args) {
        String Name="박주형님";
        int hour=22;
        double score=3.123456789;
        char grade='A';
        boolean pass=true;
        System.out.println(Name+"어서오세요"+hour+"안에 옵니다"+score+"점수는"+grade);
        Name="이선종님";
        System.out.println(Name+"어서오세요"+hour+"안에 옵니다"+score+"점수는"+grade+"합격했을가요"+pass);

        float test=3.123456789F;
        System.out.println(Name+"어서오세요"+hour+"안에 옵니다"+test+"점수는"+grade+"합격했을가요"+pass);
        long i=100000000000L;
    }
}
