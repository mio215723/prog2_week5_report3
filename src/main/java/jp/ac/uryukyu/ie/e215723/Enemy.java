package jp.ac.uryukyu.ie.e215723;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy extends LivingThing{

    public Enemy (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    @Override
    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }

    /**
     * 敵のHPを教えてくれるメソッド。
     * @return 勇者のHP
     */
    public int getHitPoint(){
        return this.hitPoint;
    }

    /**
     * 敵の攻撃力を教えてくれるメソッド。
     * @return 勇者の攻撃力
     */
    public int getAttack(){
        return this.attack;
    }

    /**
     * 敵の名前を変えるメソッド。
     * @param name 新しい名前
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * 敵のHPを変えるメソッド。
     * @param hitPoint 新しいHP
     */
    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }

    /**
     * 敵の攻撃力を変えるメソッド。
     * @param attack 新しい攻撃力
     */
    public void setAttack(int attack){
        this.attack = attack;
    }

    /**
     * 敵が生きているか死んでいるかを変えるメソッド。
     * @param dead falseなら死んでいる。trueなら生きている。
     */
    public void setDead(boolean dead){
        this.dead = dead;
    }
}