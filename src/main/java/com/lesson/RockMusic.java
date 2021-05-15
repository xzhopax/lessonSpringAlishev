package com.lesson;

public class RockMusic implements Music{
    public void doMyInit(){
        System.out.println("run init Rock");
    }
    public void doMyDestroy(){
        System.out.println("run destroy Rock");
    }
    @Override
    public String Song() {
       return "Rock music";
    }
}
