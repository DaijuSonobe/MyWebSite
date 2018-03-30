package beans;

import java.io.Serializable;

public class StatusDataBeans implements Serializable {

	private int id;
	private String status;

	public StatusDataBeans() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
