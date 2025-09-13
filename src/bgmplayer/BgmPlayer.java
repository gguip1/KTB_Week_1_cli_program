package bgmplayer;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class BgmPlayer implements Runnable{
    private final String filePath;

    public BgmPlayer(String filePath){
        this.filePath = filePath;
    }

    @Override
    public void run() {
        try {
            File file = new File(filePath);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            throw new RuntimeException(e);
        }
    }
}
