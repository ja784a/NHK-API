package nhk.api.domain.programs.model;

import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class JsonFileData {
	private Map<String, List<Program>> list;
}