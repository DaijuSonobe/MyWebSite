package beans;

import java.io.Serializable;

public class DeliveryDefraymentDataBeans implements Serializable {

	private int id;
	private String deliveryDefrayment;

	public DeliveryDefraymentDataBeans() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDeliveryDefrayment() {
		return deliveryDefrayment;
	}

	public void setDeliveryDefrayment(String deliveryDefrayment) {
		this.deliveryDefrayment = deliveryDefrayment;
	}

}
