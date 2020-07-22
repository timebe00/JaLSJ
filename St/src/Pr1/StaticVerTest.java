package Pr1;

class StaticVar{
    static int staticNum = 0;
    public StaticVar()
    {
        staticNum++;
        System.out.println("Num: " + staticNum);
    }
}

public class StaticVerTest{
    //  매서드에  static이 붙은 경우는?
    //  초기에 JVM이 구동되면서
    //  디폴트로 올려주는 메서드에는
    //  static이 붙어 있다.
    //  static
    public static void main(String[] args) {
        StaticVar sv1 = new StaticVar();
        StaticVar sv2 = new StaticVar();
        StaticVar sv3 = new StaticVar();
    }
}
