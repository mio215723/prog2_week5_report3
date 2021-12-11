package jp.ac.uryukyu.ie.e215723;

/**
 * ヒーロークラス。
 */
public class Hero extends LivingThing{

    public Hero(String name, int maximumHP, int attack){
        super(name, maximumHP, attack);
        
    }
    @Override
    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        int defaultHitPoint = getHitPoint();
        setHitPoint(defaultHitPoint -= damage);
        if( getHitPoint() <= 0 ) {
            setDead(true);
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", getName());
        }
    }
}