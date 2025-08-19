package practice.com.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import practice.com.models.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
	// データを保存するinsert文のメソッド
	User save(User user);

	// SELECT * FROM admin WHERE admin_email = ?
	User findByUserEmail(String userEmail);

	// SELECT * FROM admin WHERE admin_id = ?
	User findByUserId(Long userId);

	// SELECT * FROM admin WHERE admin_email = ? AND password=?
	User findByUserEmailAndPassword(String userEmail, String password);
}
