package rzeszow.gitaliano.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by kobeb on 21.01.2017.
 */
@Controller

public class HomeController {

    @RequestMapping(value = {"/","/home"}, method = RequestMethod.GET)
    String home(){
        return "home";
    }
}
