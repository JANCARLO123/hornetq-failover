package org.jboss.as.quickstarts.mdb;

import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.Schedule;
import javax.ejb.Singleton;

@Singleton
@ConcurrencyManagement(ConcurrencyManagementType.BEAN)
public class MySingleton {
	
	@Schedule(hour="15", persistent=false)
	public void runJob() {
		System.err.println("Enter Timer...");
		try {
			Thread.sleep(10000L);
		} catch(InterruptedException ie) {
			// ignore
		}
		System.err.println("Finished work...");
	}
}
