package ru.klarigo.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.klarigo.models.Video;

/**
 * @author Rafael_Irgalin
 */
public interface VideoRepository extends PagingAndSortingRepository<Video, Long> {

}
