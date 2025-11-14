package chapter_05;

public class Quiz05 {
    public static void main(String[] args) {
        String[] Size=new String[10];
        for (int i = 0; i < Size.length; i++) {
            Size[i]="사이즈 "+(250+5*i)+" (재고 있음)";
            //System.out.println(Size[i]);
        }
        for(String Sizes:Size){
            System.out.println(Sizes);
        }
    }
}
