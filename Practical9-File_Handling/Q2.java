import java.io.File;
public class Permissions{

       public static void main(String[] args)throws SecurityException {

        File file = new File("Invent.csv");

        if (file.exists()) {
            boolean val = file.setExecutable(true);
            System.out.println("set the owner's execute permission: "+ val);
        } else {
            System.out.println("File cannot exists: ");
        }

       if (file.exists()) {
            boolean val = file.setExecutable(true,false);
            System.out.println("set the everybody execute permission: "+ val);
        } else {
            System.out.println("File cannot exists: ");
        }
    }
}


