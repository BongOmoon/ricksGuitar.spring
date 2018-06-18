package io.wayseekers.ricksGuitar.domain.instrument;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class InstSaveRequestDTO {
	
    private String title;
    private String content;
    private String author;

//    public Posts toEntity(){
//        return Posts.builder()
//                .title(title)
//                .content(content)
//                .author(author)
//                .build();
//    }
}
