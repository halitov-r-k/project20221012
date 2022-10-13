package ru.halitov.Music;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMusic {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
      //  Music music = context.getBean("musicBeanId", Music.class);
      //  MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer musicPlayer = context.getBean("musicPlayerBeanId", MusicPlayer.class);
        musicPlayer.playMusic();
        context.close();
    }
}
