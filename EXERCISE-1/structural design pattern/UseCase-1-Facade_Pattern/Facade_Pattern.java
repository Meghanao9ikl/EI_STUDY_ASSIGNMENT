// Subsystems
class Projector {
    public void on() {
        System.out.println("Projector is On.");
    }

    public void off() {
        System.out.println("Projector is Off.");
    }
}

class Speakers {
    public void on() {
        System.out.println("Speakers are On.");
    }

    public void off() {
        System.out.println("Speakers are Off.");
    }
}

class MediaPlayer {
    public void play() {
        System.out.println("Playing Media.");
    }

    public void stop() {
        System.out.println("Media Stopped.");
    }
}

// Facade
class HomeTheaterFacade {
    private Projector projector;
    private Speakers speakers;
    private MediaPlayer mediaPlayer;

    public HomeTheaterFacade(Projector projector, Speakers speakers, MediaPlayer mediaPlayer) {
        this.projector = projector;
        this.speakers = speakers;
        this.mediaPlayer = mediaPlayer;
    }

    public void watchMovie() {
        projector.on();
        speakers.on();
        mediaPlayer.play();
    }

    public void endMovie() {
        mediaPlayer.stop();
        speakers.off();
        projector.off();
    }
}

// Usage
public class Facade_Pattern {
    public static void main(String[] args) {
        Projector projector = new Projector();
        Speakers speakers = new Speakers();
        MediaPlayer mediaPlayer = new MediaPlayer();

        HomeTheaterFacade theater = new HomeTheaterFacade(projector, speakers, mediaPlayer);

        theater.watchMovie();
        theater.endMovie();
    }
}
