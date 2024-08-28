package com.shinnosuke.infra.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@Autowired
	MemberService MemberService;
	
	@RequestMapping(value = "/xdm/v1/infra/member/MemberXdm")
	public String MemberXdm() {
		
		List<MemberDto> members = MemberService.selectList();
		
		for(MemberDto memberdto : members) {
			System.out.println(memberdto.getSeq() + " | " + memberdto.getMem_Authority() + " | " + memberdto.getMem_Name() + " | " + 
								memberdto.getMem_Id() + " | " + memberdto.getMem_Password() + " | " + memberdto.getMem_Gender() + " | " + 
								memberdto.getMem_Birth() + " | " + memberdto.getMem_Email() + " | " + memberdto.getMem_Phone() + " | " + 
								memberdto.getMem_Desc() + " | " + memberdto.getMem_ReDate() + " | " + memberdto.getMem_MoDate() + " | " + 
								memberdto.getMem_DelNY());
		}
	
			return "/xdm/v1/infra/member/MemberXdm";
	}
}
