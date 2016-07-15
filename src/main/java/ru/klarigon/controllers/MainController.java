package ru.klarigon.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Rafael_Irgalin
 */
@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String homepage(Model model) {
        model.addAttribute("greeting", "Welcome to Klarigon!");
        return "index";
    }

}
