package gss.hibernate.test;

import junit.framework.TestCase;

import java.text.SimpleDateFormat;
import java.sql.Timestamp;
import java.sql.Time;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.EntityTransaction;

import ghu.sailfish.springframework.model.LSC;
import ghu.sailfish.springframework.model.SwimTeam;
import ghu.sailfish.springframework.model.TestLSC;

public class EntityManagerTest extends TestCase {
	
	private EntityManager em;
	
	@SuppressWarnings("deprecation")
	@Override
	protected void setUp() throws Exception {
		em = Persistence.createEntityManagerFactory("sftest").createEntityManager();
	}
	
	@Override
	protected void tearDown() throws Exception {
		if (em != null) {
			em.close();
		}
	}
	
	public void testEM() throws Exception {
		EntityTransaction ets = em.getTransaction();
		/*
		Member m = new Member();
		m.setId(new Long(1));
		m.setName("Gary Hu");
		m.setEmail("ghu@test.com");
		m.setPhoneNumber("1234567889");
		
		ets.begin();
		em.persist(m);
		*/
		ets.begin();
		LSC lsc = new LSC();
		lsc.setLscName("NT");
		//Cat c = new Cat();
		//c.setId(new Long(1));
		//c.setName("Cat");
		//c.setSex("F");
		//em.persist(lsc);
		
		LSC l = em.find(LSC.class, lsc.getId());
		
		SwimTeam st = new SwimTeam();
		st.setTeamCode("LAC");
		st.setTeamName("Lakeside Aquatic Club");
		st.setLsc(l);
		
		
		
		em.persist(st);
		TestLSC testLsc = new TestLSC();
		testLsc.setLsc(l);
		//testLsc.setTime("1:32.32");
		
		SimpleDateFormat format = new SimpleDateFormat("mm:ss.SS");
		Time time = new Time(format.parse("1:32.24").getTime());
		//time.setNanos(24);
		//System.out.println("timestamp Noano seconds: "+time.getgetNanos());
		testLsc.setTime(time);
		em.persist(testLsc);
		ets.commit();
        TestLSC testLsc2 = (TestLSC) em.createQuery("from TestLSC").getSingleResult();
		
		System.out.println("the timestamp: "+testLsc2.getTime().toString());
		System.out.println("getTimeString - "+testLsc2.getTimeString());
	}
	
	
}
