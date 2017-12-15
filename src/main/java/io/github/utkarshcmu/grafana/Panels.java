package io.github.utkarshcmu.grafana;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

public class Panels {

	private ArrayNode panels;
	
	Panels() {
		ObjectMapper mapper = new ObjectMapper();
		this.panels =  mapper.createArrayNode();
	}
	
	public ArrayNode getPanels() {
		return this.panels;
	}

}
