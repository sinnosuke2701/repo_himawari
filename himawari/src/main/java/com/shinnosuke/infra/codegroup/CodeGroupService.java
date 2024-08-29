package com.shinnosuke.infra.codegroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeGroupService {
	
	
	@Autowired
//	private CodeGroupDao CodeGroupDao;
//		List<CodeGroupDto> selectList(){
//			List<CodeGroupDto> codegroups =  CodeGroupDao.selectList();
//			return codegroups;
//		}
	
		private CodeGroupDao CodeGroupDao;
		List<CodeGroupDto> selectList(){
			
			return CodeGroupDao.selectList();
		}
		
}
