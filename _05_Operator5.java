package Chapter_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        // 삼항 연산자
        //  결과 = (조건) ? (참일 경우 결과갑) : (거짓의 경우 결과값)

        int x = 3;
        int y = 5;

        int max = (x > y) ? x: y;
        System.out.println(max);  //5

        int min = (x < y) ? x:y;
        System.out.println(min);  //3

        boolean b = (x == y) ? true : false; //불리안이니깐 결과가 참거짓값
        System.out.println(b); //false

        String s = (x != y) ? "달라요" : "같아요"; //불리안이 아니니깐 문자로 결과값
        System.out.println(s);





    }
}
