package com.kong.king.spring.board05.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardDTO {
	
	private Long bno;
	private String title;
	private String content;
	private String writerEmail;			// 작성자 이메일(id)
	private String writerName;			// 작성자 이름
	private LocalDateTime regDate;
	private LocalDateTime modDate;
	private int replyCount; 			// 댓글 수
}
