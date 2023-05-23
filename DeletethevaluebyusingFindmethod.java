package habibiprograms;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeletethevaluebyusingFindmethod {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityTransaction=entityManager.getTransaction();
		CreateTable createTable=entityManager.find(CreateTable.class,1);
		entityTransaction.begin();
		entityManager.remove(createTable);
		entityTransaction.commit();
		System.out.println("the data is deleted from the table");
	}
	
}
