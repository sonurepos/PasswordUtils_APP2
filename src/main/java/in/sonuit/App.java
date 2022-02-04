package in.sonuit;

import in.sonuit.security.service.PasswordService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PasswordService service= new PasswordService();
       String p= service.encode("sonu1.j");
        System.out.println(p);
        System.out.println(" Now decryptinh working");
        
       String q= service.decode("c29udTEuag==");
       System.out.println(q);
    }
}
