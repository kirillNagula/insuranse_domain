package by.nagula.insuranse_domain.controller;

import by.nagula.insuranse_domain.dto.UserPolicyDto;
import by.nagula.insuranse_domain.entity.Policy;
import by.nagula.insuranse_domain.entity.User;
import by.nagula.insuranse_domain.service.PolicyService;
import by.nagula.insuranse_domain.service.UserPolicyService;
import by.nagula.insuranse_domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(path = "/home")
public class PolicyController {
    @Autowired
    private UserPolicyService userPolicyService;

    @GetMapping(path = "/policy")
    public ModelAndView getPage(ModelAndView modelAndView){
        modelAndView.addObject("userPolicy", new UserPolicyDto());
        modelAndView.setViewName("policy");
        return modelAndView;
    }

    @PostMapping(path = "/policy")
    public ModelAndView addPolicy(@ModelAttribute("userPolicy") UserPolicyDto dto,  ModelAndView modelAndView){
        userPolicyService.save(dto);
        return getPage(modelAndView);
    }
}
