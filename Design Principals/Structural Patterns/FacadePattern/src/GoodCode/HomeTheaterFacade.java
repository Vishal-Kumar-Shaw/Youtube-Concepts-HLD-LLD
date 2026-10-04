package GoodCode;

import Classes.Lights;
import Classes.MoviePlayer;
import Classes.Projector;
import Classes.SoundSystem;

public class HomeTheaterFacade {
    private Projector projector;
    private MoviePlayer player;
    private Lights lights;
    private SoundSystem sound;

    public HomeTheaterFacade() {
        this.projector = new Projector();
        this.player = new MoviePlayer();
        this.lights = new Lights();
        this.sound = new SoundSystem();
    }

    public void watchMovie(String movie) {
        projector.on();
        sound.on();
        lights.dim();
        player.play(movie);
    }
}
