package com.edureka.repositories;

import com.edureka.entities.Army;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArmyRepositories extends PagingAndSortingRepository<Army,Long> {
}
