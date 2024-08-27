package com.shinnosuke.infra.codegroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeGroupService {
	
	@Autowired
	private CodeGroupDao CodeGroupDao;
	
	public List<CodeGroupDto> selectList() {
		List<CodeGroupDto> codeGroups = CodeGroupDao.selectList();
		return codeGroups;
	}
	
}
