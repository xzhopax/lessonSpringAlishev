package com.lesson;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("rockBean")
public class RockMusic implements Music{
    @PostConstruct
    public void doMyInit(){
        System.out.println("run init Rock");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("run destroy Rock");
    }

    @Override
    public String song() {
       return "Rock music";
    }

    public List<String> songsList = new ArrayList<String>(Arrays.asList("Rock one", "Rock two", "Rock three"));

    public String randomSong(){
        Random random = new Random();
        return songsList.get(random.nextInt(3));
    }
}
