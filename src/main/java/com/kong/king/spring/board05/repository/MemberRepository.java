package com.kong.king.spring.board05.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kong.king.spring.board05.entity.*;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
