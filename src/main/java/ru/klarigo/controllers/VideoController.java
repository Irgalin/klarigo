package ru.klarigo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.klarigo.services.VideoService;


/**
 * @author Rafael_Irgalin
 */
@Controller
public class VideoController {

    @Autowired
    VideoService videoService;

    @RequestMapping(value = "/video", method = RequestMethod.GET)
    public String showVideoSection(Model model) {
        model.addAttribute("currentLanguage", LocaleContextHolder.getLocale().getLanguage());

        long numberOfAvailableVideos = videoService.getNumberOfAvailableVideos();
        if (numberOfAvailableVideos > 0) {
            if (numberOfAvailableVideos >= 5) {
                model.addAttribute("videoList", videoService.getPageOfVideos(0, 5));
            } else {
                model.addAttribute("videoList", videoService.getPageOfVideos(0, (int)numberOfAvailableVideos));
            }
        }

        return "video";
    }

}
