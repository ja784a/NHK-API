package nhk.api.domain.programs.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class DatesDB {
	private Integer id;
	private LocalDate selectableDate;
}