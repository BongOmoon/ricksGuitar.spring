package io.wayseekers.ricksGuitar.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.wayseekers.ricksGuitar.domain.posts.PostsRepository;
import io.wayseekers.ricksGuitar.domain.posts.PostsSaveRequestDTO;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class WebRestController {

    private PostsRepository postsRepository;
    
    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }
    
    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDTO dto){
        postsRepository.save(dto.toEntity());
    }
}