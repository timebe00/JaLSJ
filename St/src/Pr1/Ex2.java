package Pr1;

class Met
{
    int agv = 0;
    double dev = 0.0;
    public Met(int a[])
    {
        int sum = 0;
        for(int i = 0; i < a.length; i++)
        {
            sum += a[i];
        }
        agv = sum/a.length;
        sum = 0;
        for(int i = 0; i<a.length; i++)
        {
            sum += Math.pow((a[i] - agv),2);
        }
        dev = Math.sqrt((sum/a.length));
    }
}

class St1 extends Met
{
    public St1(int a[])
    {
        super(a);
        System.out.println(super.agv);
        System.out.println(super.dev);
    }
}

class St2 extends Met
{
    public St2(int b[])
    {
        super(b);
        System.out.println(super.agv);
        System.out.println(super.dev);
    }
}

public class Ex2 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {5,6,7,8};
        St1 s_1 = new St1(a);
        St2 s_2 = new St2(b);
    }
}
