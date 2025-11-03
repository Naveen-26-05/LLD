package StructuralPattern.AdapterPattern;

public class Adapter implements OldAbstract {
    public NewAbstract  instance;
    public OldAbstract instance2;
    public Adapter(String type){
        if(type.equals("new_type")){
            instance = new NewConcrete();
        }else{
            instance2 = new OldConcrete();
        }
    }
    @Override
    public void oldPlay(String type) {
        if(type.equals("new_type")){
            instance.newPlay(type);
        }else{
            instance2.oldPlay(type);
        }
    }

    
}
