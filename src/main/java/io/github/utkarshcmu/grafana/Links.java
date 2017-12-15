package io.github.utkarshcmu.grafana;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

public class Links {

	private ArrayNode links;
	
	Links() {
		ObjectMapper mapper = new ObjectMapper();
		this.links =  mapper.createArrayNode();
	}
	
	public ArrayNode getLinks() {
		return this.links;
	}
}
