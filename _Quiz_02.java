package Chapter_02;

public class _Quiz_02 {
    public static void main(String[] args) {

        // 어린이 키 놀이기구 탑승 가능 여부

        // 조건 1 120cm이상 탑승가능
        // 조건 2 삼항 연산자 이용

        //결과 키가 115cm이므로 탑승 불가능합니다 //값이 115인 경우
        //    키가 121cm 이므로 탑승 가능합니다 //값이 121인 경우

        int a = 115;
        int b = 121;
        String C = (a >=120) ? "탑승 가능합니다.": "탑승 불가능 합니다.";
        System.out.println("키가 115cm 이므로 " +C);
        String D = (b >=120) ? "탑승 가능합니다.": "탑승 불가능 합니다.";
        System.out.println("키가 121cm 이므로 " +D);

        //아쉬운점 >= 으로 했어야 됬는데 >만함 ;
        // a어린이 b어린이 나누지 않고 그냥 int height = ??; 로 할 수도 있긴한데
        // 결과 값이 두 줄로 나와 있어서 두 줄로 한건 맞는듯



    }
}
