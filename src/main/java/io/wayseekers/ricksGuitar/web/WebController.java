package io.wayseekers.ricksGuitar.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class WebController {

	@GetMapping("/")	//@RequestMapping(value="/", method = RequestMethod.GET)
	public String main() {
		return "index";
	}
}