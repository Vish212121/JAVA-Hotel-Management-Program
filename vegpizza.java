import java.io.*;
public class vegpizza extends nonveg
{
    static int amtvp;    
    static int vp;
    static int quanvp;
    static int vpp;
    static int veg[]=new int[10];
    static int vegq[]=new int[10];
    int pricevp[]={110,139,129,149,249,269,139,149,199,229,305,355,305,355,305,355,395,425,395,425,395,425,450,475,475};
    String menuvp[]={"Hand-Tossed Medium            ","Hand-Tossed Large             ","Thin N Crispy Medium          ","Thin N Crispy Large           ","Pepperoni Lover's Pizza Medium","Pepperoni Lover's Pizza Large ","Cheese Burst Pizza Medium     ","Cheese Burst Pizza Large      ","Margherita Medium             ","Margherita Large              ","Achari Do Pyaza Medium        ","Achari Do Pyaza Large         ","Cheese N Tomato Medium        ","Cheese N Tomato Large         ","Cheese N Corn Medium          ","Cheese N Corn Large          ","Paneer Makhani Medium         ","Paneer Makhani Large          ","Mexican Green Wave Medium     ","Mexican Green Wave Large      ","Deluxe Veggie Medium          ","Deluxe Veggie Large           ","Indi Tandoori Paneer Medium   ","Indi Tandoori Paneer Large    ","Farm House             [Large]"};    
    void VegPizza()throws IOException, InterruptedException 
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        vegpizza o=new vegpizza();
        int price[]={};
        o.load();        
        o.fp("\t\t\t\tWelcome to Veg Pizza corner.\n");
        o.fp("The Menu is as following");
        o.fp("_________________________________________________________________________________");
        o.fp("\tMenu\t\t\t\t\tPrices");
        o.sp("\t1.Hand-Tossed Medium\t\t\tRs.110/-");
        o.sp("\t2.Hand-Tossed Large\t\t\tRs.139/-");
        o.sp("\t3.Thin N Crispy Medium\t\t\tRs.129/-");
        o.sp("\t4.Thin N Crispy Large\t\t\tRs.149/-");
        o.sp("\t5.Pepperoni Lover's Pizza Medium\tRs.249/-");
        o.sp("\t6.Pepperoni Lover's Pizza Large\t\tRs.269/-");
        o.sp("\t7.Cheese Burst Pizza Medium\t\tRs.139/-");
        o.sp("\t8.Cheese Burst Pizza Large\t\tRs.149/-");
        o.sp("\t9.Margherita Medium\t\t\tRs.199/-");
        o.sp("\t10.Margherita Large\t\t\tRs.229/-");
        o.sp("\t11.Achari Do Pyaza Medium\t\tRs.305/-");
        o.sp("\t12.Achari Do Pyaza Large\t\tRs.355/-");
        o.sp("\t13.Cheese N Tomato Medium\t\tRs.305/-");
        o.sp("\t14.Cheese N Tomato Large\t\tRs.355/-");
        o.sp("\t15.Cheese N Corn Medium\t\t\tRs.305/-");
        o.sp("\t16.Cheese N Corn Large\t\t\tRs.355/-");
        o.sp("\t17.Paneer Makhani Medium\t\tRs.395/-");
        o.sp("\t18.Paneer Makhani Large\t\t\tRs.425/-");
        o.sp("\t19.Mexican Green Wave Medium\t\tRs.395/-");
        o.sp("\t20.Mexican Green Wave Large\t\tRs.425/-");
        o.sp("\t21.Deluxe Veggie Medium\t\t\tRs.395/-");
        o.sp("\t22.Deluxe Veggie Large\t\t\tRs.425/-");
        o.sp("\t23.Indi Tandoori Paneer Medium\t\tRs.450/-");
        o.sp("\t24.Indi Tandoori Paneer Large\t\tRs.475");
        o.sp("\t25.Farm House [Large]\t\t\tRs.475");
        o.fp("Enter how many types of veg pizza would you like to order.");
        vpp=Integer.parseInt(in.readLine());
        for(int i=0;i<vpp;i++)
        {
            o.fp("Enter the Serial Number of the Pizza you want to order.");
            int c=Integer.parseInt(in.readLine());
            if(c<=25)
            {
                vp=c;
            }
            else
            {
                System.out.println("Enter a valid choice.");
                vp=Integer.parseInt(in.readLine());
            }
            veg[i]=vp-1;
            o.fp("Enter the Quantity of "+menuvp[veg[i]]);
            quanvp=Integer.parseInt(in.readLine());
            vegq[i]=quanvp;
            amtvp=amtvp+pricevp[veg[i]]*quanvp;
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