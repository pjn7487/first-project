package Chapter_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean 김치찌개 = true;
        boolean 계란말이 = true;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음); //하나라도 true면 true
        System.out.println(김치찌개 && 계란말이 && 제육볶음); //모두true여야 true


        // And 연산
        System.out.println(((5 > 3) && (3 > 1) )); //true
        System.out.println(((5 > 3) && (3 < 1) )); //false

        // Or 연산
        System.out.println((5 > 3) || (3 > 1)); //true
        System.out.println((5 > 3) || (3 < 1)); //true
        System.out.println((5 < 3) || (3 < 1)); //false

        // 1<3<5 같은건 불가능

        // 논리 부정 연산자
        System.out.println(!true); //f
        System.out.println(!false); // t
        System.out.println(!(5 ==5)); //f



    }
}
