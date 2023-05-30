package com.kong.king.spring.board05.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kong.king.spring.board05.dto.BoardDTO;
import com.kong.king.spring.board05.dto.PageRequestDTO;
import com.kong.king.spring.board05.dto.PageResultDTO;

@SpringBootTest
public class BoardServiceTests {
	
	@Autowired
	private BoardService boardService;
	
//	@Test
//	public void testRegister() {
//		BoardDTO dto = BoardDTO.builder()
//				.title("게시판 타이틀 제목 리스트..")
//				.content("게시판 내용 텍스트...")
//				.writerEmail("user55@king.kong.com")
//				.build();
//		
//		Long bno = boardService.register(dto);
//		
//		System.out.println("-------- end of boardservice.register()");
//	}
	
//	@Test
//	public void testList() {
//		
//		PageRequestDTO pageRequestDTO = new PageRequestDTO();
//		
//		PageResultDTO<BoardDTO, Object[]> result = boardService.getList(pageRequestDTO);
//		
//		for(BoardDTO boardDTO : result.getDtoList()) {
//			System.out.println(boardDTO);
//		}
//	}
//	
//	@Test
//	public void testGet() {
//		Long bno = 100L;
//		BoardDTO boardDTO = boardService.get(bno);
//		System.out.println(boardDTO);
//	}
//	
//	@Test
//	public void testRemove() {
//		Long bno = 1L;
//		boardService.removeWithReplies(bno);
//	}
	
	@Test
	public void testModify() {
		BoardDTO boardDTO = BoardDTO.builder()
				.bno(3L)
				.title("제목을 변경합니다")
				.content("내용을 변경합니다.")
				.build();
		
		boardService.modify(boardDTO);
	}
	
}
