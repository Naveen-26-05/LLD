package PrototypePattern;

public class Concrete implements Prototype {
    public int id;
    public String name;
    public Concrete(int id , String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public Prototype clone() {
        return new Concrete(this.id, this.name);
    }
}
