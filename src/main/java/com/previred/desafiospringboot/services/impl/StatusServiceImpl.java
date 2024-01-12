package com.previred.desafiospringboot.services.impl;

import com.previred.desafiospringboot.model.Status;
import com.previred.desafiospringboot.repository.StatusRepository;
import com.previred.desafiospringboot.services.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import javax.swing.text.html.Option;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class StatusServiceImpl implements StatusService {
    @Autowired
    private StatusRepository statusRepository;

    @Override
    public List<Status> getALlStatuses() {
        return statusRepository.findAll();
    }

    @Override
    public Status validateStatus(Status status) {
        Optional<Status> statusValid = this.statusRepository.findById(status.getId());
        if (statusValid.isPresent()) {
            if(statusValid.get().getId().equals(status.getId()) && statusValid.get().getDescription().equals(status.getDescription())){
                return statusValid.get();
            } else {
                throw new NoResultException("El estado enviado no existe en la DB");
            }
        } else {
            throw new NoResultException("El estado enviado no existe en la DB");
        }
    }
/*
    @Override
    public Status getStatusByName(String name) {
        Optional<Status> status = this.statusRepository.findByName(name);
        if (status.isPresent()) {
            return status.get();
        } else {
            throw new NoResultException("El estado enviado no existe en la DB");
        }
    }

    @Override
    public Boolean validateStatus(Status status) {
        try {
            getStatusById(status.getId());
            getStatusByName(status.getDescription());
            return true;
        } catch (NoResultException noResultException) {
            return false;
        }


    }*/
}
