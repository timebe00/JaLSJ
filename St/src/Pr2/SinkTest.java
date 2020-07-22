package Pr2;

import java.util.function.DoubleToIntFunction;

class Bank2      //  Critical Section(크리티컬 섹션)
{
    private int money = 10000;
    public  int getMoney()
    {
        return money;
    }

    public synchronized void saveMoney(int save)
    {
        for(int i = 0; i < 1000; i++)
        {
            int m = this.getMoney();

            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.money = m + save;
            System.out.println("현재금액(save) : " + this.money);
        }
    }

    public synchronized void useMoney(int minus)
    {
        for(int i = 0; i < 1000; i++)
        {
            int m = this.getMoney();
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            this.money = m - minus;
            System.out.println("현제금액(use) : " + this.money);
        }
    }
}
//  for문 밖에 synchro를 걸 경우 데이터의 보호가 불완전할 수 있다.
//  그러므로 실질적인 연산을 수행하는 경우에 대해서
//  건 바이 건으로 대응하도록 lock을 걸어 문제를 해결하도록 한다.
class C extends Thread {
    public void run() {
        SinkTest.myPrivateBank.saveMoney(3000);
        System.out.println("saveMoney(3000): " +
                SinkTest.myPrivateBank.getMoney());
    }
}

class D extends Thread {
    public void run() {
        SinkTest.myPrivateBank.useMoney(1000);
        System.out.println("useMoney(1000): " +
                SinkTest.myPrivateBank.getMoney());
    }
}

public class SinkTest {
    public static Bank2 myPrivateBank = new Bank2();

    public static void main(String[] args) {
        System.out.println("원금: " +
                myPrivateBank.getMoney());

        C c = new C();
        D d = new D();

        c.start();
        d.start();
    }
}
