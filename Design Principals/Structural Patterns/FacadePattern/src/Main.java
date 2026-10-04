import Classes.Lights;
import Classes.MoviePlayer;
import Classes.Projector;
import Classes.SoundSystem;
import GoodCode.HomeTheaterFacade;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        Lights lights = new Lights();
//        MoviePlayer moviePlayer = new MoviePlayer();
//        Projector projector = new Projector();
//        SoundSystem sound = new SoundSystem();
//
//        projector.on();
//        sound.on();
//        lights.dim();
//        moviePlayer.play("Drishyam 3");

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.watchMovie("Drishyam 3");
    }
}