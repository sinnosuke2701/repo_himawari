package com.shinnosuke.infra.codegroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeGroupController {
	
	@Autowired
	CodeGroupService  CodeGroupService;
	
	@RequestMapping(value = "/xdm/v1/infra/codegroup/codeGroupXdmList")
	public String codeGroupXdmList() {
		
		List<CodeGroupDto> codegroups = CodeGroupService.selectList();
		
		for(CodeGroupDto codegroupdto  :codegroups) {
			System.out.println(codegroupdto.getSeq() + " | " + codegroupdto.getCg_Name() + " | " + 
								codegroupdto.getCg_UseNY() + " | " + codegroupdto.getCg_Order() + " | " + 
								codegroupdto.getCg_Desc() + " | " + codegroupdto.getCg_ReDate() + " | " + 
								codegroupdto.getCg_MoDate() + " | " + codegroupdto.getCg_DelNY());
		}
		
	return "/xdm/v1/infra/codegroup/codeGroupXdmList";
		
	}
	
	
	
}
