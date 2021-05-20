package com.lesson;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component("popBean")
public class PopMusic implements Music{
    public void doMyInit(){
        System.out.println("run init Pop");
    }
    public void doMyDestroy(){
        System.out.println("run destroy Pop");
    }

    @Override
    public String song() {
        return "Pop music";
    }

    public List<String> songsList = new ArrayList<String>(Arrays.asList("Pop one", "Pop two", "Pop three"));

    public String randomSong(){
        Random random = new Random();
        return songsList.get(random.nextInt(3));
    }



}
