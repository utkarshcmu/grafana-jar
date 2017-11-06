package io.github.utkarshcmu.grafana;

public class Row {

	private boolean collapse;
	private String height;
	private String repeat;
	private String repeatIteration;
	private String repeatRowId;
	private boolean showTitle;
	private String title;
	private String titleSize;
	
	Row() {
		this.collapse = false;
		this.height = "250px";
		this.repeat = null;
		this.repeatIteration = null;
		this.repeatRowId = null;
		this.showTitle = false;
		this.title = "Dashboard Row";
		this.titleSize = "h6";
	}
	
	public boolean isCollapse() {
		return collapse;
	}

	public void setCollapse(boolean collapse) {
		this.collapse = collapse;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getRepeat() {
		return repeat;
	}

	public void setRepeat(String repeat) {
		this.repeat = repeat;
	}

	public String getRepeatIteration() {
		return repeatIteration;
	}

	public void setRepeatIteration(String repeatIteration) {
		this.repeatIteration = repeatIteration;
	}

	public String getRepeatRowId() {
		return repeatRowId;
	}

	public void setRepeatRowId(String repeatRowId) {
		this.repeatRowId = repeatRowId;
	}

	public boolean isShowTitle() {
		return showTitle;
	}

	public void setShowTitle(boolean showTitle) {
		this.showTitle = showTitle;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitleSize() {
		return titleSize;
	}

	public void setTitleSize(String titleSize) {
		this.titleSize = titleSize;
	}
	
}
