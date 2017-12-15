package io.github.utkarshcmu.grafana;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Dashboard {

	private ObjectNode dashboard;
	
	// Constructor with title name
	public Dashboard(String title) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		this.dashboard =  mapper.createObjectNode();
		this.dashboard.put("editable", true);
		this.dashboard.putNull("gnetId");
		this.dashboard.put("graphTooltip", 0);
		this.dashboard.put("hideControls", false);
		this.dashboard.putNull("id");
		this.dashboard.putPOJO("links",  new Links().getLinks());
		this.dashboard.putPOJO("rows", new Rows().getRows());
		this.dashboard.put("schemaVersion", 14);
		this.dashboard.put("style","dark");
		this.dashboard.putPOJO("tags", new Tags().getTags());
		this.dashboard.putPOJO("templating", new Templating().getTemplating());
		this.dashboard.putPOJO("time", new Time().getTime());
		this.dashboard.putPOJO("timepicker", new TimePicker().getTimePicker());
		this.dashboard.put("timezone", "");
		this.dashboard.put("title", title);
	}
	
	public String getDashboardJSON() throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(this.dashboard); 
	}
	
}