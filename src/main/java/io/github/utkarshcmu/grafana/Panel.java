package io.github.utkarshcmu.grafana;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Panel {

	private ObjectNode panel;
	
	Panel() {
		ObjectMapper mapper = new ObjectMapper();
		this.panel =  mapper.createObjectNode();
	}
	
	public ObjectNode getPanel() {
		return this.panel;
	}

}
