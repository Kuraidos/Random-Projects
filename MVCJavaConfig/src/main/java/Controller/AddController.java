package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController
{
    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("num1") int  num1, @RequestParam("num2") int num2 )
    {
        int result = num1+num1;
        ModelAndView mv = new ModelAndView();
        mv.addObject("result", result);
        mv.setViewName("Display.jsp");
        return mv;
    }
}
