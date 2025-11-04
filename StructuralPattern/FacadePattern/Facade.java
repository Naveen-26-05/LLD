package StructuralPattern.FacadePattern;

public class Facade {
    private Projector projector;
    private Speaker speaker;
    private VideoPlayer videoPlayer;
    public Facade(){
        projector = new Projector();
        speaker = new Speaker();
        videoPlayer = new VideoPlayer();
    }
    public void watchMovie(){
        projector.on();
        speaker.on();
        videoPlayer.on();
    }
    public void stopMovie(){
        projector.off();
        speaker.off();
        videoPlayer.off();
    }
}
