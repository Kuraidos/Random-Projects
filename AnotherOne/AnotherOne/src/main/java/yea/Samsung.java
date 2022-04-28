package yea;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung
{
    @Autowired
    @Qualifier("mediaTech")
    Processor cpu;
    public void config()
    {
        System.out.println("Octa Core,4GB RAM, 12MP camera");
        cpu.process();
    }

    public Processor getCpu() {
        return cpu;
    }

    public void setCpu(Processor cpu) {
        this.cpu = cpu;
    }
}
