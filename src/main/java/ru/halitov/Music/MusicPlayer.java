package ru.halitov.Music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("musicPlayerId")
public class MusicPlayer {
 @Value("${musicPlayer.name}")
  private String name;
 @Value("${musicPlayer.volume}")
 private int volume;

  public String getName() {
    return name;
  }

  public int getVolume() {
    return volume;
  }

  /* private ClassicalMusic classicalMusic;
     private RockMusic rockMusic;*/
    /*@Autowired
    @Qualifier("classicalMusic")*/
    Music music1;
    Music music2;

  @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2) {
    this.music1 = music1;
    this.music2 = music2;
  }
    /*@Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }*/
   /* public MusicPlayer(Music music) {
        this.music = music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }*/

    public void playMusic() {
      System.out.println(music1.getSong());
      System.out.println(music2.getSong());
       /* System.out.println(classicalMusic.getSong());
        System.out.println(rockMusic.getSong());*/
    }
    /*  private Music music;
    private String name;
    private int volume;

    public MusicPlayer() { }
    public MusicPlayer(Music music) { this.music = music; }
    public void setMusic(Music music) { this.music = music; }
    public void playMusic() { System.out.println("Playing: " + music.getSong()); }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getVolume() { return volume; }
    public void setVolume(int volume) { this.volume = volume; }*/
}