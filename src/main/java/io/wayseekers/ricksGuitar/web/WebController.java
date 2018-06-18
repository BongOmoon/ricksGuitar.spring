package io.wayseekers.ricksGuitar.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import io.wayseekers.ricksGuitar.domain.PostsService;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class WebController {

    private PostsService postsService;

	@GetMapping("/")	//@RequestMapping(value="/", method = RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	@GetMapping("/main")	//@RequestMapping(value="/main", method = RequestMethod.GET)
	public String main(Model model) {
        model.addAttribute("posts", postsService.findAllDesc());
		return "main";
	}
}