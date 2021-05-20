package com.lesson;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component("classicalBean")
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
    public String song() {
        return  "Classical music";
    }

    public List<String> songsList = new ArrayList<String>(Arrays.asList(
                                        "Classical one", "Classical two", "Classical three"));

    public String randomSong(){
        Random random = new Random();
        return songsList.get(random.nextInt(3));
    }
}
