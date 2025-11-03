package BuilderPattern;
public class Main{
public static void main(String[] args) {
    ComputerBuilder builder = new ComputerBuilder();
    Computer computer = builder.buildCpu("i7").buildRam("32GB").buildStorage("2TB").buildGpu("RTX 3080").build();

    System.out.println(computer.Cpu);
    System.out.println(computer.Ram);
    System.out.println(computer.Storage);
    System.out.println(computer.Gpu);
}}
