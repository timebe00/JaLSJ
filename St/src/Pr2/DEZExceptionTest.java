package Pr2;

public class DEZExceptionTest {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;

        //  오류가 발생하는 원인은 아래 코드 때문이다.
        try
        {
            //  오류가 발생하는 원인은 아래 코드 때문이다.
            //  try를 사용하는 녀걱들을 잔배잭 오류를 내포한 녀석들이
            //  오류를 유발할 수도 읶겠는데 한는 경우 try에 넣으면 된다.

            int result = x / y;

        //  실제 divide by zwro 오류는 CPU에서 감지하는 HW 오류다.
        //  운영체제 동작 메커니즘 상
        //  이것이 원래 kernel이라는 os가 처리한다
        //  하지만 catch구문을 사용해서 내가 대신 처리할게라고
        //  os에게 요청하며 실질적으로 해당 오류가 발생하면
        //  운영체제 처리 작업을   catch쪽으로 위임히게 된다.

        }
        catch (ArithmeticException e)
        {
            System.out.println("0으로 나누기 ㄴㄴ");
        }
        System.out.println("왓 더 f....");
    }
}
