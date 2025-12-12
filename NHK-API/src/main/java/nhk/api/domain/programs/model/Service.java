package nhk.api.domain.programs.model;

import lombok.Data;

@Data
public class Service {
	private String id;
	private String name;
	private LogoS logo_s;
	private LogoM logo_m;
	private LogoL logo_l;
}