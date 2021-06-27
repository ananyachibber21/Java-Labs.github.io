import java.io.File;

public class CheckExistence
{
   public static void main(String[] args) 
   {
      File file = new File("Invent.csv");
      System.out.println(file.exists());
   }
}
