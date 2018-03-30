package beans;

import java.io.Serializable;

public class DeliveryMethodDataBeans implements Serializable {

	private int id;
	private String deliveryMethod;

	public DeliveryMethodDataBeans() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDeliveryMethod() {
		return deliveryMethod;
	}

	public void setDeliveryMethod(String deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}

}
