package rzeszow.gitaliano.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import rzeszow.gitaliano.entity.User;
import rzeszow.gitaliano.service.UserService;
import rzeszow.gitaliano.service.impl.UserServiceImplementation;

/**
 * Created by kobeb on 20.01.2017.
 */
@Component
public class UserController {

    @Autowired
    private UserServiceImplementation userServiceImplementation;

    @RequestMapping(value = "/newUser", method = RequestMethod.GET)
    public String newUser(Model model){
        model.addAttribute("user",new User());
        return "newUser";
    }

    @RequestMapping(value = "/createNewUser", method = RequestMethod.POST)
    public String createNewUser(@ModelAttribute User user){
        userServiceImplementation.addUser(user);
        return "redirect:/home";
    }




}
