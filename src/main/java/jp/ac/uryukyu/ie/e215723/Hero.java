package jp.ac.uryukyu.ie.e215723;

/**
 * ヒーロークラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Hero {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name ヒーロー名
     * @param maximumHP ヒーローのHP
     * @param attack ヒーローの攻撃力
     */
    public Hero (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * Enemyへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param e 攻撃対象
     */
    public void attack(Enemy e){
        int damage = (int)(Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, e.getName(), damage);
        e.wounded(damage);
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
    }

    /**
     * 勇者の名前を教えてくれるメソッド。
     * @return 勇者の名前
     */
    public String getName(){
        return this.name;
    }

    /**
     * 勇者のHPを教えてくれるメソッド。
     * @return 勇者のHP
     */
    public int getHitPoint(){
        return this.hitPoint;
    }

    /**
     * 勇者の攻撃力を教えてくれるメソッド。
     * @return 勇者の攻撃力
     */
    public int getAttack(){
        return this.attack;
    }
    
    /**
     * 勇者が生きているか死んでいるか教えてくれるメソッド。
     * @return　勇者が生きていればfalse、死んでいればtrue
     */
    public boolean isDead(){
        return this.dead;
    }

    /**
     * 勇者の名前を変えるメソッド。
     * @param name 新しい名前
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * 勇者のHPを変えるメソッド。
     * @param hitPoint 新しいHP
     */
    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }

    /**
     * 勇者の攻撃力を変えるメソッド。
     * @param attack 新しい攻撃力
     */
    public void setAttack(int attack){
        this.attack = attack;
    }

    /**
     * 勇者が生きているか死んでいるかを変えるメソッド。
     * @param dead falseなら死んでいる。trueなら生きている。
     */
    public void setDead(boolean dead){
        this.dead = dead;
    }
}