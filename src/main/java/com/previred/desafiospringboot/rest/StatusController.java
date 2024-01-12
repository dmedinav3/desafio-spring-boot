package com.previred.desafiospringboot.rest;

import com.previred.desafiospringboot.model.Status;
import com.previred.desafiospringboot.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StatusController {

    @Autowired
    private StatusService statusService;


    @GetMapping("/statuses")
    public ResponseEntity<List<Status>>  getAllStatuses(){
        return new ResponseEntity<>(statusService.getALlStatuses(),HttpStatus.OK);
    }
}
