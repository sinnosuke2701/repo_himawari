package com.shinnosuke.infra.codegroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeGroupService {
	
//CodeGroupDao codegroupdao = new CodeGroupDao();
	@Autowired
	CodeGroupDao dao;
	
	public void selectList() {
		//codeGroup.selectList();
		dao.selectList();
	}
	
	
	
	
	
}
