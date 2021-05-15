package com.lesson;

public class ClassicalMusic implements Music{
    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }
    public void doMyInit(){
        System.out.println("run init Classical");
    }
    public void doMyDestroy(){
        System.out.println("run destroy Classical");
    }
    @Override
    public String Song() {
        return  "Classical music";
    }
}
