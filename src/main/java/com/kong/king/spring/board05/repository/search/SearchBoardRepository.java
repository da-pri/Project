package com.kong.king.spring.board05.repository.search;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.kong.king.spring.board05.entity.*;

public interface SearchBoardRepository {
	
	Board Search1();
	
	Page<Object[]> searchPage(String type, String keyword, Pageable pageable);
}
