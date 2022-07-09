package com.dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.bean.Login;

@Repository
public class LoginDao {

	@Autowired
	SessionFactory sf;						// Do DI for SessionFactory with the help of LocalSessionFactoryBean
		
	public int signIn(Login login) {
		Session session = sf.openSession();
		Query<Login> qry = session.createQuery("select l from Login l where l.email=:email and l.password = :password");
		qry.setParameter("email", login.getEmail());
		qry.setParameter("password", login.getPassword());
		List<Login> list = qry.list();
		return list.size();
	}
	public int signUp(Login login) {
			try {
			Session session = sf.openSession();
			Transaction tran = session.getTransaction();
			tran.begin();
				session.save(login);
			tran.commit();
				return 1;
			}catch(Exception e) {
				System.out.println(e);
				return 0;
			}
	}
	
}
