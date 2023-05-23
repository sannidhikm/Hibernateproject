package habibiprograms;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TogetconnectionusingEntityManagerFactory {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		System.out.println("connection is establish now");
	}
}
