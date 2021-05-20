package com.lesson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("computer")
public class Computer {
    private int id;
    private MusicPlayer player;

    @Autowired
    public Computer(MusicPlayer player) {
        this.id = 1;
        this.player = player;
    }

    public void printDisplay(){
        System.out.printf("Computer : id = %d\nPlay music :\n",id);
        player.playMusicList();
    }

    public void showDisplayMusic(){
        System.out.println(player.getMusic().song());
    }
}
