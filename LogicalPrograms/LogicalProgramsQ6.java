package LogicalPrograms;

import java.util.Scanner;
public class LogicalProgramsQ6 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int Startbutton;
        int Stopbutton;
        int flag=0;
        long startvalue = 0,endvalue = 0;

        System.out.print("Press 1 to start the Stop watch : ");
        Startbutton=s.nextInt();
        if(Startbutton==1)
        {
            System.out.println("Stop watch Starting!!");
            startvalue=starting();
        }
        else
        {
            System.out.println("Invalid input!");
            flag=1;
        }
        System.out.print("Press 0 to stop the Stop watch : ");
        Stopbutton=s.nextInt();
        if(Stopbutton==0)
        {
            endvalue=ending();
            System.out.println("Stop watch Ended!!");

        }
        else
        {
            System.out.println("Invalid input!");
            flag=1;

        }
        if(flag==0)
        {
            long elapsed_time = endvalue - startvalue;
            float inseconds = (float) (elapsed_time * 0.001);
            System.out.println("Elapsed Time: " + inseconds + " seconds");
        }
    }

    public static long starting()
    {
        long start=System.currentTimeMillis();
        return start;
    }

    public static long ending()
    {
        long end=System.currentTimeMillis();
        return end;
    }
}