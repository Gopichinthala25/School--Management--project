package pack2;

import java.util.Scanner;

public class LoginValidation 
{
	
    public static void main(String[] args) 
    {  
        String validUsername = "Gayathri";    
        String validPassword = "Ammulu@123";  

        
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        
        
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        
        try 
        {
        if (isValidLogin(username, password, validUsername, validPassword)) 
        {
            System.out.println("Login successful!");
        }
        else 
        {
            System.out.println("Invalid username or password. Please try again.");
        }
    }
        catch(Exception e)
        {
        	System.out.println("Login validation failed. Error: "+e.getMessage());//printing statement
        }
    }
    
    public static boolean isValidLogin(String username, String password, String validUsername, String validPassword) 
    {
        return username.equals(validUsername) && password.equals(validPassword); //exit the method early
    }
}