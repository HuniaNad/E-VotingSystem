
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hunia
 */
public class Checker {
    
//    public static void main(String[] args) {
//        System.out.println(isDate("11/11/2012"));
//    }
    
    
    //create connection with sql
    public Statement connectSQL(){
        Statement stmt = null;
        try{
          Connection mycon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
          stmt = mycon.createStatement();
      }   
      catch(Exception e){
          System.out.println(e.toString());
      }
        return stmt;
    }
    
    
    public boolean isName(String name){
        //any combination of letters and spaces
        String regex = "^[A-Za-z ]+$";
        return name.matches(regex) && name.length()>=3;
    }
    
    //method for checking password validity
    public boolean isPassword(String password) {
            int countDigit=0, countLetter=0;
            //characters are checked one by one using Character class
            for(int i=0; i<password.length(); i++) {
                    char passChar = password.charAt(i);
                    //password is combination of letters and digits. length should be greater than 7
                    if ((Character.isDigit(passChar) || Character.isAlphabetic(passChar))) {
                            //counting digits and letters
                            countDigit = (Character.isDigit(passChar))? countDigit+1:countDigit;
                            countLetter = (Character.isAlphabetic(passChar))? countLetter+1:countLetter;
                    }
            }
            //true is returned if there is atleast 1 digit and letter
            return countDigit>0 && countLetter>0  && password.length()>=7;
    }

    //method for checking email validity
    public boolean isEmail (String email) {
            //[A-Za-z0-9_.-]+ -> combination of "A-Z a-z 0-9 _.-" last + means any number of combinations
            //@ -> literal @ must be present
            //[A-Za-z]+ -> combination of "A-Z a-z", last + means any number of combinations
            // \\.{1} -> . appears only 1 time after [A-Za-z]+, \\ ensures that "." is considered literally otherwise it will have some other meaning
            //^ -> start, $ -> end
            String regex = "^[A-Za-z0-9_.-]+@[A-Za-z]+\\.{1}[A-Za-z]+$";
            boolean emailExists=false;
            String[] emails = {"gmail.com", "yahoo.com","ieee.org","outlook.com","hotmail.com"};
            for (int i=0; i<emails.length; i++) {
                    if (email.substring(email.indexOf("@")+1).equals(emails[i])) {
                            emailExists = true;
                            break;
                    }
            }
            return email.matches(regex) && emailExists;
    }

    //method for checking phone no. validity
    public boolean isPhone(String phone) {
            //any combination of 0-9 but of length 11
            String regex = "^[0-9]{11}$";
            return phone.matches(regex);
    }
    
    public boolean isCNIC(String cnic) {
            //any combination of 0-9 but of length 11
            String regex = "^[0-9]{5}-[0-9]{7}-[0-9]{1}$";
            return cnic.matches(regex);
    }
    
    public boolean isDate(String date){
        boolean isdate = false;
        //check length of date. if not equal, return false
        if (date.length()==10) {
            //each characetr is checked if they are required character or digit
            for(int i=0; i<date.length(); i++){
                switch(i){
                    case 0: case 1: case 3: case 4: case 6: case 7: case 8:
                    case 9:{
                        if(Character.isDigit(date.charAt(i))){
                            isdate = true;
                        }
                        else{
                            isdate = false;
                        }
          
                        break;
                    }
                    default:{
                        if(date.charAt(i)=='/'){
                                isdate = true;
                        }
                        else{
                                isdate = false;      
                        }
                    }      
                }
            }
            
            //is format is correct, leap year is validated.
            if(isdate){
                int day = Integer.parseInt(date.substring(0,2));
                int month = Integer.parseInt(date.substring(3, 5));
                int year = Integer.parseInt(date.substring(6));
                //day and month's range should be correct, else return false
                if ((day>=1 && day<=31) && (month>=1 && month<=12)){
                    boolean isLeap = false;

                    // if the year is divided by 4
                    if (year % 4 == 0) {
                      // if the year is century
                      if (year % 100 == 0) {
                        // if year is divided by 400
                        // then it is a isLeap year
                        if (year % 400 == 0)
                          isLeap = true;
                        else
                          isLeap = false;
                      }
                      // if the year is not century
                      else
                        isLeap = true;
                    }
                    else{
                        isLeap = false;
                    }
   
                    //if leap year, feb and day till 29, or not leap year, feb and day till 28
                    if((isLeap && month==2 && (day>=1 && day<=29)) || (!isLeap && month==2 && (day>=1 && day<=28))){
                        isdate = true;
                    }
                    //any other month
                    else if(month!=2){
                        isdate = true;
                    }
                    else{
                        isdate = false;
                    }    
                }
                else{
                    return false;
                }
                        
            }
            else{
                return false;
            } 
        }
        return isdate;
        
        
    }
   
    public String getDate(String date){
        String month = "";
        int day = Integer.parseInt(date.substring(0,2));        
        int year = Integer.parseInt(date.substring(6));
        int monthNo = Integer.parseInt(date.substring(3, 5));
        switch(monthNo){
            case 1: 
                month = "January";
                break;
            case 2: 
                month = "February";
                break;
            case 3: 
                month = "March";
                break;
            case 4: 
                month = "April";
                break;
            case 5: 
                month = "May";
                break;
            case 6: 
                month = "June";
                break;
            case 7: 
                month = "July";
                break;
            case 8: 
                month = "August";
                break;
            case 9: 
                month = "September";
                break;
            case 10: 
                month = "October";
                break;
            case 11: 
                month = "November";
                break;
            case 12: 
                month = "December";
                break;
        }
        
        return day+"/"+month+"/"+year;
    }
    
