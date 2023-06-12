import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AppConfig {
    @Bean(name="music")
    public Music getMusic() {
        Music music = new ClassicalMusic();
        return music;
    }


}
