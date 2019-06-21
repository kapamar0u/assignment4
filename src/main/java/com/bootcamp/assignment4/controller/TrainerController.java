/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.assignment4.controller;

import com.bootcamp.assignment4.dao.TrainerDao;
import com.bootcamp.assignment4.model.Trainers;
import com.bootcamp.assignment4.repository.TrainerRepository;
import com.bootcamp.assignment4.validators.TrainerValidator;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Kosta
 */
@Controller
public class TrainerController {

    @Autowired
    TrainerDao td;

    @Autowired
    TrainerValidator tv;

    @Autowired
    TrainerRepository tr;

    @RequestMapping(value = "InsertTrainer.htm", method = RequestMethod.GET)
    public String insertTrainer(ModelMap mm) {
        Trainers t = new Trainers();
        mm.addAttribute("trainer", t);
        return "InsertTrainer";
    }

    @RequestMapping(value = "doInsertTrainer", method = RequestMethod.POST)
    public String doInsertTrainer(ModelMap mm, @ModelAttribute("trainer") @Valid Trainers t, BindingResult br) {
        tv.validate(t, br);
        if (br.hasErrors()) {
            return "InsertTrainer";
        } else {
            td.insert(t);
        }
        return "index";
    }

    @RequestMapping(value = "viewAllTrainers.htm", method = RequestMethod.GET)
    public String viewAllTrainers(ModelMap mm) {
        List<Trainers> list = td.viewAllTrainers();
        mm.addAttribute("list", list);
        return "ViewAllTrainers";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String delete(ModelMap mm, @PathVariable("id") int id) {
        tr.deleteById(id);
        return "redirect:/viewAllTrainers.htm";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String update(ModelMap mm, @PathVariable("id") int id) {
        Trainers t = tr.getOne(id);
        mm.addAttribute("trainer", t);
        return "Update";
    }


   @RequestMapping(value = "/updateTrainer", method = RequestMethod.POST)
   public ModelAndView doUpdateTrainer(@RequestParam("id") int id, @RequestParam("firstname") String firstname, @RequestParam("lastname") String lastname) {
       ModelAndView mv = new ModelAndView("redirect:/");
       Trainers trainer = new Trainers();
       trainer.setId(id);
       trainer.setFirstname(firstname);
       trainer.setLastname(lastname);
       tr.save(trainer);
       return mv;
   }


}
