package io.github.utkarshcmu.grafana;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

public class Tags {

	private ArrayNode tags;
	
	Tags() {
		ObjectMapper mapper = new ObjectMapper();
		this.tags =  mapper.createArrayNode();
	}
	
	public ArrayNode getTags() {
		return this.tags;
	}
}
