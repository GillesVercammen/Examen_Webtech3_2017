package edu.ap.register;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class RegisterApplication extends Application{

		@Override
		public synchronized Restlet createInboundRoot(){
			Router router = new Router(getContext());
			
			router.attach("/patientTabel", RegisterResources.class);
			
			return router;	    

	}
}
