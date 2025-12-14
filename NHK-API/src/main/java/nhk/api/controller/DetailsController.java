package nhk.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import nhk.api.domain.programs.model.Description;
import nhk.api.domain.programs.service.DetailsService;

@Controller
public class DetailsController {
	
	@Autowired
	private DetailsService detailsService;
	
	@GetMapping("/program-details/{area}/{service}/{id}")
	public String getProramDetails(@PathVariable String area, @PathVariable String service, @PathVariable String id, Model model) {
		List<Description> desc = detailsService.fetchDetails(area, service, id, "gKu8H0f4HPLvvrKRDzazuhDr7buXSkQG");
		
		model.addAttribute("desc", desc);
		
		return "program-details";
	}
}