package com.mikaelsonbraz.partymanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import com.mikaelsonbraz.partymanagement.repository.Guests;


@Controller
public class GuestsController {

    @Autowired
    private Guests guests;

    @GetMapping("/guests")
    public ModelAndView listing(){
        ModelAndView modelAndView = new ModelAndView("GuestsList");

        modelAndView.addObject("guests", guests.findAll());

        return modelAndView;
    }
}
