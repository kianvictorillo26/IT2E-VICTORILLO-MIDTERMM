
package patient;

import java.util.Scanner;

public class Patient {
    public void addCustomer(){
        Scanner sc = new Scanner(System.in);
        config conf = new config();
        
        System.out.print("Patient First Name: ");
        String fname = sc.next();
        System.out.print("Patient last name : ");
        String lname = sc.next();
        System.out.print("Patient Date of Birth: ");
        String date_birth = sc.next();
        System.out.print("Patient contact number: ");
        String contact_number = sc.next();
         System.out.print("Patient address : ");
        String address = sc.next();

        String sql = "INSERT INTO tbl_patient (f_name, l_name, date_of_birth, contact_number, address) VALUES (?, ?, ?, ?,?)";


        conf.addRecord(sql, fname, lname, date_birth, contact_number, address);


    }
     
     private void viewCustomers() {
        String votersQuery = "SELECT * FROM tbl_patient";
        String[] votersHeaders = {"ID", "fname", "lname", "date_of_birth","contact_number","address "};
        String[] votersColumns = {"p_id", "f_name", "l_name", "date_of_birth", "contact_number", "address"};
        config conf = new config();
        conf.viewRecords(votersQuery, votersHeaders, votersColumns);
        
    }
     
     private void updateCustomer(){
         Scanner sc= new Scanner(System.in);
        System.out.print("Enter the ID to Update: ");
        int id = sc.nextInt();
            
        System.out.print("Patient First Name: ");
        String fname = sc.next();
        System.out.print("Patient last name : ");
        String lname = sc.next();
        System.out.print("Patient Date of Birth: ");
        String date_birth = sc.next();
        System.out.print("Patient contact number: ");
        String contact_number = sc.next();
         System.out.print("Patient address : ");
        String address = sc.next();
         
         String qry = "UPDATE tbl_patient SET f_name = ?, l_name = ?, date_of_birth = ?, contact_number = ?, address = ? WHERE p_id = ?";
         
         config conf = new config();
         conf.updateRecord(qry, fname, lname, date_birth, contact_number,address, id);
         
     }
     
     
     private void deleteCustomer(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter ID to delete: ");
         int id = sc.nextInt();
         
         String qry = "DELETE FROM tbl_patient WHERE p_id = ?";
         config conf = new config();
         conf.deleteRecord(qry, id);
         
     }
 
     
     

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("1. ADD");
        System.out.println("2. VIEW");
        System.out.println("3. UPDATE");
        System.out.println("4. DELETE");
        System.out.println("5. EXIT");
        
        
        System.out.print(" Enter action: ");
        int action = sc.nextInt();
          Patient test = new   Patient();
        switch(action){
            case 1:
                 test.addCustomer();
                 
                 break;
                 
                 
            case 2:
                test.viewCustomers();
                
                
            break;
            
            
            case 3:
                 test.viewCustomers();
                test.updateCustomer();
                
                
            break;
           
            case 4:
                  test.viewCustomers();
                test.deleteCustomer();
                
                break;
                
                
            
            
        }
    }
    
    
}
