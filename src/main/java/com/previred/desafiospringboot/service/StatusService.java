package com.previred.desafiospringboot.service;

import com.previred.desafiospringboot.model.Status;

import java.util.List;

public interface StatusService {
    List<Status> getALlStatuses();
    //Status getStatusById(Long id);
    Status validateStatus(Status statu);
 //   Status getStatusByName(String name);
  //  Boolean  validateStatus(Status status);
}
