package nhk.api.domain.programs.model;

import java.util.Date;

import lombok.Data;

@Data
public class Description {
	private String id;
	private String event_id;
	private Date start_time;
	private Date end_time;
	private Area area;
	private Service service;
	private String title;
	private String subtitle;
	private String content;
	private String act;
	private String[] genres;
	private Logo program_logo;
	private String program_url;
	private String episode_url;
	private String[] hashtags;
}