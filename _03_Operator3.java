package Chapter_02;

public class _03_Operator3 {
    public static void main(String[] args) {
        // 비교 연산자
        System.out.println(5 > 3); // 5는 3보다 크다 true
        System.out.println(5 >= 3); // 5는 3보다 크거나 같다 true
        System.out.println(5 >= 5); //true
        System.out.println(5 >= 7); //false

        System.out.println(5 < 3); //false
        System.out.println(5 <= 3); //5는 3보다 작거나 같다 f

        System.out.println(5 == 5); //5는 5와 같다 프로그램에서 =하나는 대입연산이라
        System.out.println(5 != 5); //5는 5와 같지 않다
        System.out.println(5 != 3); //t
    }
}
