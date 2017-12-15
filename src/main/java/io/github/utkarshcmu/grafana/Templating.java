package io.github.utkarshcmu.grafana;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Templating {

	private ObjectNode templating;
	
	Templating() {
		ObjectMapper mapper = new ObjectMapper();
		this.templating =  mapper.createObjectNode();
		this.templating.putPOJO("list", mapper.createArrayNode());
	}

	public ObjectNode getTemplating() {
		return this.templating;
	}
}
