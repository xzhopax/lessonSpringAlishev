package com.lesson;

public class PopMusic implements Music{
    public void doMyInit(){
        System.out.println("run init Pop");
    }
    public void doMyDestroy(){
        System.out.println("run destroy Pop");
    }
    @Override
    public String Song() {
        return "Pop music";
    }
}
