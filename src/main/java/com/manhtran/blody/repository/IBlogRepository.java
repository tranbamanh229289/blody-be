package com.manhtran.blody.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manhtran.blody.entity.BlogEntity;

@Repository
public interface IBlogRepository extends JpaRepository<BlogEntity, Long> {

}
