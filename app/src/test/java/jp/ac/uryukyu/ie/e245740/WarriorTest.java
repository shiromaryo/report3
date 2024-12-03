package jp.ac.uryukyu.ie.e245740;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    @Test
    void attackWithWeponSkillTest() {
        Warrior warrior = new Warrior("勇者",100, 20);
        Enemy enemy = new Enemy("スライム", 50, 10);

        for (int i = 0; i < 3; i++) {
            int beforeHitPoint = enemy.gethitPoint();
            warrior.attackWithWeponSkill(enemy);
            enemy.attack(warrior);
            assertEquals(15,beforeHitPoint - enemy.gethitPoint());
        }
    }
}

