package edu.infsci2560.repositories;

import edu.infsci2560.models.Video;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author xinyi
 */
public interface VideoRepository extends PagingAndSortingRepository<Video, Long> {}