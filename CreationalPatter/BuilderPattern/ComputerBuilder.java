package BuilderPattern;


public class ComputerBuilder {
    
    public ComputerBuilder(){}
    public ComputerBuilder buildCpu(String cpu){
        return this;
    }
    public ComputerBuilder buildRam(String ram){
        return this;
    }
    public ComputerBuilder buildStorage(String storage){
        return this;
    }
    public ComputerBuilder buildGpu(String gpu){
        return this;
    }
    public Computer build(){
        return new Computer("i5", "16GB", "1TB", "GTX 1060");
    }
   



}
