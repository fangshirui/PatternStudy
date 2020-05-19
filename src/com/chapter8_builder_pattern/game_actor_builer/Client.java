package com.chapter8_builder_pattern.game_actor_builer;

public class Client {
    public static void main(String[] args) {
        Actor actor;
        ActorBuilder ab = new DevilBuilder();
        ActorController actorController = new ActorController(ab);

        actor = actorController.construct();

        System.out.println(actor.getType() + "的外观：");
        System.out.println("性别: " + actor.getSex());
        System.out.println("面容: " + actor.getFace());
        System.out.println("服装: " + actor.getCostume());
        System.out.println("发型: " + actor.getHair_style());

    }
}
