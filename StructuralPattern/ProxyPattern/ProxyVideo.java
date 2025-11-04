package StructuralPattern.ProxyPattern;

public class ProxyVideo implements Video {
    private RealVideo realVideo;
    @Override
    public void play() {
        if(realVideo == null){
            realVideo = new RealVideo();
        }
        System.out.println("Playing the proxy video");
        realVideo.play();
    }
}
