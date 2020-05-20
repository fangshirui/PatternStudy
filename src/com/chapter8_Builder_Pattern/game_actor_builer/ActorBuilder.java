package com.chapter8_Builder_Pattern.game_actor_builer;
// 抽象建造者
abstract class ActorBuilder {
    protected Actor actor = new Actor();

    public abstract void buildType();
    public abstract void buildSex();
    public abstract void buildFace();
    public abstract void buildCostume();
    public abstract void buildHairStyle();

    // 增加一个钩子方法
    public boolean isBareheaded(){
        return false;
    }

    // 返回角色对象，注意不包括建造过程，也没有定义为抽象类，
    // 从而在具体实现类中写。这是为了将建造方法与建造过程的解耦。
    // 建造过程写在了导演类中，建造方法在具体建造者类中
    public Actor createActor(){
        return actor;
    }
}
