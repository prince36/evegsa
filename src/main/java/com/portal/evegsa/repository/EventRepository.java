package com.portal.evegsa.repository;

import com.portal.evegsa.model.EventZ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends CrudRepository<EventZ, Long>, JpaRepository<EventZ, Long> {


}
