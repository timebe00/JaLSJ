package Pr2;

//  산술 연산에 대한 예외츷 처리할 수 있는 위임받은 클래
class DBZException extends ArithmeticException
{
    public DBZException()
    {
        super("0으로 나누면 안돼!");
    }
}

public class ThrowExceptionTest {
    public static double quo(int n, int d)
    {
        if(d == 0)
        {
            //   throw를 사용하는 것은 예외처리를 수행할 수 있는

            throw new DBZException();
        }

        System.out.println("How ?");
        return (double) n / d;
    }

    public static void main(String[] args) {
        double result;
        try
        {
            result = quo(1, 0);
        }
        catch (DBZException e)
        {
            System.out.println(e.toString());
        }

        System.out.println("Finish it!");
    }
}
