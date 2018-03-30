package beans;

import java.io.Serializable;

public class CategoryDataBeans implements Serializable {

	private int mainId;
	private int subId;
	private String name;

	public CategoryDataBeans() {
	}

	public int getMainId() {
		return mainId;
	}

	public void setMainId(int mainId) {
		this.mainId = mainId;
	}

	public int getSubId() {
		return subId;
	}

	public void setSubId(int subId) {
		this.subId = subId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
