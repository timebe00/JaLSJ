package Pr1;

class Parent
{
    int a = 10;
    void b()
    {
        System.out.println("Parent b()");
    }
}


//  자바에서 상속을 사용할 때는  extends를 붙인다.
class Child extends Parent
{
    int a = 20;
    void b()
    {
        System.out.println("Child b()");
    }
    void c()
    {
        System.out.println("Child c()");
    }
}

public class ExtenTest {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.b();
        System.out.println("Parent p : " + p.a);

        Child c = new Child();
        c.b();
        c.c();
        System.out.println("Child c : " + c.a);

        //  데이터 타입은 Parent고
        //  실제 할당한 정보는 Child이기 때문이다.
        Parent p2 = new Child();
        p2.b();
        System.out.println("Parent p2 : " + p2.a);
    }
}
