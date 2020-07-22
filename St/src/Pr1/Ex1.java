package Pr1;

class Vehicle
{
    int a = 100;
    public Vehicle()
    {
        System.out.println("Vehicle : " + a);
    }
}

class Airplane extends Vehicle
{
    int b = 200;
    public Airplane()
    {
        System.out.println("Airplan : " + b);
        System.out.println("Airplan super : " + super.a);
    }
}

class Car2 extends Vehicle
{
    int c = 300;
    public Car2()
    {
        System.out.println("Car2 : " + c);
        System.out.println("Car2 super : " + super.a);
    }

}

public class Ex1 {
    public static void main(String[] args) {
        Airplane a = new Airplane();
        Car2 c2 = new Car2();
        Vehicle v = new Vehicle();
    }
}
