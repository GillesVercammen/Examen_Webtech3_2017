package edu.ap.register;

import org.json.JSONObject;
import org.restlet.resource.ClientResource;

public class RegisterClient {

     public static void main(String[] args) {
           
             try {
            	ClientResource resource = new ClientResource("http://127.0.0.1:8181/patients/patientTabel");
            	
            	JSONObject jsonObject = new JSONObject();
            	jsonObject.put("tijdstip", "25/01/2017");
            	jsonObject.put("patientNaam", "john");
            	jsonObject.put("patientGeboorteDatum", "04/04/1992");
            	jsonObject.put("verpleegsterNaam", "maria dummydata");
            	jsonObject.put("patientDiagnose", "test dummydata");
            	System.out.println(jsonObject.toString());
            	resource.post(jsonObject.toString());
            	
            	JSONObject jsonObject2 = new JSONObject();
            	jsonObject2.put("datehour", "25/01/2017 14:00");
            	jsonObject2.put("name", "Gerry Berry");
            	jsonObject2.put("birthdate", "21/1/1995");
            	jsonObject2.put("nurse", "Sanne Panne");
            	jsonObject2.put("diagnose", "Gebroken arm.");
            	resource.post(jsonObject2.toString());

            }
            catch (Exception error) {
            	System.out.println(error.getMessage());
            }
        }
    }