    public String findLoginCredentials(String email, String pwd){
        try{
            
            Statement stmt = connectSQL();
            ResultSet result = stmt.executeQuery("Select USER_ID from Person where email='"+email+"' AND password='"+pwd+"'");
            if(result.next()){
                return result.getString("USER_ID");
            }       
            
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return null;
    }
    
    public boolean validateFPwd(String id, String email, String cnic){
        try{
            
            Statement stmt = connectSQL();
            ResultSet result = stmt.executeQuery("Select * from Person where email='"+email+"' AND cnic='"+cnic+"' and user_id='"+id+"'");
            if(result.next()){
                return true;
            }       
            
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return false;
    }
    
    public boolean CNICRepeats(String cnic, String uid){
        try{
            Statement stmt = connectSQL();
            ResultSet result = null;
            if(uid == null){
                result = stmt.executeQuery("Select * from Person where cnic='"+cnic+"'");
            }
            else{
                result = stmt.executeQuery("Select * from Person where cnic='"+cnic+"' and not user_id='"+uid+"'");
            }
            if(result.next()){
                return true;
            }       
            
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return false;
    }
    
    public boolean VoterCNICRepeats(String cnic, String eid, ArrayList<ArrayList<String>> data){
        try{
            if(!data.isEmpty()){
                for(int i=0; i<data.size(); i++){
                    if(data.get(i).get(1).equalsIgnoreCase(cnic) && data.get(i).get(0).equalsIgnoreCase("voter")){
                        return true;
                    }   
                }
            }
            else{
                Statement stmt = connectSQL();
                ResultSet result = stmt.executeQuery("Select * from registrations where cnic='"+cnic+"' and election_id='"+eid+"'");
               
                if(result.next()){
                    return true;
                }       
            }  
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return false;
    }
    
    public boolean uIDRepeats(String uid){
        try{
            Statement stmt = connectSQL();
            ResultSet result = stmt.executeQuery("Select * from Person where user_id='"+uid+"'");

            if(result.next()){
                return true;
            }       
            
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return false;
    }
    
    public boolean utIDRepeats(String utid){
        try{
            Statement stmt = connectSQL();
            ResultSet result = stmt.executeQuery("Select * from Person where utype_id='"+utid+"'");

            if(result.next()){
                return true;
            }       
            
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return false;
    }
    
    public boolean voterIDRepeats(String voterid){
        try{
            Statement stmt = connectSQL();
            ResultSet result = stmt.executeQuery("Select * from voter where voter_id='"+voterid+"'");

            if(result.next()){
                return true;
            }       
            
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return false;
    }
    
    public boolean candIDRepeats(String candID){
        try{
            Statement stmt = connectSQL();
            ResultSet result = stmt.executeQuery("Select * from candidate where candidate_id='"+candID+"'");

            if(result.next()){
                return true;
            }       
            
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return false;
    }
    
    public boolean groupIDRepeats(String grpID){
        try{
            Statement stmt = connectSQL();
            ResultSet result = stmt.executeQuery("Select * from party_group where group_id='"+grpID+"'");

            if(result.next()){
                return true;
            }       
            
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return false;
    }
    
    public boolean catIDRepeats(String id){
        try{
            Statement stmt = connectSQL();
            ResultSet result = stmt.executeQuery("Select * from e_category where category_id='"+id+"'");

            if(result.next()){
                return true;
            }       
            
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return false;
    }
    
    public boolean custIDRepeats(String id){
        try{
            Statement stmt = connectSQL();
            ResultSet result = stmt.executeQuery("Select * from custom where custom_id='"+id+"'");

            if(result.next()){
                return true;
            }       
            
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return false;
    }
    
    public boolean refIDRepeats(String id){
        try{
            Statement stmt = connectSQL();
            ResultSet result = stmt.executeQuery("Select * from referendum where referendum_id='"+id+"'");

            if(result.next()){
                return true;
            }       
            
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return false;
    }
    
    public boolean orgIDRepeats(String id){
        try{
            Statement stmt = connectSQL();
            ResultSet result = stmt.executeQuery("Select * from organizations where organization_id='"+id+"'");

            if(result.next()){
                return true;
            }       
            
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return false;
    }
    
    public boolean governIDRepeats(String id){
        try{
            Statement stmt = connectSQL();
            ResultSet result = stmt.executeQuery("Select * from government where party_id='"+id+"'");

            if(result.next()){
                return true;
            }       
            
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return false;
    }
    
    public boolean electionIDRepeats(String id){
        try{
            Statement stmt = connectSQL();
            ResultSet result = stmt.executeQuery("Select * from election where election_id='"+id+"'");

            if(result.next()){
                return true;
            }       
            
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return false;
    }
    
    public boolean adminIDRepeats(String id){
        try{
            Statement stmt = connectSQL();
            ResultSet result = stmt.executeQuery("Select * from group_admin where admin_id='"+id+"'");

            if(result.next()){
                return true;
            }       
            
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return false;
    }
    
    public boolean adminRecordRepeats(String modID, String adminUID){
        try{
            Statement stmt = connectSQL();
            ResultSet result = stmt.executeQuery("Select * from addedgroupadminrecord where admin_uid='"+adminUID+"'and moderator_uid='"+modID+"'");

            if(result.next()){
                return true;
            }       
            
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return false;
    }
    
    public boolean candidateRecordRepeats(String modID, String canduid){
        try{
            Statement stmt = connectSQL();
            ResultSet result = stmt.executeQuery("Select * from addedcandidaterecord where candidate_uid='"+canduid+"'and moderator_uid='"+modID+"'");

            if(result.next()){
                return true;
            }       
            
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return false;
    }
    
}
