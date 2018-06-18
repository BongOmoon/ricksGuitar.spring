package io.wayseekers.ricksGuitar.web.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.wayseekers.ricksGuitar.domain.PostsService;
import io.wayseekers.ricksGuitar.domain.posts.Posts;
import io.wayseekers.ricksGuitar.domain.posts.PostsRepository;
import io.wayseekers.ricksGuitar.domain.posts.PostsSaveRequestDTO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostServiceTest {

    @Autowired
    private PostsService postsService;

    @Autowired
    private PostsRepository postsRepository;

    @After
    public void cleanup () {
        postsRepository.deleteAll();
    }

    @Test
    public void DTO_test () {
        //given
        PostsSaveRequestDTO dto = PostsSaveRequestDTO.builder()
                .author("jojoldu@gmail.com")
                .content("pro")
                .title("project")
                .build();

        //when
        postsService.save(dto);

        //then
        Posts posts = postsRepository.findAll().get(0);
        assertThat(posts.getAuthor()).isEqualTo(dto.getAuthor());
        assertThat(posts.getContent()).isEqualTo(dto.getContent());
        assertThat(posts.getTitle()).isEqualTo(dto.getTitle());
    }
}