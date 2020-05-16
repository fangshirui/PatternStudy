package com.chapter2.Association.composition;

public class Head {
    private Mouth mouth;

    public Head(){
        mouth = new Mouth();
    }
}
