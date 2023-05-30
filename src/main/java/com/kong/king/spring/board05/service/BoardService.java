package com.kong.king.spring.board05.service;

import com.kong.king.spring.board05.dto.*;
import com.kong.king.spring.board05.entity.*;

public interface BoardService {
	
	Long register(BoardDTO dto);
	
	PageResultDTO<BoardDTO, Object[]> getList(PageRequestDTO pageRequestDTO);
	
	BoardDTO get(Long bno);
	
	void removeWithReplies(Long bno);
	
	void modify(BoardDTO boardDTO);
	
	default Board dtoToEntity(BoardDTO dto) {										// DTO => ENTITY
		Member member = Member.builder()
				.email(dto.getWriterEmail()).build();
		
		Board board= Board.builder()
				.bno(dto.getBno())
				.title(dto.getTitle())
				.content(dto.getContent())
				.writer(member)
				.build();
		
		return board;
	}
	
	default BoardDTO entityToDTO(Board board,Member member,Long replyCount) {		 // ENTITY => DTO
		
		BoardDTO boardDTO = BoardDTO.builder()
				.bno(board.getBno())
				.title(board.getTitle())
				.content(board.getContent())
				.regDate(board.getRegDate())
				.modDate(board.getModDate())
				.writerEmail(member.getEmail())
				.writerName(member.getName())
				.replyCount(replyCount.intValue()) //long값을 int로 처리
				.build();
		
		return boardDTO;
	}
}
