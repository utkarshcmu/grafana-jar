package io.github.utkarshcmu.grafana;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

public class Rows {

	private ArrayNode rows;
	
	Rows() {
		ObjectMapper mapper = new ObjectMapper();
		this.rows =  mapper.createArrayNode();
		this.rows.add(new Row().getRow());
	}
	
	public ArrayNode getRows() {
		return this.rows;
	}
}
