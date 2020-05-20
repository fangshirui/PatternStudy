package com.chapter8_Builder_Pattern.game_actor_builer;
//英雄角色建造器：具体建造者
public class HeroBuilder extends ActorBuilder {

    public void buildType() {
        actor.setType("英雄");
    }

    public void buildSex() {
        actor.setSex("男");
    }

    public void buildFace() {
        actor.setFace("英俊");
    }

    public void buildCostume() {
        actor.setCostume("盔甲");
    }

    public void buildHairStyle() {
        actor.setHair_style("飘逸");
    }


    public Actor createActor() {
        return super.createActor();
    }
}
