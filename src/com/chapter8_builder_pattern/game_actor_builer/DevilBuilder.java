package com.chapter8_builder_pattern.game_actor_builer;

//恶魔角色建造器：具体建造者
public class DevilBuilder extends ActorBuilder {
    public void buildType() {
        actor.setType("恶魔");
    }

    public void buildSex() {
        actor.setSex("妖");
    }

    public void buildFace() {
        actor.setFace("丑陋");
    }

    public void buildCostume() {
        actor.setCostume("黑衣");
    }

    public void buildHairStyle() {
        actor.setHair_style("光头");
    }

    public boolean isBareheaded() {
        return true;
    }
}
