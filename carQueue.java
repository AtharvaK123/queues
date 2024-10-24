import java.io.*;
import java.util.*;

public class carQueue
{
    public carQueue()
    {
       Queue<carStack> q = new LinkedList<carStack>();
       Stack<carStack> stack = new Stack<carStack>();
       PriorityQueue<carStack> pq = new PriorityQueue<carStack>();

       File file = new File("carData.txt");

		try{
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String temp;
			while((temp=reader.readLine())!=null){
				String[] lines=temp.split("\t");

                carStack car = new carStack(lines[0], lines[1], lines[2], lines[3], lines[4], lines[5], lines[6], lines[7]);
                q.add(car);

			}
		}catch(Exception e){

		}

		stack = toStack(q);
		pq = toPQ(stack);

       while (!q.isEmpty())
       {

       }
   }

   public Stack toStack(Queue<carStack> q)
   {
	   Stack<carStack> stack = new Stack<carStack>();
		while(!q.isEmpty())
		{
			carStack c = q.poll();
			//System.out.print("PRINTING QUEUE: \n" + c.toString());
			stack.push(c);
		}

		return stack;
   }

   public PriorityQueue toPQ(Stack<carStack> s)
   {
	   PriorityQueue<carStack> pq = new PriorityQueue<carStack>();

		while(!s.isEmpty())
		{
			carStack c = s.pop();

			Stack<carStack> stack = new Stack<carStack>();
			stack.push(c);
			carStack stack2 = stack.pop();
			System.out.print("PRINTING STACK: \n" + stack2.toString());
		}

	   return pq;
   }

   public String printPQueue(Queue<carStack> q)
   {
	   return "";
   }

   public static void main(String args[])
   {
		carQueue app=new carQueue();
   }

}