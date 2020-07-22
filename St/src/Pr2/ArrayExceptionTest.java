package Pr2;

public class ArrayExceptionTest {
    public static void main(String[] args) {
        int[] arr = new int[10];

        try
        {
            arr[11] = 100;
        }
        //  배열에 할당된 크기 이상의 작업을 수행하려고 할때 발생한다.
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("범위 버어났으니깐 잘 맞춰라");
        }
        System.out.println("왓 더");
    }
}
