import java.io.*;
import java.util.*;

public class carQueue
{
    public carQueue()
    {
       Queue<carStack> q = new LinkedList<carStack>();
       File file = new File("carData.txt");

		try{
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String temp;

			while((temp=reader.readLine())!=null){

				temp = temp.substring(2,temp.length()-2);
				String[] lines=temp.split("\\s+");

                carStack car = new carStack(lines[0], lines[1], lines[2], lines[3], lines[4], lines[5], lines[6], lines[7]);
                q.add(car);
			}
		}catch(Exception e){
		
		}


       while (!q.isEmpty())
       {
           
       }
   }

   public static void main(String args[])
   {
    carQueue app=new carQueue();

   }

}