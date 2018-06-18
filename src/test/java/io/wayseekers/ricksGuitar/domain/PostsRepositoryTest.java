package io.wayseekers.ricksGuitar.domain;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.wayseekers.ricksGuitar.domain.posts.Posts;
import io.wayseekers.ricksGuitar.domain.posts.PostsRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {

	@Autowired
	PostsRepository postsRepository;

	@After
	public void cleanup() {

		postsRepository.deleteAll();
	}

	@Test
	public void posts_test() {
		// given
		postsRepository.save(Posts.builder()
				.title("pro")
				.content("project")
				.author("jojoldu@gmail.com")
				.build());
		// when	
		List<Posts> postsList = postsRepository.findAll();

		// then
		Posts posts = postsList.get(0);
		assertThat(posts.getTitle(), is("pro"));
		assertThat(posts.getContent(), is("project"));
	}
	
	@Test
    public void BaseTimeEntity_적용() {
        //given
        LocalDateTime now = LocalDateTime.now();
        postsRepository.save(Posts.builder()
                .title("pro")
                .content("project")
                .author("jojoldu@gmail.com")
                .build());
        //when
        List<Posts> postsList = postsRepository.findAll();

        //then
        Posts posts = postsList.get(0);
        assertTrue(posts.getCreatedDate().isAfter(now));
        assertTrue(posts.getModifiedDate().isAfter(now));
    }
}