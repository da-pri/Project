package com.kong.king.spring.board05.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.kong.king.spring.board05.dto.ReplyDTO;
import com.kong.king.spring.board05.entity.Board;
import com.kong.king.spring.board05.entity.Reply;
import com.kong.king.spring.board05.repository.ReplyRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReplyServiceImpl implements ReplyService {
	
	private final ReplyRepository replyrepository;
	
	@Override
	public Long register(ReplyDTO replyDTO) {
		Reply reply = dtoToEntity(replyDTO);
		replyrepository.save(reply);
		return reply.getRno();
	}

	@Override
	public List<ReplyDTO> getList(Long bno) {
		List<Reply> result = replyrepository.getRepliesByBoardOrderByRno(Board.builder().bno(bno).build());
		
		return result.stream().map(reply -> entityToDTO(reply)).collect(Collectors.toList());
	}

	@Override
	public void modify(ReplyDTO replyDTO) {
		Reply reply = dtoToEntity(replyDTO);
		replyrepository.save(reply);
	}

	@Override
	public void remove(Long rno) {
		replyrepository.deleteById(rno);
	}

}