package com.chris.legends.hof.local.api.repository;

import com.chris.legends.hof.local.api.model.Draft;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DraftRepository extends PagingAndSortingRepository<Draft, Integer> {

    Draft findByYear(String year);

}
