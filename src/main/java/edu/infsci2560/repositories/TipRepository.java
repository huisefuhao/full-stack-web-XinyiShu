package edu.infsci2560.repositories;

import edu.infsci2560.models.Tip;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author xinyi
 */
public interface TipRepository extends PagingAndSortingRepository<Tip, Long> {}