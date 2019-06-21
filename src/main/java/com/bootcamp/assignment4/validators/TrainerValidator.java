/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.assignment4.validators;

import com.bootcamp.assignment4.model.Trainers;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 *
 * @author Kosta
 */
@Component
public class TrainerValidator implements Validator{

    @Override
    public boolean supports(Class<?> trainer) {
       return Trainers.class.equals(trainer);
    }

    @Override
    public void validate(Object target, Errors errors) {
        
         Trainers test = (Trainers) target;
      if(test.getFirstname().equals(" ")){
          errors.rejectValue("firstname", "name.empty");
      }
      if(test.getLastname().equals(" ")){
          errors.rejectValue("lastname", "name.empty");
      }
      
    }
    
}
