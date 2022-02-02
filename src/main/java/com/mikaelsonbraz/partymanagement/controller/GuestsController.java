package com.mikaelsonbraz.partymanagement.controller;

import com.mikaelsonbraz.partymanagement.model.Guest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mikaelsonbraz.partymanagement.repository.Guests;

@Controller
@RequestMapping("/guests")
public class GuestsController {

    @Autowired
    private Guests guests;

    @GetMapping
    public ModelAndView listing(){
        ModelAndView modelAndView = new ModelAndView("GuestsList");

        modelAndView.addObject("guests", guests.findAll());

        modelAndView.addObject(new Guest());

        return modelAndView;
    }

    @PostMapping
    public String save(Guest guest){
        this.guests.save(guest);
        return "redirect:/guests";
    }

}
