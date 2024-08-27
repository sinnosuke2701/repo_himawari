package com.shinnosuke.infra.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeController {

	@Autowired
	CodeService codeService;

	@RequestMapping(value = "/xdm/v1/infra/code/codeXdmList")
	public String codeXdmList() {
		
		List<CodeDto> codes = codeService.selectList();
		
		for(CodeDto codeDto : codes) {
			System.out.println(codeDto.getSeq() + " | " + codeDto.getCd_Name() + " | " + codeDto.getCd_UseNY()
			+ " | " + codeDto.getCd_Order() + " | " + codeDto.getCd_Desc() + " | " + codeDto.getCd_ReDate()
			+ " | " + codeDto.getCd_MoDate() + " | " + codeDto.getCd_DelNY());
		}
		
		
		return "/xdm/v1/infra/code/codeXdmList";
	}

}
