package StructuralPattern.AdapterPattern;

public class OldConcrete implements OldAbstract {
    @Override
    public void oldPlay(String type) {
        System.out.println("Playing " + type);
    }
}
