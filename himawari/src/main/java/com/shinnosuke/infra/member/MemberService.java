package com.shinnosuke.infra.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	
	@Autowired
	private MemberDao MemberDao;
	List<MemberDto> selectList(){
		List<MemberDto> members = MemberDao.selectList();
			return members;
		}
}
