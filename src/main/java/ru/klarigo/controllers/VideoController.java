package ru.klarigo.controllers;

import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @author Rafael_Irgalin
 */
@Controller
public class VideoController {

    @RequestMapping(value = "/video", method = RequestMethod.GET)
    public String showVideoSection(Model model) {
        model.addAttribute("currentLanguage", LocaleContextHolder.getLocale().getLanguage());
        return "video";
    }

}
