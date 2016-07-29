package ru.klarigo.controllers;

import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Locale;

/**
 * @author Rafael_Irgalin
 */
@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String homepage(Model model) {
        Locale locale = LocaleContextHolder.getLocale();
        if(locale.getLanguage().equals(new Locale("ru").getLanguage())) {
            model.addAttribute("currentLanguage", "ru");
        }
        if(locale.getLanguage().equals(new Locale("en").getLanguage())) {
            model.addAttribute("currentLanguage", "en");
        }
        return "index";
    }

}
