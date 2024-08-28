package com.shinnosuke.infra.lecture;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LectureController {

	@Autowired
	LectureService LectureService;
	
	@RequestMapping(value = "/xdm/v1/infra/lecture/LectureXdm")
	public String LectureXdm() {
		
		List<LectureDto>  lectures = LectureService.selectList();
		
		for(LectureDto lecturedto : lectures) {
			System.out.println(lecturedto.getSeq() + " | " + lecturedto.getLec_Type() + " | " + lecturedto.getLec_Name() + " | " + 
								lecturedto.getLec_Price() + " | " + lecturedto.getLec_Instructor() + " | " + lecturedto.getLec_StratCR() + " | " + 
								lecturedto.getLec_EndCR() + " | " + lecturedto.getLec_StartLearn() + " | " + lecturedto.getLec_EndLearn() + " | " + 
								lecturedto.getLec_Place() + " | " + lecturedto.getLec_Detail() + " | " + lecturedto.getLec_ReDate() + " | " + 
								lecturedto.getLec_MoDate() + " | " + lecturedto.getLec_DelNY());
		}
		
		return "/xdm/v1/infra/lecture/LectureXdm";
	}
	
}
