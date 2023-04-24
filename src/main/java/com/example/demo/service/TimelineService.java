package com.example.demo.service;

import com.example.demo.entity.TimelineEntity;
import com.example.demo.repository.TimelineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimelineService {

    @Autowired
    private TimelineRepository timelineRepository;

    public List<TimelineEntity> getAllTimeline() {
        return timelineRepository.findAll();
    }
}
