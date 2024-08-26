package com.shinnosuke.infra.codegroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeGroupController {
	
	@Autowired
	CodeGroupService service;
	
	@RequestMapping(value = "/xdm/v1/infra/codegroup/codeGroupXdmList" )
		public String codeGroupXdmList() {
		
	//여기에서 함수를 호출히야 된다는
	//service 에 있는 함수를 호출
		service.selectList();
		
		
		return "/xdm/v1/infra/codegroup/codeGroupXdmList";
	}
	
	@RequestMapping(value = "/xdm/v1/infra/codegroup/codeGroupXdmForm" )
	public String codeGroupXdmList2() {
	return "/xdm/v1/infra/codegroup/codeGroupXdmForm";
}

	
}
