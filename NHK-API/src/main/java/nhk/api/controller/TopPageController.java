package nhk.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import nhk.api.domain.programs.model.AreasDB;
import nhk.api.domain.programs.model.DatesDB;
import nhk.api.domain.programs.model.ServicesDB;
import nhk.api.domain.programs.service.AreasDBService;
import nhk.api.domain.programs.service.DatesDBService;
import nhk.api.domain.programs.service.ServicesDBService;
import nhk.api.form.TopPageForm;

@Controller
public class TopPageController {
	@Autowired
	private ServicesDBService servicesDBService;
	
	@Autowired
	private AreasDBService areasDBService;
	
	@Autowired
	private DatesDBService datesDBService;
	
	@GetMapping("/")
	public String getTopPage(@ModelAttribute TopPageForm form, Model model) {
		datesDBService.updateDates();
		
		List<ServicesDB> services = servicesDBService.getServices();
		
		List<AreasDB> areas = areasDBService.getAreas();
		
		List<DatesDB> dates = datesDBService.getDates();
		
		model.addAttribute("services", services);
		
		model.addAttribute("areas", areas);
		
		model.addAttribute("dates", dates);
		
		return "top-page";
	}
}