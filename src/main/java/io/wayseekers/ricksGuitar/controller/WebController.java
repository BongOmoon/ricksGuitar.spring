package io.wayseekers.ricksGuitar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import io.wayseekers.ricksGuitar.domain.instrument.Instrument;

@Controller
public class WebController {
	
	@Autowired
	private InstrumentServiceImpl iService;
	
    @GetMapping("/")
    public String form(Model model) {
        model.addAttribute("instrument", new Instrument());
        model.addAttribute("result", iService.findAll());
        return "index";
    }
    
    @RequestMapping(value="/search")
    public String search(@ModelAttribute Instrument i, Model model) {
    	List<Instrument> iList = iService.search(i);
    	model.addAttribute("result", iList);
    	
    	return "main";
    }
    
    @PostMapping("/add")
    public String add(@ModelAttribute Instrument i, Model model) {
    	Instrument entity = iService.save(i);
    	
    	model.addAttribute("instrument", entity);
    	
    	return "redirect:/";
    }
    
    @RequestMapping("/del/{id}")
    public String delete(@PathVariable Integer id) {
    	iService.delete(id);
    	return "redirect:/";
    }
    
    @RequestMapping("/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("instrument", iService.getById(id));
        return "redirect:/#edit";
    }

}