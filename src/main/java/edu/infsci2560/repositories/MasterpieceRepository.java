package edu.infsci2560.repositories;

import edu.infsci2560.models.Masterpiece;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author xinyi
 */
public interface MasterpieceRepository extends PagingAndSortingRepository<Masterpiece, Long> {}