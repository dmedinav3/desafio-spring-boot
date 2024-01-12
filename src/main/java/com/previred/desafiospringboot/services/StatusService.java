package com.previred.desafiospringboot.services;

import com.previred.desafiospringboot.model.Status;
import com.previred.desafiospringboot.model.Task;

import java.util.List;

public interface StatusService {
    List<Status> getALlStatuses();
    //Status getStatusById(Long id);
    Status validateStatus(Status statu);
 //   Status getStatusByName(String name);
  //  Boolean  validateStatus(Status status);
}
