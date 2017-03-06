package edu.infsci2560.repositories;

import edu.infsci2560.models.Good;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author xinyi
 */
public interface GoodRepository extends PagingAndSortingRepository<Good, Long> {}