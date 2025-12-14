package nhk.api.domain.programs.model;

import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class DetailsFileData {
	private Map<String, List<Description>> list;
}