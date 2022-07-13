package Scripts;

import java.util.Arrays;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class ForeignPlayers {
	
	

	@Test
	public void TC() {
		
		String jsonData ="{\"player\":[{\"name\":\"Faf Du Plessis\",\"country\":\"South Africa\",\"role\":\"Batsman\",\"price-in-crores\":\"7\"},{\"name\":\"Virat Kohli\",\"country\":\"India\",\"role\":\"Batsman\",\"price-in-crores\":\"15\"},{\"name\":\"Glenn Maxwell\",\"country\":\"Australia\",\"role\":\"Batsman\",\"price-in-crores\":\"11\"},{\"name\":\"Mohammad Siraj\",\"country\":\"India\",\"role\":\"Bowler\",\"price-in-crores\":\"7\"},{\"name\":\"Harshal Patel\",\"country\":\"India\",\"role\":\"Bowler\",\"price-in-crores\":\"10.75\"},{\"name\":\"Wanindu Hasaranga\",\"country\":\"Srilanka\",\"role\":\"Bowler\",\"price-in-crores\":\"10.75\"},{\"name\":\"Dinesh Karthik\",\"country\":\"India\",\"role\":\"Wicket-keeper\",\"price-in-crores\":\"5.5\"},{\"name\":\"Shahbaz Ahmed\",\"country\":\"India\",\"role\":\"All-Rounder\",\"price-in-crores\":\"2.4\"},{\"name\":\"Rajat Patidar\",\"country\":\"India\",\"role\":\"Batsman\",\"price-in-crores\":\"0.20\"},{\"name\":\"Josh Hazlewood\",\"country\":\"Australia\",\"role\":\"Bowler\",\"price-in-crores\":\"7.75\"},{\"name\":\"Mahipal Lomror\",\"country\":\"India\",\"role\":\"Bowler\",\"price-in-crores\":\"7.75\"}]}";
	
	JSONObject json = new JSONObject(jsonData);
	
	JSONArray jsonArray = json.getJSONArray("player");
	
		String[] myarray = new String[jsonArray.length()];
	
			for(int i=0; i < jsonArray.length(); i++ ) {
				
				//System.out.println(jsonArray.getJSONObject(i).get("country").equals("India"));
				//System.out.println(jsonArray.getJSONObject(i).get("role").equals("Wicket-keeper"));
				
				//System.out.println(jsonArray.getJSONObject(i).get("role"));
				
				if(jsonArray.getJSONObject(i).get("country").equals("India")) {
					//String newval = (String) jsonArray.getJSONObject(i).get("name");
					//smyarray[i] = (String) jsonArray.getJSONObject(i).get("country");
				System.out.println(jsonArray.getJSONObject(i).get("name") +" - " +"Indian Player");
					/*for(int j=0; j < myarray.length; j++) {
						if(myarray[j] != "null") {
							String indarr = myarray[j];
							
						}
					}*/
					
				}
				else {
					System.out.println(jsonArray.getJSONObject(i).get("name") +" - " +"Foreign Player");
				}
			}
	}
}
