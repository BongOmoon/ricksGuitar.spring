package io.wayseekers.ricksGuitar.domain;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import io.wayseekers.ricksGuitar.domain.posts.PostsRepository;
import io.wayseekers.ricksGuitar.domain.posts.PostsSaveRequestDTO;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class PostsService {
    private PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDTO dto){
        return postsRepository.save(dto.toEntity()).getId();
    }
}