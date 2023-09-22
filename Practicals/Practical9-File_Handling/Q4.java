import java.io.*;
import java.util.*;

public class Details
{
        public static void main(String args[])
        {
                Details D=new Details();
                D.writeIt();
        }

        void writeIt()
        {
                try
                {
                        Scanner input=new Scanner(System.in);
                        File file=new File("Details.txt");
                        FileWriter f= new FileWriter(file);
                        BufferedWriter b= new BufferedWriter(f);

                        int serialNo;
                        char grade;
                        String firstName;
                        float CGPA; 

                        System.out.print("Enter Friend Serial No.: "); 
                        serialNo=input.nextInt();
         
                        System.out.print("\nEnter NAME: "); 
                        firstName=input.nextLine(); 
                        firstName=input.nextLine(); 

                        System.out.print("\nEnter Grade: "); 
                        grade=input.next().charAt(0);
       
                        System.out.print("\nEnter CGPA: "); 
                        CGPA=input.nextFloat();        
       
                        System.out.println("\n\t   Record added Successfully!");    
        
                        b.write(serialNo+"_"+firstName+"_"+grade+"_"+CGPA);
                        b.newLine();
                        b.close();

                        String sr;
                        Scanner src=new Scanner(new File("Details.txt"));
                        while(src.hasNextLine())
                        {
                                sr=src.nextLine();
                                System.out.println(sr);
                        }
                        }catch(IOException e)
                        {
                                e.printStackTrace();
                        }
                }
        
}


