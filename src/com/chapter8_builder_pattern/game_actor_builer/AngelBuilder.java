package com.chapter8_builder_pattern.game_actor_builer;
// 天使角色建造器：具体建造者
public class AngelBuilder extends ActorBuilder{
    public void buildType() {
        actor.setType("天使");
    }

    public void buildSex() {
        actor.setSex("女");
    }

    public void buildFace() {
        actor.setFace("漂亮");
    }

    public void buildCostume() {
        actor.setCostume("白裙");
    }

    public void buildHairStyle() {
        actor.setHair_style("披肩长发");
    }
}
