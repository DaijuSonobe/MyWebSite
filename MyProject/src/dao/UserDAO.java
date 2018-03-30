package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import base.DBManager;
import beans.UserDataBeans;

public class UserDAO {

//	ログインIDとパスワードを引数にID・ログインID・パスワードをUserDataBeansにセットしログイン時に使用
	public static UserDataBeans findLoginData(String loginId, String password) {

		Connection con = null;
		PreparedStatement pSt = null;

		try{
			con = DBManager.getConnection();

			pSt = con.prepareStatement("SELECT * FROM user WHERE login_id = ? AND password = ?");
			pSt.setString(1, loginId);
			pSt.setString(2, password);

			ResultSet rs = pSt.executeQuery();

			if(!rs.next()) {
				return null;
			}

			int id = rs.getInt("id");
			String loginIdData = rs.getString("login_id");
			String passwordData = rs.getString("password");

			return new UserDataBeans(id, loginIdData, passwordData);

		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}finally {
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
					return null;
				}

			}
		}
	}

//	ユーザ情報の新規登録
	public static void registerUser(UserDataBeans udb) throws SQLException {

//		int id, String loginId, String familyNmKainji, String firstNmKanji,String familyNmKana,
//		String firstNmKana, String nickname, String zipCode, Date birthDate, String mail, String password, Date createDate, Date updateDate,
//		String userImage, String comment

		Connection con = null;
		PreparedStatement pSt = null;

		try{
			con = DBManager.getConnection();

			pSt = con.prepareStatement("INSERT INTO user (login_id, "
										+ "family_name_kanji, "
										+ "first_name_kanji, "
										+ "family_name_kana, "
										+ "first_name_kana, "
										+ "nickname, "
										+ "zip_code, "
										+ "address, "
										+ "birth_date, "
										+ "mail_address, "
										+ "password, "
										+ "create_date, "
										+ "update_date, "
										+ "user_image, "
										+ "comment) "
										+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

			pSt.setString(1, udb.getLoginId());
			pSt.setString(2, udb.getFamilyNameKanji());
			pSt.setString(3, udb.getFirstNameKanji());
			pSt.setString(4, udb.getFamilyNameKana());
			pSt.setString(5, udb.getFirstNameKana());
			pSt.setString(6, udb.getNickname());
			pSt.setString(7, udb.getZipCode());
			pSt.setString(8, udb.getAddress());
			pSt.setString(9, udb.getBirthDate());
			pSt.setString(10, udb.getMailAddress());
			pSt.setString(11, udb.getPassword());
			pSt.setString(12, udb.getCreateDate());
			pSt.setString(13, udb.getUpdateDate());
			pSt.setString(14, udb.getUserImage());
			pSt.setString(15, udb.getComment());

			pSt.executeUpdate();

			pSt.close();

		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(con != null) {
				con.close();
			}
		}
	}

//	ユーザ情報の更新
	public static void updateUserInfo(UserDataBeans udb) throws SQLException {

		Connection con = null;
		PreparedStatement pSt = null;

		try{
			con = DBManager.getConnection();

			pSt = con.prepareStatement("UPDATE user SET family_name_kanji = ?, "
										+ "first_name_kanji = ?, "
										+ "family_name_kana = ?, "
										+ "first_name_kana = ?, "
										+ "zip_code = ?, "
										+ "address = ?, "
										+ "mail_address = ?, "
										+ "password = ?, "
										+ "update_date = ?, "
										+ "WHERE id = ?");

			pSt.setString(1, udb.getFamilyNameKanji());
			pSt.setString(2, udb.getFirstNameKanji());
			pSt.setString(3, udb.getFamilyNameKana());
			pSt.setString(4, udb.getFirstNameKana());
			pSt.setString(5, udb.getNickname());
			pSt.setString(6, udb.getZipCode());
			pSt.setString(7, udb.getAddress());
			pSt.setString(8, udb.getMailAddress());
			pSt.setString(9, udb.getPassword());
			pSt.setString(10, udb.getUpdateDate());
			pSt.setInt(11, udb.getId());

			pSt.executeUpdate();

			pSt.close();

		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(con != null) {
				con.close();
			}
		}
	}

//	ユーザプロフィールの更新
	public static void updateUserProfile(UserDataBeans udb) throws SQLException {

		Connection con = null;
		PreparedStatement pSt = null;

		try{
			con = DBManager.getConnection();

			pSt = con.prepareStatement("UPDATE user SET user_image = ?, "
										+ "nickname = ?, "
										+ "comment = ?, "
										+ "WHERE id = ?");

			pSt.setString(1, udb.getUserImage());
			pSt.setString(2, udb.getNickname());
			pSt.setString(3, udb.getComment());
			pSt.setInt(4, udb.getId());

			pSt.executeUpdate();

			pSt.close();

		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(con != null) {
				con.close();
			}
		}
	}

//	ログインIDの重複の確認　trueなら重複
	public static boolean isOverlapLoginId(String loginId, int userId) throws SQLException{

		boolean isOverlap = false;
		Connection con = null;
		PreparedStatement pSt = null;

		try {

			con = DBManager.getConnection();
			pSt = con.prepareStatement("SELECT login_id FROM user WHERE login_id = ? AND id != ?");
			pSt.setString(1, loginId);
			pSt.setInt(2, userId);
			ResultSet rs = pSt.executeQuery();

			if(rs.next()) {
				isOverlap = true;
			}

		}catch(SQLException e){
			throw new SQLException(e);
		}finally {
			if(con != null) {
				con.close();
			}
		}

		return isOverlap;
	}
}
