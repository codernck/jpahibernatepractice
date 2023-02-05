package com.jpahib.learnbgnr.Hib54JPABasics;

import javax.persistence.Persistence;

import entity.Unit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    	// my-persistence-unit is persistence name we get from persistence.xml
    	var emf = Persistence.createEntityManagerFactory("my-persistence-unit");
    	var en = emf.createEntityManager();
    	
    	/*SKUItem sku1 = new SKUItem();
    	sku1.setName("Bread");*/
    	
    	
    	/*Item order = new Item();
    	order.setName("Grapes");*/
    	
    	/*Meca meca = new Meca();
    	meca.setName("butter");*/
    	
    	/*Event event = new Event();
    	event.setName("Coding");*/
    	
    	Unit unit = new Unit();
    	unit.setName("Metric");
    	
    	try {
			en.getTransaction().begin();
			
			//en.persist(sku1);
			//en.persist(order);
			//en.persist(meca);
			//en.persist(event);
			en.persist(unit);
			
			
			en.getTransaction().commit();
			en.close();
		} catch (Exception e) {
			en.getTransaction().rollback();
			en.close();
			e.printStackTrace();
		}
    }
}
