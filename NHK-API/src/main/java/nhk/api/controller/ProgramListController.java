package nhk.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import nhk.api.domain.programs.service.ProgramsService;

@Controller 
public class ProgramListController {
	
	@Autowired
	private ProgramsService programsService;
	
	@GetMapping("/{area}/{service}/{date}")
	public String getProgramList(@PathVariable int area, @PathVariable String service, @PathVariable @DateTimeFormat(pattern = "yyyy-mm-dd") String date, Model model) {
		String programList = programsService.fetchPrograms(area, service, date, "gKu8H0f4HPLvvrKRDzazuhDr7buXSkQG");
		
		model.addAttribute("programList", programList);
		
		return "program-list";
		
	}
}