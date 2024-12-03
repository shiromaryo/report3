package jp.ac.uryukyu.ie.e245740;

public class Warrior extends Hero {
    public Warrior(String name, int hitPoint, int attack) {
        super(name, hitPoint, attack);
    }

    public void attackWithWeponSkill(LivingThing opponent) {
        if (!isdead()) {
            int damage = (int) (getattack() * 1.5);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", getname(), opponent.getname(), damage);
            opponent.wounded(damage);
        }
    }
}

    

