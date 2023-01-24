package com.example.demo.questions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping(path = "info")
public class infoController {

    private infoService infoService;

    public infoController(infoService infoService) {
        this.infoService = infoService;
    }

    @CrossOrigin
    @PostMapping
    public ResponseEntity<List<String>> addAnswers(@RequestBody Map<String,Object> answers) {
        List<String> info = getInfo(answers);
        return new ResponseEntity<>(info, HttpStatus.OK);
    }


    public List<String> getInfo(Map<String, Object> answers){

        info personInfo = new info();
        List<String> products = new ArrayList<>();
        try{
            personInfo.setAge((int) answers.get("age"));
            if(Objects.nonNull(answers.get("isStudent"))){
                personInfo.setStudent((boolean) answers.get("isStudent"));
            }
            personInfo.setIncome(Long.valueOf((answers.get("income").toString())));
        }catch (Exception e){
            products.add("You either too rich or too old");
            return products;
        }

        if (personInfo.getIncome() > 0 && personInfo.getAge() > 17) {
            if (personInfo.getIncome()  < 12001) {

            } if (personInfo.getIncome()  <= 40000) {
                products.add("Credit Card");
            } if (personInfo.getIncome()  > 40000) {
                products.add("Gold Credit Card");
            }else {
                products.add("Current Account");
            }
        } else if (personInfo.getAge() < 18) {
            products.add("Junior Saver Account");
        } else if (personInfo.getStudent()) {
            products.add("Student Account");
        } else if (personInfo.getAge() > 64) {
            products.add("Senior Account");
        }  else {
            products.add("No Account");
        }
        return products;
    }
}
