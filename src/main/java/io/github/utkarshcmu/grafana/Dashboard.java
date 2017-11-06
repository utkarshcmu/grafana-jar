package io.github.utkarshcmu.grafana;

public class Dashboard {

	private boolean editable;
	private Integer gnetId;
	private int graphTooltip;
	private boolean hideControls;
	private Integer id;
	private Row[] rows;
	private int schemaVersion;
	private String style;
	private Tag[] tags;
	private Time time;
	private TimePicker timepicker;
	private String timezone;
	private String title;
	
	public Dashboard() {
		this.editable = true;
		this.gnetId = null;
		this.graphTooltip = 0;
		this.hideControls = false;
		this.id = null;
		this.rows = new Row[1];
		this.rows[0] = new Row();
		this.schemaVersion = 14;
		this.style = "dark";
		this.tags = new Tag[0];
		this.time = new Time();
		this.timepicker = new TimePicker();
		this.timezone = "";
		this.title = "New Dashboard";
	}
	
	public Integer getId() {
		return id;
	}

	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}

	public Integer getGnetId() {
		return gnetId;
	}

	public void setGnetId(Integer gnetId) {
		this.gnetId = gnetId;
	}

	public int getGraphTooltip() {
		return graphTooltip;
	}

	public void setGraphTooltip(int graphTooltip) {
		this.graphTooltip = graphTooltip;
	}

	public boolean isHideControls() {
		return hideControls;
	}

	public void setHideControls(boolean hideControls) {
		this.hideControls = hideControls;
	}

	public Row[] getRows() {
		return rows;
	}

	public void setRows(Row[] rows) {
		this.rows = rows;
	}

	public int getSchemaVersion() {
		return schemaVersion;
	}

	public void setSchemaVersion(int schemaVersion) {
		this.schemaVersion = schemaVersion;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public Tag[] getTags() {
		return tags;
	}

	public void setTags(Tag[] tags) {
		this.tags = tags;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public TimePicker getTimepicker() {
		return timepicker;
	}

	public void setTimepicker(TimePicker timepicker) {
		this.timepicker = timepicker;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}