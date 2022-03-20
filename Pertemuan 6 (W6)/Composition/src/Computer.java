import java.util.ArrayList;
import java.util.List;

public class Computer {
    private final List<Processor> processor;
    private final List<VGA> vga;
    
    Computer (List<Processor> processor, List<VGA> vga){
        this.processor = processor;
        this.vga = vga;
    }

    public List<Processor> getTotalProcessorInComputer(){
        return processor;
    }
    
     public List<VGA> getTotalVGAInComputer(){
        return vga;
     }
}
