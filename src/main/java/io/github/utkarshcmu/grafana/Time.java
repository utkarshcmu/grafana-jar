package io.github.utkarshcmu.grafana;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Time {
	
	private ObjectNode time;
	
	Time() {
		ObjectMapper mapper = new ObjectMapper();
		this.time =  mapper.createObjectNode();
		this.time.put("from", "now-6h");
		this.time.put("to", "now");
	}
	
	public ObjectNode getTime() throws JsonProcessingException {
		return this.time; 
	}
	
}
