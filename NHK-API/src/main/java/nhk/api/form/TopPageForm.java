package nhk.api.form;

import java.time.LocalDate;

import lombok.Data;

@Data
public class TopPageForm {
	private String areaId;
	private String serviceId;
	private LocalDate date;
}