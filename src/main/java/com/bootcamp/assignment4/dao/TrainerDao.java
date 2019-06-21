/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.assignment4.dao;

import com.bootcamp.assignment4.model.Trainers;
import com.bootcamp.assignment4.repository.TrainerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Kosta
 */
@Service
public class TrainerDao {

    @Autowired
    TrainerRepository tr;

    public void insert(Trainers t) {
        tr.save(t);
    }

    public List<Trainers> viewAllTrainers() {
        List<Trainers> result = tr.findAll();
        return result;
    }

    
}
