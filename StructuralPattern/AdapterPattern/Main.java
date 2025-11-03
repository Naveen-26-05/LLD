package StructuralPattern.AdapterPattern;

public class Main {

    public static void main(String[] args) {
        Adapter adapter = new Adapter("old_type");
        adapter.oldPlay("old_type");
         Adapter adapter1 = new Adapter("new_type");
        adapter1.oldPlay("new_type");

    }
    
}
