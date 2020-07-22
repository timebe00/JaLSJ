package Pr1;

class StaticMethod
{
    //  어떤 것들을 static 매서드로 만드는게 좋을까?
    //  빈번한 입력에 대해서 static 매서드를 적용해 주면
    //  구지 쓸대없이 new를 할 필요가 없어진다.
    public static void test()
    {
        System.out.println("test");
    }
}

public class StaticMethodTest {
    public static void main(String[] args) {
        StaticMethod.test();
    }
}
