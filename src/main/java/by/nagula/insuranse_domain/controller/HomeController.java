package by.nagula.insuranse_domain.controller;

import by.nagula.insuranse_domain.dto.UserDto;
import by.nagula.insuranse_domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/home")
public class HomeController {
    @Autowired
    private UserService userService;

    @GetMapping
    public ModelAndView getPage(ModelAndView modelAndView){
        modelAndView.addObject("userData", new UserDto());
        modelAndView.setViewName("home");
        return modelAndView;
    }

    @PostMapping
    public ModelAndView dataForSearch(@ModelAttribute("userData") UserDto userDto,  ModelAndView modelAndView){
        modelAndView.addObject("user", userDto);
        return getInformation(modelAndView);
    }

    @GetMapping(path = "/information")
    public ModelAndView getInformation(ModelAndView modelAndView){
        UserDto userDto = (UserDto) modelAndView.getModel().get("user");
        System.out.println(userDto);
        modelAndView.addObject("insuranceList", userService.
                    getUser(userDto.getFirstName(), userDto.getLastName()));
        modelAndView.setViewName("information");
        return modelAndView;
    }
}
