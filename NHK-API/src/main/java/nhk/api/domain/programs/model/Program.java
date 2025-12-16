package nhk.api.domain.programs.model;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class Program {
	private String id;
	private String eventId;
	private Date start_time;
	private Date end_time;
	private Area area;
	private Service service;
	private String title;
	private String subtitle;
	private String content;
	private String act;
	private List<Integer> genres;
}