package com.shinnosuke.infra.codegroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeGroupController {
	
	@Autowired
	CodeGroupService codeGroupService;
	
	@RequestMapping(value = "/xdm/v1/infra/codegroup/codeGroupXdmList" )
		public String codeGroupXdmList() {
		
	//여기에서 함수를 호출해야 된다는
	//service 에 있는 함수를 호출
		List<CodeGroupDto> codeGroups = codeGroupService.selectList();
		
//		System.out.println("codeGroups.size() : " + codeGroups.size());
		
		// 향상된 for 문
		
				
			for (CodeGroupDto codeGroupDto : codeGroups) { // int codGroup = codeGroups[0];
				System.out.println(codeGroupDto.getSeq() + " | " + codeGroupDto.getCg_Name() + " | " + codeGroupDto.getCg_UseNY()
				+ " | " + codeGroupDto.getCg_Order() + " | " + codeGroupDto.getCg_Desc() + " | " + codeGroupDto.getCg_ReDate()
				+ " | " + codeGroupDto.getCg_MoDate() + " | " + codeGroupDto.getCg_DelNY());
			}	
				
		
		return "/xdm/v1/infra/codegroup/codeGroupXdmList";
	}
	
	@RequestMapping(value = "/xdm/v1/infra/codegroup/codeGroupXdmForm" )
	public String codeGroupXdmList2() {
	return "/xdm/v1/infra/codegroup/codeGroupXdmForm";
}

	
}





