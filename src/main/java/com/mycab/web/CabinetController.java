package com.mycab.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/cabinet")
public class CabinetController {

    @RequestMapping(method = RequestMethod.GET)
    public String cabinet(Model model){
        return "cabinet";
    }
}
