package StructuralPattern.ProxyPattern;

public class RealVideo implements Video {
    @Override
    public void play() {
        System.out.println("Playing the video");
    }
}
