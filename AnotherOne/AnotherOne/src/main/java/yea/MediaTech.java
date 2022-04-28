package yea;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class MediaTech implements Processor
{

    @Override
    public void process()
    {
        System.out.println("Dis processor is bad :(");
    }
}
