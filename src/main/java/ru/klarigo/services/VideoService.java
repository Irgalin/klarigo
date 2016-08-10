package ru.klarigo.services;

import ru.klarigo.models.Video;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author Rafael_Irgalin
 */
@Transactional
public interface VideoService {

    Video getVideoById(Long id);

    List<Video> getAllVideos();

    List<Video> getPageOfVideos(int pageNumber, int pageSize);

    Video addVideo(Video video);

    Video editVideo(Video video);

    void deleteVideoById(Long id);

    long getNumberOfAvailableVideos();

}



