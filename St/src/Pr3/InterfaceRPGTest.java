package Pr3;

import java.util.Random;

interface SkillSet
{
    public void skill1();
    public void skill2();
}

class Adventure implements SkillSet
{
    private int atk;
    private int def;
    private int mag;
    private int mdef;
    private int dex;
    private int vit;
    private int mental;

    public Adventure(int atk, int def, int mag, int mdef, int dex, int vit, int mental) {
        this.atk = atk;
        this.def = def;
        this.mag = mag;
        this.mdef = mdef;
        this.dex = dex;
        this.vit = vit;
        this.mental = mental;
    }

    @Override
    public void skill1() {
        System.out.println("Damage : " + atk * 1.3);
    }

    @Override
    public void skill2() {
        System.out.println("Stun : 0.5s, Damage : " + atk * 0.4);
    }

    @Override
    public String toString() {
        return "Adventure{" +
                "atk=" + atk +
                ", def=" + def +
                ", mag=" + mag +
                ", mdef=" + mdef +
                ", dex=" + dex +
                ", vit=" + vit +
                ", mental= " + mental +
                '}';
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public int getMag() {
        return mag;
    }

    public int getMdef() {
        return mdef;
    }

    public int getDex() {
        return dex;
    }

    public int getVit() {
        return vit;
    }

    public int getMental() {
        return mental;
    }
}

class Warrior extends Adventure {
    private float anger;

    public Warrior(int atk, int def, int mag, int mdef, int dex, int vit, int mental, float anger) {
        super(atk * 2, def * 2, mag, mdef * 2, dex * 2, vit * 4, mental);
        this.anger = anger;
    }

    public void legacySkill1()
    {

    }


    public void towskill1() {
        //  바뀐 스킬 이펙트 구현
        System.out.println("Damage: " + getAtk() * 3.3 + getDex() * 0.5);
    }


    public void towskill2() {
        System.out.println("Stun 1.0s, Damage: " + getAtk() * 1.2 + getDex() * 0.1);
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "atk=" + getAtk() +
                ", def=" + getDef() +
                ", mag=" + getMag() +
                ", mdef=" + getMdef() +
                ", dex=" + getDex() +
                ", vit=" + getVit() +
                ", mental= " + getMental() +
                "anger=" + anger +
                '}';
    }
}

//  1차 전직 - 전사, 도적, 마법사, 궁수
public class InterfaceRPGTest {
    public static void main(String[] args) {
        Random rand = new Random();
        final int MAX = 10;
        final int BIAS = 10;
        Adventure adv = new Adventure(rand.nextInt(MAX) + BIAS,
                                      rand.nextInt(MAX) + BIAS,
                                      rand.nextInt(MAX) + BIAS,
                                      rand.nextInt(MAX) + BIAS,
                                      rand.nextInt(MAX) + BIAS,
                                      rand.nextInt(MAX) + BIAS,
                                      rand.nextInt(MAX) + BIAS);
        System.out.println(adv);

        adv.skill1();
        adv.skill2();

        Warrior wer = new Warrior(rand.nextInt(MAX) + BIAS,
                rand.nextInt(MAX) + BIAS,
                rand.nextInt(MAX) + BIAS,
                rand.nextInt(MAX) + BIAS,
                rand.nextInt(MAX) + BIAS,
                rand.nextInt(MAX) + BIAS,
                rand.nextInt(MAX) + BIAS,
                rand.nextFloat() + BIAS);
        System.out.println(wer);
        wer.skill1();
        wer.skill2();
        wer.towskill1();
        wer.towskill2();
    }
}
