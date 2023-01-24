package com.example.demo.questions;

import org.springframework.stereotype.Service;

@Service
public class infoService {
    public info getInfo(){
        return new info();
    }
}
