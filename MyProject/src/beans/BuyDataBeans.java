package beans;

import java.io.Serializable;

public class BuyDataBeans implements Serializable {

	private int id;
	private int userId;
	private int itemId;

	public BuyDataBeans() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

}
