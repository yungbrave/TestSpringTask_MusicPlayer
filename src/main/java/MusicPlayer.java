import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private Music music;
    private List<Music> playlist = new ArrayList<>();
    private String name;
    private int volume;

    public MusicPlayer() {
    }

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void setPlaylist(List<Music> playlist) {
        this.playlist = playlist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }

    public void playPlaylist() {
        System.out.println("Playing playlist:");
        for (Music music: playlist) {
            System.out.println(music.getSong());
        }
    }
}
