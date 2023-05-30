package com.kong.king.spring.board05.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.kong.king.spring.board05.entity.*;

public interface ReplyRepository extends JpaRepository<Reply, Long> {
	
	@Modifying
	@Query("DELETE FROM Reply r WHERE r.board.bno = :bno")		
	void deleteByBno(Long bno);
	
	List<Reply> getRepliesByBoardOrderByRno(Board board);	
}