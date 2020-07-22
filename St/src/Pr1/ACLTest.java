package Pr1;

//  Goof Sbstraction을 달성하기 위한 최소한 두가지 조건
//  1. 사용하는 데이터와
//     해당 데이터를 제어할 수 있는 기능(매서드)을 캡슐화한다.
//  2. 정보 은닉(공개할 필요 없는 정보는 은닉한다.)
class ACL
{
    private int x, y;
    public ACL(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

public class ACLTest {
    public static void main(String[] args) {
        ACL acl = new ACL(3, 5);
        System.out.println("x = " + acl.getX() + ", y = " + acl.getY() );
    }
}
