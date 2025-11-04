package StructuralPattern.FacadePattern;

//creating a simple interface for complex system
// watching a movie , automatically on projector , dvd , speaker , etc
public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.watchMovie();
        facade.stopMovie();
    }
    
}
