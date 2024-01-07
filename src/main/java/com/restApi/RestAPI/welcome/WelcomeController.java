package com.restApi.RestAPI.welcome;

import com.restApi.RestAPI.security.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("name")
public class WelcomeController {

    @Autowired
    private AuthenticationService authenticationService;

    @RequestMapping(value="/",method= RequestMethod.GET)
    public String gotoWelcomePage(ModelMap model){

        model.put("name",authenticationService.getLoggedinUsername());
        return "welcome";
    }



}
