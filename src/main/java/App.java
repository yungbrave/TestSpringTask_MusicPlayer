import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
//        ApplicationContext applicationContext =
//                new AnnotationConfigApplicationContext(AppConfig.class);
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        RapMusic music = context.getBean("music", RapMusic.class);
        System.out.println(music.getSong());
        context.close();
//        MusicPlayer musicPlayer = (MusicPlayer) context.getBean("musicPlayer");
//        MusicPlayer musicPlayer1 = (MusicPlayer) context.getBean("musicPlayer");
//        MusicPlayer musicPlayer = (MusicPlayer) applicationContext.getBean("musicPlayer");
//        System.out.println(musicPlayer == musicPlayer1);
//        musicPlayer.playMusic();
//        musicPlayer.playPlaylist();
//        System.out.println(musicPlayer.getVolume());
    }
}
