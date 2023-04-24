package com.example.demo.controller;

import com.example.demo.service.TimelineService;
import com.example.demo.entity.TimelineEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*

- add testing

* */

@RestController
@RequestMapping(path = "timeline")
public class TimelineController {


    @Autowired
    private TimelineService timelineService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/history")
    public List<TimelineEntity> getAllTimeline() {
        return timelineService.getAllTimeline();
    }

    public TimelineController(TimelineService timelineService) {
        this.timelineService = timelineService;
    }


}
