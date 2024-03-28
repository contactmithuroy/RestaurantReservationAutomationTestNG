package utilities;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Utils {
	private String email;
    private String password;
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
  //getting user credentials from JSON.
    public void getUserCreds(int pos) throws IOException, ParseException {
        String fileName=".\\resources\\users.json";
        JSONParser jsonParser=new JSONParser();
        Object obj=jsonParser.parse(new FileReader(fileName));
        JSONArray jsonArray=(JSONArray) obj;
        JSONObject jsonObject=(JSONObject) jsonArray.get(pos);
        setEmail((String)jsonObject.get("email"));
        setPassword((String)jsonObject.get("password"));
    }
    
    // Registration new account 
    private String newEmail;
    private String newName;
    private String newPassword;
    private String newPhoneNumber;
    
    public String getNewEmail() {
        return newEmail;
    }

    public void setNewEmail(String newEmail) {
        this.newEmail = newEmail;
    }
    
    public String getNewName() {
        return newName;
    }
    public void setNewNamel(String setNewName) {
        this.newName = setNewName;
    }
    
    
    public String getNewPassword() {
        return newPassword;
    }
    public void setNewPassword(String newEmail) {
        this.newPassword = newEmail;
    }
    
    
    public String getNewPhoneNumber() {
        return newPhoneNumber;
    }
    
    public void setNewPhoneNumber(String newPhoneNumber) {
        this.newPhoneNumber = newPhoneNumber;
    }
    
    
    public void getUserRegistrationCreds(int pos) throws IOException, ParseException {
    	String fileName=".\\resources\\userRegistration.json";
        JSONParser jsonParser=new JSONParser();
        Object obj=jsonParser.parse(new FileReader(fileName));
        JSONArray jsonArray=(JSONArray) obj;
        JSONObject jsonObject=(JSONObject) jsonArray.get(pos);
        
        //setNewEmail((String)jsonObject.get("email"));
        setNewEmail((String)jsonObject.get("email"));
        setNewNamel((String)jsonObject.get("member_name"));
        
        
        setNewPassword((String)jsonObject.get("password"));
        setNewPhoneNumber((String)jsonObject.get("phone_number"));
        
    }
   
    
}
