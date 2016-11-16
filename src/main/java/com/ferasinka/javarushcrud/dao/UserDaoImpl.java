package com.ferasinka.javarushcrud.dao;

import com.ferasinka.javarushcrud.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addUser(User user) {
		Session session = this.sessionFactory.getCurrentSession();

		session.persist(user);
	}

	@Override
	public void updateUser(User user) {
		Session session = this.sessionFactory.getCurrentSession();

		session.update(user);
	}

	@Override
	public void removeUser(int id) {
		Session session = this.sessionFactory.getCurrentSession();

		User user = session.load(User.class, id);

		if (user != null) {
			session.delete(user);
		}
	}

	@Override
	public User getUserById(int id) {
		Session session = this.sessionFactory.getCurrentSession();

		return session.get(User.class, id);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<User> getUserByName(String name) {
		Session session = this.sessionFactory.getCurrentSession();

		return (List<User>) session.createQuery(String.format("FROM User WHERE name='%s'", name)).list();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<List<User>> listUsers() {
		Session session = this.sessionFactory.getCurrentSession();
		List<List<User>> pages = new ArrayList<>();

		for (int i = 0; ; i += 5) {
			List<User> page = session.createQuery("FROM User").setFirstResult(i).setMaxResults(5).list();

			if (page.isEmpty()) {
				break;
			}

			pages.add(page);
		}

		return pages;
	}
}
