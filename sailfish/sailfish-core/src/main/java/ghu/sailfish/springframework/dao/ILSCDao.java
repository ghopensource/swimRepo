package ghu.sailfish.springframework.dao;

import ghu.sailfish.springframework.model.LSC;
public interface ILSCDao {
	

	LSC findLscById(long id);
	LSC findLscByName(String lscName);
	LSC findLscByCode(String lscCode);
	
	LSC saveLsc(LSC lsc);
	void deleteLsc(LSC lsc);
	
}
