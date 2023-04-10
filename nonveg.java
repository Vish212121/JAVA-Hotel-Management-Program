import java.io.*;
public class nonveg extends dessert
{
    static int amtnvp;    
    static int nv;
    static int quannvp;
    static int nvv;
    static int nvp[]=new int[10];
    static int nvpq[]=new int[10];
    int pricenvp[]={305,345,305,345,335,365,395,425,450,485,450,495,570,600,570,600,580,610,599,625};
    String menunvp[]={"Kheema Do Pyaza Medium        ","Kheema Do Pyaza Large         ","Chicken Sausage Medium        ","Chicken Sausage Large         ","Pepper Barbecue Chicken Medium","Pepper Barbecue Chicken Large ","Pepper Barbecue N Onion Medium","Pepper Barbecue N Onion Large ","Chicken Fiesta Medium         ","Chicken Fiesta Large          ","Chicken Golden Delight Medium ","Chicken Golden Delight Large  ","Chicken Butter Masala Medium  ","Chicken Butter Masala Large   ","Indi Chicken Tikka Medium     ","Indi Chicken Tikka Large      ","Chicken Dominator Medium      ","Chicken Dominator Large       ","Chicken Pepperoni Medium      ","Chicken Pepperoni Large       "};
    void Nonveg()throws IOException, InterruptedException 
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        nonveg o=new nonveg();
        int price[]={};
        o.load();
        o.fp("\t\t\t\tWelcome to NonVeg Pizza Corner.\n");
        o.fp("The Menu is as following");
        o.fp("_________________________________________________________________________________");
        o.fp("\tMenu\t\t\t\t\tPrices");
        o.sp("\t1.Kheema Do Pyaza Medium\t\tRs.305/-");
        o.sp("\t2.Kheema Do Pyaza Large\t\t\tRs.345/-");
        o.sp("\t3.Chicken Sausage Medium\t\tRs.305/-");
        o.sp("\t4.Chicken Sausage Large\t\t\tRs.345/-");
        o.sp("\t5.Pepper Barbecue Chicken Medium\tRs.335/-");
        o.sp("\t6.Pepper Barbecue Chicken Large\t\tRs.365/-");
        o.sp("\t7.Pepper Barbecue N Onion Medium\tRs.395/-");
        o.sp("\t8.Pepper Barbecue N Onion Large\t\tRs.425/-");
        o.sp("\t9.Chicken Fiesta Medium\t\t\tRs.450/-");
        o.sp("\t10.Chicken Fiesta Large\t\t\tRs.485/-");
        o.sp("\t11.Chicken Golden Delight Medium\tRs.450/-");
        o.sp("\t12.Chicken Golden Delight Large\t\tRs.495/-");
        o.sp("\t13.Chicken Butter Masala Medium\t\tRs.570/-");
        o.sp("\t14.Chicken Butter Masala Large\t\tRs.600/-");
        o.sp("\t15.Indi Chicken Tikka Medium\t\tRs.570/-");
        o.sp("\t16.Indi Chicken Tikka Large\t\tRs.600/-");
        o.sp("\t17.Chicken Dominator Medium\t\tRs.580/-");
        o.sp("\t18.Chicken Dominator Large\t\tRs.610/-");
        o.sp("\t19.Chicken Pepperoni Medium\t\tRs.599/-");
        o.sp("\t20.Chicken Pepperoni Large\t\tRs.625/-");
        o.fp("Enter how many types of Non veg pizza would you like to order.");
        nvv=Integer.parseInt(in.readLine());
        for(int i=0;i<nvv;i++)
        {
            o.fp("Enter the Serial Number of the Pizza you want to order.");
            int d=Integer.parseInt(in.readLine());
            if(d<=20)
            {
                nv=d;
            }
            else
            {
                System.out.println("Enter a valid choice.");
                nv=Integer.parseInt(in.readLine());
            }
            nvp[i]=nv-1;
            o.fp("Enter the Quantity of "+menunvp[nvp[i]]);
            quannvp=Integer.parseInt(in.readLine());
            nvpq[i]=quannvp;
            amtnvp=amtnvp+pricenvp[nvp[i]]*quannvp;
        }
        o.fp("Thank you for ordering.");
        o.fp("Hope you enjoy your Pizza.");
        Thread.sleep(1000);
        o.f("\f");
        o.load();
        o.fp("Press enter to Continue");
        String a=in.readLine();
        CONTROL p=new CONTROL();
        p.start();
    }
}