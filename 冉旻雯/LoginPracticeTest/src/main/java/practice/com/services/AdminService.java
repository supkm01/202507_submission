package practice.com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import practice.com.models.dao.AdminDao;
import practice.com.models.entity.Admin;


@Service
public class AdminService {
	@Autowired
	private AdminDao adminDao;

	
	// ログインチェック用のメソッド メソッド名「loginCheck」
	// もし、「emailとpasswordの組み合わせ」が存在していない場合、falseを返す
	// そうでない場合、trueを返す
	public boolean loginCheck(String email, String password) {
		if (adminDao.findByEmailAndPassword(email, password) == null) {
			return false;
		} else {
			return true;
		}
	}
		
	public boolean createAdmin( String adminName, String email, String password) {
		if (adminDao.findByEmail(email) != null) {
				return false;
			}
		else {
				adminDao.save(new Admin(adminName, email, password));
				return true;
			}
		}	
	
		
	

}
