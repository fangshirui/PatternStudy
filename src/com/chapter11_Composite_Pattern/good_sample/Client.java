package com.chapter11_Composite_Pattern.good_sample;

public class Client {
    public static void main(String[] args) {
        AbstractFile file1, file2, file3, file4, file5, folder1,
                folder2, folder3;

        folder1 = new Folder("Sunny的资料");
        folder2 = new Folder("图像资料");
        folder3 = new Folder("文本文件");

        file1 = new ImageFile("小龙女.jpg");
        file2 = new ImageFile("张无忌.gif");
        file3 = new TextFile("杂乱的资料.txt");
        file4 = new TextFile("葵花宝典.txt");
        file5 = new TextFile("笑傲江湖.txt");


        folder1.add(file3);
        folder2.add(file1);
        folder2.add(file2);
        folder3.add(file4);
        folder3.add(file5);
        folder1.add(folder2);
        folder1.add(folder3);

        folder1.killVirus();
    }

}
