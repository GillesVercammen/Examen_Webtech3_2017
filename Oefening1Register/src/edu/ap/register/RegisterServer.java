package edu.ap.register;

import org.restlet.*;
import org.restlet.data.Protocol;

public class RegisterServer {
	
		public static void main(String[] args) {
			
			try {
			    Component component = new Component();
		
			    component.getServers().add(Protocol.HTTP, 8181);
		
			    component.getDefaultHost().attach("/patients", new RegisterApplication());
				component.start();
			} 
		    catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
