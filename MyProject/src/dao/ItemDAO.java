package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import base.DBManager;
import beans.ItemDataBeans;

public class ItemDAO {

//	HOME画面に表示させる商品情報(id、画像、商品名、値段、コメント)をリターン
	public static ArrayList<ItemDataBeans> getRandomItems() throws SQLException{

		Connection con = null;

		try {

			con = DBManager.getConnection();

			String sql = "SELECT id, user_image_1, name, price, comment FROM item ORDER BY RAND()";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			ArrayList<ItemDataBeans> itemList = new ArrayList<>();

			while(rs.next()) {
				ItemDataBeans item = new ItemDataBeans();
				item.setId(rs.getInt("id"));
				item.setImage1(rs.getString("user_image_1"));
				item.setName(rs.getString("name"));
				item.setComment(rs.getString("comment"));
				itemList.add(item);
			}

			return itemList;

		}catch(SQLException e) {
			throw new SQLException(e);
		}finally {
			if(con != null) {
				con.close();
			}
		}

	}

//	商品詳細画面に表示させる商品情報詳細をリターン
	public static ItemDataBeans getItemInfo(int id) throws SQLException{

		Connection con = null;
		PreparedStatement pSt = null;

		try {

			con = DBManager.getConnection();

			pSt = con.prepareStatement("SELECT item.user_image_1,"
										+ " item.user_image_2"
										+ " item.user_image_3"
										+ " item.name"
										+ " item.price"
										+ " item.update_date"
										+ " user.nickname"
										+ " main_category.name"
										+ " sub_category.name"
										+ " size.size"
										+ " status.status"
										+ " delivery_defrayment.delivery_defrayment"
										+ " delivery_method.delivery_method"
										+ " item.delivery_cost"
										+ " days_to_shipping.days_to_shipping"
										+ " item.comment"
										+ " FROM item"
										+ " JOIN user"
										+ " ON item.user_id = user.id"
										+ " JOIN sub_category"
										+ " ON item.category = sub_category.id"
										+ " JOIN main_category"
										+ " ON sub_category.category_id = main_category.id"
										+ " JOIN size"
										+ " ON item.size = size.id"
										+ " JOIN status"
										+ " ON item.status = status.id"
										+ " JOIN delivery_defrayment"
										+ " ON item.delivery_defrayment = delivery_defrayment.id"
										+ " JOIN delivery_method"
										+ " ON item.delivery_method = delivery_method.id"
										+ " JOIN days_to_shipping"
										+ " ON item.days_to_shipping = days_to_shipping.id"
										+ " WHERE item.id = ?");

			pSt.setInt(1,  id);
			ResultSet rs = pSt.executeQuery();
			ItemDataBeans item = new ItemDataBeans();

			while(rs.next()) {
				item.setImage1(rs.getString("item.user_image_1"));
				item.setImage2(rs.getString("item.user_image_2"));
				item.setImage3(rs.getString("item.user_Image_3"));
				item.setName(rs.getString("item.name"));
				item.setUpdateDate(rs.getString("item.update_date"));
				item.setNickname(rs.getString("user.nickname"));
				item.setMainCategory(rs.getString("main_caetgory.name"));
				item.setSubCategory(rs.getString("sub_category_name"));
				item.setSize(rs.getString("size.size"));
				item.setStatus(rs.getString("status.status"));
				item.setDeliveryDefrayment(rs.getString("delivery_defrayment.delivery_defrayment"));
				item.setDeliveryMethod(rs.getString("delivery_method.delivery_method"));
				item.setDeliveryCost(rs.getInt("delivery_cost.delivery_cost"));
				item.setDaysToShipping(rs.getString("days_to_shipping.days_to_shipping"));
				item.setComment(rs.getString("item.comment"));
			}

			return item;

		}catch(SQLException e) {
			throw new SQLException(e);
		}finally {
			if(con != null) {
				con.close();
			}
		}

	}

//	検索窓からの検索
	public static

}
