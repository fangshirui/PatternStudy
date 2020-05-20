package com.chapter8_Builder_Pattern.game_actor_builer;

public class ActorController {
    private ActorBuilder actorBuilder;

    public ActorController(ActorBuilder ac) {
        this.actorBuilder = ac;
    }
    public void setBuilder(ActorBuilder ac){
        this.actorBuilder = ac;
    }

    // 建造流程
    public Actor construct() {
        actorBuilder.buildType();
        actorBuilder.buildSex();
        actorBuilder.buildFace();
        actorBuilder.buildCostume();

        // 通过钩子方法来控制产品构建
        if(!actorBuilder.isBareheaded()){
            actorBuilder.buildHairStyle();
        }

        return actorBuilder.createActor();
    }
}
