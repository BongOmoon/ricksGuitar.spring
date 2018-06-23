package io.wayseekers.ricksGuitar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.wayseekers.ricksGuitar.repository.InstrumentRepository;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class WebRestController {

    private InstrumentRepository instrumentRepository;
    
    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }
    
//    @PostMapping("/posts")
//    public void savePosts(@RequestBody PostsSaveRequestDTO dto){
//        postsRepository.save(dto.toEntity());
//    }
}