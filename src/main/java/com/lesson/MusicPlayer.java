package com.lesson;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private Music music;
    private String name;
    private String volume;

    public MusicPlayer(Music music){
        this.music = music;
    }
    public MusicPlayer(){

    }

    public void playMusic(){
        System.out.println("Play : " + getMusic().Song());
    }
    public void playMusicList(){
        for (Music play: getMusicList())
        System.out.println("Play : " + play.Song());
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

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }
}
