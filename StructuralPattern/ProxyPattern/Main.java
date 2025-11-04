package StructuralPattern.ProxyPattern;

// creating a proxy object for a real object , controlling the real obj with proxy the client cannot access the real object directly
public class Main {
    public static void main(String[] args) {
        ProxyVideo proxyVideo = new ProxyVideo();
        proxyVideo.play();
    }
}
