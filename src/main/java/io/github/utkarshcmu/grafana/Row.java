package io.github.utkarshcmu.grafana;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Row {

	private ObjectNode row;
	
	Row() {
		ObjectMapper mapper = new ObjectMapper();
		this.row =  mapper.createObjectNode();
		this.row.put("collapse", false);
		this.row.put("height", "250px");
		this.row.putPOJO("panels", new Panels().getPanels());
		this.row.putNull("repeat");
		this.row.putNull("repeatIteration");
		this.row.putNull("repeatRowId");
		this.row.put("showTitle", false);
		this.row.put("title", "Dashboard Row");
		this.row.put("titleSize", "h6");
	}
	
	public ObjectNode getRow() {
		return this.row;
	}
}
