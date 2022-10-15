package ru.halitov.Music;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMusic {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
      //  Music music = context.getBean("musicBeanId", Music.class);
      //  MusicPlayer musicPlayer = new MusicPlayer(music);
        /*
        MusicPlayer musicPlayer1 = context.getBean("musicPlayerBeanId", MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        */


        MusicPlayer musicPlayer1 = context.getBean("musicPlayerBeanId", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayerBeanId", MusicPlayer.class);
        musicPlayer1.setVolume(51);
        musicPlayer2.setVolume(52);
        System.out.println((musicPlayer1==musicPlayer2 ) +" "+ musicPlayer1.toString() +" "+ musicPlayer2.toString());
        System.out.println("musicPlayer1.volume: " + musicPlayer1.getVolume() +" " + "musicPlayer2.volume: " + musicPlayer2.getVolume() );
        context.close();
    }
}
