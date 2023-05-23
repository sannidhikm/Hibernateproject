package habibiprograms;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class DeleteAllthevaluesFromtheTable {
	public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager()	;
	EntityTransaction entityTransaction=entityManager.getTransaction();
	Query query=entityManager.createQuery("delete from Student");
	entityTransaction.begin();
	query.executeUpdate();
	entityTransaction.commit();
	System.out.println("All values are deleted from the table");
}
}









