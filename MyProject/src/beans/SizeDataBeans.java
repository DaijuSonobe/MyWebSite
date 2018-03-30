package beans;

import java.io.Serializable;

public class SizeDataBeans implements Serializable {

	private int id;
	private String size;

	public SizeDataBeans() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

}
