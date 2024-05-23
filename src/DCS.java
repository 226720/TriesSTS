
public enum DCS {
	
	DC1("1"),
	DC2("2");

	private String value;
	
	public String getValue() {
		return value;
	}
	DCS(String value) {
		this.value= value;
	}

}
