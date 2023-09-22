import java.io.*;
import java.util.*;

public class ReadWrite
{
    public static void main(String args[])
    {
        ReadWrite R=new ReadWrite();
        R.writeIt();
    }

    void writeIt()
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            File file=new File("Invent.csv");
            FileWriter f= new FileWriter(file);
            BufferedWriter b= new BufferedWriter(f);
            String s;
            System.out.println("Enter the statement you wish to write in the file: ");
            s=sc.nextLine();
            b.write(s);
            b.close();
            Scanner src=new Scanner(new File("ReadWrite.txt"));
            String sr;

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


