package ru.klarigo.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import ru.klarigo.models.Video;
import ru.klarigo.repositories.VideoRepository;
import ru.klarigo.services.VideoService;

import java.util.List;

/**
 * @author Rafael_Irgalin
 */
@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    VideoRepository videoRepository;

    @Override
    public Video getVideoById(Long id) {
        return videoRepository.findOne(id);
    }

    @Override
    public List<Video> getAllVideos() {
        return (List<Video>) videoRepository.findAll();
    }

    @Override
    public List<Video> getPageOfVideos(int pageNumber, int pageSize) {
        PageRequest pageRequest = new PageRequest(pageNumber, pageSize);
        return videoRepository.findAll(pageRequest).getContent();
    }

    @Override
    public Video addVideo(Video video) {
        return videoRepository.save(video);
    }

    @Override
    public Video editVideo(Video video) {
        return videoRepository.save(video);
    }

    @Override
    public void deleteVideoById(Long id) {
        videoRepository.delete(id);
    }

    @Override
    public long getNumberOfAvailableVideos() {
        return videoRepository.count();
    }
}
