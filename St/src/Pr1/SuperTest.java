package Pr1;

class ParentClass
{
    int data = 100;
    public void  print()
    {
        System.out.println( "SupperClass : print()");
    }
}
public class SuperTest extends ParentClass{
    int data = 200;

    public void print()
    {
        super.print();
        System.out.println("SubClass : print()");
        System.out.println(data);
        System.out.println(this.data);
        System.out.println(super.data);
    }

    public static void main(String[] args) {
        SuperTest st = new SuperTest();
        st.print();
    }
}
