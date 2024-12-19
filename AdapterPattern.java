interface MediaPlayer { 
    void play(String audioType, String fileName);
}

class MP3Player implements MediaPlayer{
    public void play(String audioType, String fileName){
        if("mp3".equalsIgnoreCase(audioType)){
            System.out.println("Playing mp3 file " + fileName );
        } else {
            System.out.println("Invalid media type for MP3Player");
        }
    }
}

interface AdvancedMediaPlayer{
    void playVLC(String fileName);
    void playMP4(String fileName);
}

class VLCPlayer implements AdvancedMediaPlayer{
    public void playVLC(String fileName){
        System.out.println("Playing VLC file : " + fileName);
    }

    public void playMP4(String fileName){
        //do nothing
    }
}

class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if ("vlc".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer = new VLCPlayer();
        }
    }

    public void play(String audioType, String fileName) {
        if ("vlc".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer.playVLC(fileName);
        }
    }
}

public class AdapterPattern {
    public static void main(String[] args) {
        MediaPlayer mp = new MediaAdapter("vlc");
        mp.play("vlc", "example.vlc");
    }
}
