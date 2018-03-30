package beans;

import java.io.Serializable;

public class DaysToShippingDataBeans implements Serializable {

	private int id;
	private String daysToShipping;

	public DaysToShippingDataBeans() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDaysToShipping() {
		return daysToShipping;
	}

	public void setDaysToShipping(String daysToShipping) {
		this.daysToShipping = daysToShipping;
	}

}
