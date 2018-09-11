package clbo.git;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MovieController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }

    @GetMapping("/dev_clbo")
    public String clbo(){
        return "clbo";
    }

    @GetMapping("/dev1")
    public String clbo(){
        return "clbo1";
    }


    @GetMapping("/dev2")
    public String clbo(){
        return "clbo2";
    }

    @GetMapping("/dev_good")
    public String clbo(){
        return "clboddddd";
    }


}
