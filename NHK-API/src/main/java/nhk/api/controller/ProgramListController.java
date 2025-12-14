package nhk.api.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpSession;
import nhk.api.domain.programs.model.AreasDB;
import nhk.api.domain.programs.model.Program;
import nhk.api.domain.programs.model.ServicesDB;
import nhk.api.domain.programs.service.AreasDBService;
import nhk.api.domain.programs.service.ProgramsService;
import nhk.api.domain.programs.service.ServicesDBService;
import nhk.api.form.TopPageForm;

@Controller 
public class ProgramListController {
	
	@Autowired
	private ProgramsService programsService;
	
	@Autowired
	private ServicesDBService servicesDBService;
	
	@Autowired
	private AreasDBService areasDBService;
	
	@GetMapping("/program-list")
	public String getProgramList(HttpSession session, Model model) {
		String area = (String) session.getAttribute("areaId");
		String service = (String) session.getAttribute("serviceId");
		LocalDate date = (LocalDate) session.getAttribute("date");
		
		List<Program> programs = programsService.fetchPrograms(area, service, date, "gKu8H0f4HPLvvrKRDzazuhDr7buXSkQG");
		ServicesDB serviceDB = servicesDBService.getService(service);
		AreasDB areaDB = areasDBService.getArea(area);
		
		model.addAttribute("programs", programs);
		model.addAttribute("serviceDB", serviceDB);
		model.addAttribute("areaDB", areaDB);
		model.addAttribute("date", date);
		
		if (programs == null) {
			return "error";
		}
		
		return "program-list";
		
	}
	
	@PostMapping("/call-program-list")
	public String callProgramList(HttpSession session, TopPageForm form) {
		session.setAttribute("areaId", form.getAreaId());
		session.setAttribute("serviceId", form.getServiceId());
		session.setAttribute("date", form.getDate());
		
		return "redirect:/program-list";
		
	}
}