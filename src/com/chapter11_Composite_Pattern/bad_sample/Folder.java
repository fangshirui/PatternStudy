package com.chapter11_Composite_Pattern.bad_sample;

import com.chapter10_Bridge_Pattern.image_display.ImageImp;
import com.chapter6_Abstract_Factory_Pattern.TextField;

import java.util.ArrayList;

public class Folder {
    private String name;

    private ArrayList<Folder> folderList = new ArrayList<Folder>();

    private ArrayList<ImageFile> imageList = new ArrayList<ImageFile>();

    private ArrayList<TextFile> textList = new ArrayList<TextFile>();

    public Folder(String name){
        this.name = name;
    }

    // 增加文件夹中的成员
    public void addFolder(Folder f){
        folderList.add(f);
    }

    public void addImageFile(ImageFile image){
        imageList.add(image);
    }

    public void addTextFile(TextFile text){
        textList.add(text);
    }

    // 添加三个不同的方法 removeFolder()、removeImageFile()
    // removeTextFile() 来删除成员   代码省略

    // 添加三个不同的方法 getChildFolder(int i) getChildImageFile(int i)
    // getChildTextFile(int i) 来获取成员  代码省略

    public void killVirus(){
        // 模拟杀毒
        System.out.println("***对文件夹 <" + name + "> 进行杀毒");

        for(Folder obj : folderList){
            obj.killVirus();
        }

        for (ImageFile obj : imageList){
            obj.killVirus();
        }

        for (TextFile obj : textList){
            obj.killVirus();
        }
    }

}
