package com.lesson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component("musicPlayer")
@Scope("singleton")
public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private Music music;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private String volume;
    private Music musicClass;
    private Music musicRock;
    private Music musicPop;

    @Autowired
    public MusicPlayer(@Qualifier("rockBean") Music music){
        this.music = music;
    }

    public MusicPlayer(@Qualifier("classicalBean") Music classical,
                        @Qualifier("rockBean") Music rock,
                        @Qualifier("popBean") Music pop){
        this.musicClass = classical;
        this.musicRock = rock;
        this.musicPop = pop;

    }

    public void playMusic(MusicGenre enumGenre){
        switch (enumGenre){
            case CLASSICAL:
                System.out.println("Play : " + musicClass.randomSong());
                break;
            case ROCK:
                System.out.println("Play : " + musicRock.randomSong());
                break;
            case POP:
                System.out.println("Play : " + musicPop.randomSong());
                break;
            default:
                System.out.println("Play : not this genre");
        }
        System.out.println();
    }
    public void playMusic(){
        System.out.printf("Play : %s\n", music.randomSong());
    }

    public void playMusicList(){
        for (Music play: getMusicList())
        System.out.println("Play : " + play.randomSong());
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String values) {
        this.volume = values;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    @Autowired
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }


}
