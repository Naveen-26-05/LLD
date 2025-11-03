package StructuralPattern.AdapterPattern;

public class NewConcrete implements NewAbstract {
    @Override
    public void newPlay(String type) {
        System.out.println("Playing " + type);
    }
}
