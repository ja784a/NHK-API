package nhk.api.domain.programs.model;

import lombok.Data;

@Data
public class Service {
	private String id;
	private String name;
	private LogoS logoS;
	private LogoM logoM;
	private LogoL logoL;
}