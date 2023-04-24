package com.example.demo.repository;

import com.example.demo.entity.TimelineEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimelineRepository extends JpaRepository<TimelineEntity,Integer> {


}
