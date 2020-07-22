package Pr2;

import java.util.function.DoubleToIntFunction;

class Bank      //  Critical Section(크리티컬 섹션)
{
    private int money = 10000;
    public  int getMoney()
    {
        return money;
    }
    public void saveMoney(int save)
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

    public void useMoney(int minus)
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
            System.out.println("현재금액(use) : " + this.money);
        }
    }
}

class A extends Thread
{
    public  void run()
    {
        NoSyncTest.myPtivateBank.useMoney(3000);
        System.out.println("saveMoney(3000)" + NoSyncTest.myPtivateBank.getMoney());
    }
}
class B extends Thread
{
    public  void run()
    {
        NoSyncTest.myPtivateBank.useMoney(3000);
        System.out.println("saveMoney(3000)" + NoSyncTest.myPtivateBank.getMoney());
    }
}

public class NoSyncTest {
    public static Bank myPtivateBank = new Bank();
    public static void main(String[] args) {
        System.out.println("원금" + myPtivateBank.getMoney());

        A a = new A();
        B b = new B();

        a.start();
        b.start();
        //Bank bank = new Bank();

    }
}
