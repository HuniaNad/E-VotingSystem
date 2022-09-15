
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
public class IDGenerator {
    
    public String generateUID(){  
        String id=null;
        Checker check = new Checker();
        try{
            Statement stmt = check.connectSQL();
            ResultSet result = stmt.executeQuery("SELECT user_id FROM Person where user_id = (select max(user_id) from Person)");
            if(!result.next()){
                id="u-1";
                return id;
            }
            else{
                id = result.getString("USER_ID");
                long num = Long.parseLong(id.substring(2))+1;
                id = "u-"+num;
                while(check.uIDRepeats(id)){
                    num = Long.parseLong(id.substring(2))+1;
                    id = "u-"+num;   
                }
                
                System.out.println(id);
                return id; 
            }       
            
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return null;
    }
    
    public String generateUTypeID(){  
        String id=null;
        Checker check = new Checker();
        try{
            Statement stmt = check.connectSQL();
            ResultSet result = stmt.executeQuery("SELECT utype_id FROM Person where utype_id = (select max(utype_id) from Person)");
            result.next();
            if(result.getString("utype_id").equalsIgnoreCase("ut")){
                id="ut-1";
                return id;
            }
            else{
                id = result.getString("UTYPE_ID");
                long num = Long.parseLong(id.substring(3))+1;
                id = "ut-"+num;
                //checks if id already exists or not
                while(check.utIDRepeats(id)){
                    num = Long.parseLong(id.substring(3))+1;
                    id = "ut-"+num;   
                }
                return id; 
            }       
            
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return null;
    }
    
    public String generateVoterID(ArrayList<String> idArrayList){  
        String id=null;
        Checker check = new Checker();
        try{
            if(idArrayList==null){
                Statement stmt = check.connectSQL();
                ResultSet result = stmt.executeQuery("SELECT voter_ID FROM voter where voter_id = (select max(voter_id) from voter)");
                if(!result.next()){
                    id="voter-1";
                    return id;
                }
                else{
                    id = result.getString("voter_id");
                    long num = Long.parseLong(id.substring(6))+1;
                    id = "voter-"+num;
                    //checks if id already exists or not
                    while(check.voterIDRepeats(id)){
                        num = Long.parseLong(id.substring(6))+1;
                        id = "voter-"+num;   
                    }
                    return id; 
                }
            }
            else{
                if(idArrayList.isEmpty()){
                    Statement stmt = check.connectSQL();
                    ResultSet result = stmt.executeQuery("SELECT voter_ID FROM voter where voter_id = (select max(voter_id) from voter)");
                    if(!result.next()){
                        id="voter-1";
                        return id;
                    }
                    else{
                        id = result.getString("voter_id");
                        long num = Long.parseLong(id.substring(6))+1;
                        id = "voter-"+num;
                        while(check.voterIDRepeats(id) || idArrayList.contains(id)){
                            num = Long.parseLong(id.substring(6))+1;
                            id = "voter-"+num;   
                        }
                        return id;
                    }
                }
                else{
                    id = idArrayList.get(idArrayList.size()-1);
                    long num = Long.parseLong(id.substring(6))+1;
                    id = "voter-"+num;
                    //checks if id already exists or not
                    while(check.voterIDRepeats(id) || idArrayList.contains(id)){
                        num = Long.parseLong(id.substring(6))+1;
                        id = "voter-"+num;   
                    }
                    return id; 
                }
            }
            
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return null;
    }
    
    public String generateCandidateID(ArrayList<String> idArrayList){  
        String id=null;
        Checker check = new Checker();
        try{
            if(idArrayList.isEmpty()){
                Statement stmt = check.connectSQL();
                ResultSet result = stmt.executeQuery("SELECT candidate_ID FROM candidate where candidate_id = (select max(candidate_id) from candidate)");
                if(!result.next()){
                    id="cand-1";
                    return id;
                }
                else{
                    id = result.getString("candidate_id");
                    long num = Long.parseLong(id.substring(5))+1;
                    id = "cand-"+num;
                    //checks if id already exists or not
                    while(check.candIDRepeats(id) || idArrayList.contains(id)){
                        num = Long.parseLong(id.substring(5))+1;
                        id = "cand-"+num;   
                    }
                    return id;
                }
            }
            else{
                id = idArrayList.get(idArrayList.size()-1);
                long num = Long.parseLong(id.substring(5))+1;
                id = "cand-"+num;
                //checks if id already exists or not
                while(check.candIDRepeats(id) || idArrayList.contains(id)){
                    num = Long.parseLong(id.substring(5))+1;
                    id = "cand-"+num;   
                }
                return id; 
            }
            
            
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return null;
    }
    
    public String generateGroupID(ArrayList<String> idArrayList){  
        String id=null;
        Checker check = new Checker();
        try{
            if(idArrayList.isEmpty()){
                Statement stmt = check.connectSQL();
                ResultSet result = stmt.executeQuery("SELECT group_id FROM party_group where group_id = (select max(group_id) from party_group)");
                if(!result.next()){
                    id="grp-1";
                    return id;
                }
                else{
                    id = result.getString("group_id");
                    long num = Long.parseLong(id.substring(4))+1;
                    id = "grp-"+num;
                    //checks if id already exists or not
                    while(check.groupIDRepeats(id) || idArrayList.contains(id)){
                        num = Long.parseLong(id.substring(4))+1;
                        id = "grp-"+num;   
                    }
                    return id;
                }
            }
            else{
                id = idArrayList.get(idArrayList.size()-1);
                long num = Long.parseLong(id.substring(4))+1;
                id = "grp-"+num;
                //checks if id already exists or not
                while(check.groupIDRepeats(id) || idArrayList.contains(id)){
                    num = Long.parseLong(id.substring(4))+1;
                    id = "grp-"+num;   
                }
                return id; 
            }
            
            
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return null;
    }
    
    public String generateCatID(){  
        String id=null;
        Checker check = new Checker();
        try{
            Statement stmt = check.connectSQL();
            ResultSet result = stmt.executeQuery("SELECT category_id FROM e_category where category_id = (select max(category_id) from e_category)");
            if(!result.next()){
                id="cat-1";
                return id;
            }
            else{
                id = result.getString("category_id");
                long num = Long.parseLong(id.substring(4))+1;
                id = "cat-"+num;
                while(check.catIDRepeats(id)){
                    num = Long.parseLong(id.substring(4))+1;
                    id = "cat-"+num;   
                }
                return id; 
            }       
            
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return null;
    }
    
    public String generateCustID(){  
        String id=null;
        Checker check = new Checker();
        try{
            Statement stmt = check.connectSQL();
            ResultSet result = stmt.executeQuery("SELECT custom_id FROM custom where custom_id = (select max(custom_id) from custom)");
            if(!result.next()){
                id="cust-1";
                return id;
            }
            else{
                id = result.getString("custom_id");
                long num = Long.parseLong(id.substring(5))+1;
                id = "cust-"+num;
                while(check.custIDRepeats(id)){
                    num = Long.parseLong(id.substring(5))+1;
                    id = "cust-"+num;   
                }
                return id; 
            }       
            
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return null;
    }
    
    public String generateOrgID(){  
        String id=null;
        Checker check = new Checker();
        try{
            Statement stmt = check.connectSQL();
            ResultSet result = stmt.executeQuery("SELECT organization_id FROM organizations where organization_id = (select max(organization_id) from organizations)");
            if(!result.next()){
                id="org-1";
                return id;
            }
            else{
                id = result.getString("organization_id");
                long num = Long.parseLong(id.substring(4))+1;
                id = "org-"+num;
                while(check.orgIDRepeats(id)){
                    num = Long.parseLong(id.substring(4))+1;
                    id = "org-"+num;   
                }
                return id; 
            }       
            
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return null;
    }
    
    public String generateRefID(){  
        String id=null;
        Checker check = new Checker();
        try{
            Statement stmt = check.connectSQL();
            ResultSet result = stmt.executeQuery("SELECT referendum_id FROM referendum where referendum_id = (select max(referendum_id) from referendum)");
            if(!result.next()){
                id="ref-1";
                return id;
            }
            else{
                id = result.getString("referendum_id");
                long num = Long.parseLong(id.substring(4))+1;
                id = "ref-"+num;
                while(check.refIDRepeats(id)){
                    num = Long.parseLong(id.substring(4))+1;
                    id = "ref-"+num;   
                }
                return id; 
            }       
            
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return null;
    }
    
    public String generateGovernID(){  
        String id=null;
        Checker check = new Checker();
        try{
            Statement stmt = check.connectSQL();
            ResultSet result = stmt.executeQuery("SELECT party_id FROM government where party_id = (select max(party_id) from government)");
            if(!result.next()){
                id="gov-1";
                return id;
            }
            else{
                id = result.getString("party_id");
                long num = Long.parseLong(id.substring(4))+1;
                id = "gov-"+num;
                while(check.governIDRepeats(id)){
                    num = Long.parseLong(id.substring(4))+1;
                    id = "gov-"+num;   
                }
                return id; 
            }       
            
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return null;
    }

    public String generateElectionID(){  
        String id=null;
        Checker check = new Checker();
        try{
            Statement stmt = check.connectSQL();
            ResultSet result = stmt.executeQuery("SELECT election_id FROM election where election_id = (select max(election_id) from election)");
            if(!result.next()){
                id="e-1";
                return id;
            }
            else{
                id = result.getString("election_id");
                long num = Long.parseLong(id.substring(2))+1;
                id = "e-"+num;
                while(check.electionIDRepeats(id)){
                    num = Long.parseLong(id.substring(2))+1;
                    id = "e-"+num;   
                }
                return id; 
            }       
            
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return null;
    }

    public String generateAdminID(){  
        String id=null;
        Checker check = new Checker();
        try{
            Statement stmt = check.connectSQL();
            ResultSet result = stmt.executeQuery("SELECT admin_id FROM Group_Admin where admin_id = (select max(admin_id) from Group_Admin)");
            if(!result.next()){
                id="ad-1";
                return id;
            }
            else{
                id = result.getString("admin_id");
                long num = Long.parseLong(id.substring(3))+1;
                id = "ad-"+num;
                while(check.adminIDRepeats(id)){
                    num = Long.parseLong(id.substring(3))+1;
                    id = "ad-"+num;   
                }
                return id; 
            }       
            
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return null;
    }
    
    public String generateVoteID(){  
        String id=null;
        Checker check = new Checker();
        try{
            Statement stmt = check.connectSQL();
            ResultSet result = stmt.executeQuery("SELECT vote_id FROM Vote where vote_id = (select max(vote_id) from Vote)");
            if(!result.next()){
                id="v-1";
                return id;
            }
            else{
                id = result.getString("VOTE_ID");
                long num = Long.parseLong(id.substring(2))+1;
                id = "v-"+num;
                while(check.uIDRepeats(id)){
                    num = Long.parseLong(id.substring(2))+1;
                    id = "v-"+num;   
                }
                
                System.out.println(id);
                return id; 
            }       
            
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return null;
    }
    
    public String generateFeedbackID(){  
        String id=null;
        Checker check = new Checker();
        try{
            Statement stmt = check.connectSQL();
            ResultSet result = stmt.executeQuery("SELECT feedback_id FROM Feedbacks where feedback_id = (select max(feedback_id) from Feedbacks)");
            if(!result.next()){
                id="f-1";
                return id;
            }
            else{
                id = result.getString("FEEDBACK_ID");
                long num = Long.parseLong(id.substring(2))+1;
                id = "f-"+num;
                while(check.uIDRepeats(id)){
                    num = Long.parseLong(id.substring(2))+1;
                    id = "f"+num;   
                }
                
                System.out.println(id);
                return id; 
            }       
            
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return null;
    }
}

