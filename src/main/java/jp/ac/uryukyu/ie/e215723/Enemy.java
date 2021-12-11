package jp.ac.uryukyu.ie.e215723;

/**
 * 敵クラス
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
        int defaultHitPoint = getHitPoint();
        setHitPoint(defaultHitPoint -= damage);
        if( getHitPoint() <= 0 ) {
            setDead(true);
            System.out.printf("モンスター%sは倒れた。\n", getName());
        }
    }
}