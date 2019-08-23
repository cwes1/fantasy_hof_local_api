package com.chris.legends.hof.local.api.repository;

import com.chris.legends.hof.local.api.model.entity.Owner;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface OwnerRepository extends PagingAndSortingRepository<Owner, Integer> {

    Owner findByFirstName(String firstName);
}
