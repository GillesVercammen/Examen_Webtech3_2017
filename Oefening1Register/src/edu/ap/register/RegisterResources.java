package edu.ap.register;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.json.JSONObject;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

public class RegisterResources {

		@Get
		public String retVal() {

			return "";
		}
		
		@Post("txt")
		public void Registratie(String json){
			
			
			JSONObject Registratie = new JSONObject(json);
			String tijdstip = Registratie.getString("tijdstip");
			String patientDiagnose = Registratie.getString("patientDiagnose");
			String verpleegsterNaam = Registratie.getString("verpleegsterNaam");
		    String patientNaam = Registratie.getString("patientNaam");
		    String patientGeboorteDatum = Registratie.getString("patientGeboorteDatum");
		    

		    try( FileWriter filewriter = new FileWriter("filename.txt", true);
		    	BufferedWriter writer = new BufferedWriter(filewriter);
		    	PrintWriter out = new PrintWriter( writer )  ){
		        out.println("{");
		        out.println("Registratie:");
		    	out.println( "tijdstip" + tijdstip );
		    	out.println( "verpleegsterNaam: " + verpleegsterNaam );
		        out.println( "patientNaam: " + patientNaam );
		        out.println( "patientDiagnose: " + patientDiagnose );
		        out.println( "patientGeboorteDatum: " + patientGeboorteDatum );
		        out.println("}");
		        out.println();
		    } catch (FileNotFoundException error) {
		    	error.printStackTrace();
			} 
		}
	}
