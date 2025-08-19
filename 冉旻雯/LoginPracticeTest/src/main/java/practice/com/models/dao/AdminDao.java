package practice.com.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import practice.com.models.entity.Admin;



@Repository
public interface AdminDao extends JpaRepository<Admin, Long> {
	// データを保存するinsert文のメソッド
	Admin save(Admin admin);
	
	//idを選択
	Admin findByAdminId(Long adminId);
	
	//emailを選択
	Admin findByEmail(String email);
	
	//email passwordを選択
	Admin findByEmailAndPassword(String email,String password);
}
