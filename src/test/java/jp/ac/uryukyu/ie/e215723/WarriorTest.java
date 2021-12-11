package jp.ac.uryukyu.ie.e215723;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    @Test
    void attackTest(){
        int defaultHeroHp = 100;
        int WarriorAttack = 10;
        int enemyHP = (int)(WarriorAttack * 1.5);
        Warrior demoWarrior = new Warrior("デモ勇者", defaultHeroHp, WarriorAttack);
        Enemy slime1 = new Enemy("スライムもどき1", enemyHP, 100);
        Enemy slime2 = new Enemy("スライムもどき2", enemyHP, 100);
        Enemy slime3 = new Enemy("スライムもどき3", enemyHP, 100);
        
        demoWarrior.attackWithWeponSkill(slime1);
        assertEquals(slime1.isDead(), true);
        demoWarrior.attackWithWeponSkill(slime2);
        assertEquals(slime2.isDead(), true);
        demoWarrior.attackWithWeponSkill(slime3);
        assertEquals(slime3.isDead(), true);
    }
}
