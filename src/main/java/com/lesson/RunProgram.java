package com.lesson;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunProgram {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                                                        "applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer",MusicPlayer.class);

//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
        musicPlayer.playMusic();

        System.out.println(musicPlayer == musicPlayer2);






        context.close();
    }
}
