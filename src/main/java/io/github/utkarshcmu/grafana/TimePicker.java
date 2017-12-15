package io.github.utkarshcmu.grafana;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class TimePicker {

	private ObjectNode timepicker;
	
	TimePicker() {
		ObjectMapper mapper = new ObjectMapper();
		this.timepicker =  mapper.createObjectNode();
		ArrayNode refreshIntervals = mapper.createArrayNode();
		refreshIntervals.add("5s");
		refreshIntervals.add("10s");
		refreshIntervals.add("30s");
		refreshIntervals.add("1m");
		refreshIntervals.add("5m");
		refreshIntervals.add("15m");
		refreshIntervals.add("30m");
		refreshIntervals.add("1h");
		refreshIntervals.add("2h");
		refreshIntervals.add("1d");
		this.timepicker.putPOJO("refresh_intervals", refreshIntervals);
		ArrayNode timeOptions = mapper.createArrayNode();
		timeOptions.add("5m");
		timeOptions.add("15m");
		timeOptions.add("1h");
		timeOptions.add("6h");
		timeOptions.add("12h");
		timeOptions.add("24h");
		timeOptions.add("2d");
		timeOptions.add("7d");
		timeOptions.add("30d");
		this.timepicker.putPOJO("time_options", timeOptions);
	}
	
	public ObjectNode getTimePicker() throws JsonProcessingException {
		return this.timepicker; 
	}
	
}
