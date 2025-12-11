package nhk.api.domain.programs.model;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class Program {
	private Long id;
	private Integer eventId;
	private Date startTime;
	private Date endTime;
	private Area area;
	private Service service;
	private String title;
	private String subtitle;
	private String content;
	private String act;
	private List<Integer> genres;
}