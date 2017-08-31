package ghu.sailfish.springframework.dao.hibernate.impl;

import javax.persistence.PersistenceContext;
import javax.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import ghu.sailfish.springframework.dao.ILSCDao;
import ghu.sailfish.springframework.model.LSC;


@Repository
public class LSCDaoImpl implements ILSCDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public LSC findLscById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LSC findLscByName(String lscName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LSC findLscByCode(String lscCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LSC saveLsc(LSC lsc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteLsc(LSC lsc) {
		// TODO Auto-generated method stub
		
	}

}
