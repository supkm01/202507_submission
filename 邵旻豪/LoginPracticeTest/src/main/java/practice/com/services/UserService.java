package practice.com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import practice.com.models.dao.UserDao;
import practice.com.models.entity.User;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;

	// > **テーブルの中に同じメールアドレスが存在している場合には、保存処理は行わず**、
	public boolean createUser(String adminName, String email, String password, String studentPassword) {

		if (userDao.findByUserEmail(email) == null && password.equals(studentPassword)) {
			// 登録処理// save()
			userDao.save(new User(adminName, email, password));
			return true;
		} else if (password.equals(studentPassword) == false) {
			return false;
		} else {
			return false;
		}
	}

	public boolean loginCheck(String email, String password) {
		if (userDao.findByUserEmailAndPassword(email, password) == null)
			return true;
		else
			return false;
	}
}
