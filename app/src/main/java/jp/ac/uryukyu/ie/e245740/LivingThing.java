package jp.ac.uryukyu.ie.e245740;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;
    
     public LivingThing(String name, int hitPoint, int attack) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        this.dead = false;
    }
    
    public boolean isdead() {
        return dead;
    }
    
    public String getname() {
        return name;
    }
    
    public int gethitPoint() {
        return hitPoint;
    }

    public int getattack() {
        return attack;
    }    

    public void attack(LivingThing opponent) {
        if (!dead) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！\n", name, opponent.getname(), damage);
               opponent.wounded(damage);
        }
       }
    
    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint <= 0) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}
    
