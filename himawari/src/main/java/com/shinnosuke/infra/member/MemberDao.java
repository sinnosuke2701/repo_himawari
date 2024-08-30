package com.shinnosuke.infra.member;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface MemberDao {
	
	List<MemberDto> selectList();
	
	public int insert(MemberDto MemberDto);
	
}
