package com.kong.king.spring.security10.entity;

import java.util.*;

import javax.persistence.*;

import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class ClubMember extends BaseEntity {

	@Id
	private String email;
	private String password;
	private String name;
	private boolean fromSocial;
	
	@ElementCollection(fetch = FetchType.LAZY)
	@Builder.Default
	private Set<ClubMemberRole> roleSet = new HashSet<>();
	
	public void addMemberRole(ClubMemberRole clubMemberRole) {
		roleSet.add(clubMemberRole);
	}
}
