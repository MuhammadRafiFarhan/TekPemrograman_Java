import java.util.ArrayList;
import java.util.List;

public class MainComposition {
    public static void main (String[] args){
        
    /*membuat objects dari Processor class.*/
    Processor p1 = new Processor("Intel core i5 12400",6, "Intel");
    Processor p2 = new Processor("AMD Ryzen 5 5600X",6, "AMD");
    Processor p3 = new Processor("Intel core i5 5200u",2, "Intel");

    /*membuat objects dari VGA class.*/
    VGA v1 = new VGA("NVIDIA GeForce RTX 3060",8, "GDDR6");
    VGA v2 = new VGA("AMD Radeon RX570",4, "GDDR5");
    VGA v3 = new VGA("NVIDIA GeForce 820M",2, "GDDR3");

    /* Membuat list yang berisi daftar Processor*/
    List<Processor> processor = new ArrayList<Processor>();
    processor.add(p1);
    processor.add(p2);
    processor.add(p3);

    /* Membuat list yang berisi daftar VGA*/
    List<VGA> vga = new ArrayList<VGA>();
    vga.add(v1);
    vga.add(v2);
    vga.add(v3);

    Computer computer = new Computer(processor, vga);

    List<Processor> procs = computer.getTotalProcessorInComputer();
    for(Processor proc : procs){
        System.out.println("Name : " + proc.name +" Core : " + proc.core+" Company : " + proc.company);
    }
    List<VGA> graphics = computer.getTotalVGAInComputer();
    for(VGA graphic : graphics){
        System.out.println("Series : " + graphic.series +" VRAM : " + graphic.vram+" VRAM Version : " + graphic.vram_ver);
    }
    }
}
    
    

