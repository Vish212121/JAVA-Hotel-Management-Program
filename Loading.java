public class Loading extends Print
{
    void load()throws InterruptedException
    {

        {
            Loading o=new Loading();
            o.p("\f\n\n\n\n");
            o.p("\t\t\t                      o  �");
            o.p("\t\t\t                    o      o");
            o.p("\t\t\t                   o Loading o");
            o.p("\t\t\t                    o  10%  o");
            o.p("\t\t\t                      o  o ");
            Thread.sleep(300);
            {
                o.p("\f\n\n\n\n");
                o.p("\t\t\t                      o  o");
                o.p("\t\t\t                    o      o");
                o.p("\t\t\t                   o Loading �");
                o.p("\t\t\t                    o  30%  o");
                o.p("\t\t\t                      o  o ");
            }
            Thread.sleep(300);
            {
                o.p("\f\n\n\n\n");
                o.p("\t\t\t                      o  o");
                o.p("\t\t\t                    o      o");
                o.p("\t\t\t                   o Loading o");
                o.p("\t\t\t                    o  50%  o");
                o.p("\t\t\t                      o  �");
            }
            Thread.sleep(300);
            {
                o.p("\f\n\n\n\n");
                o.p("\t\t\t                      o  o");
                o.p("\t\t\t                    o      o");
                o.p("\t\t\t                   o Loading o");
                o.p("\t\t\t                    �  70%  o");
                o.p("\t\t\t                      o  o ");
            }
            Thread.sleep(300);
            {
                o.p("\f\n\n\n\n");
                o.p("\t\t\t                      �  o");
                o.p("\t\t\t                    o      o");
                o.p("\t\t\t                   o Loading o");
                o.p("\t\t\t                    o  90%  o");
                o.p("\t\t\t                      o  o ");
            }
            Thread.sleep(300);
            {
                o.p("\f\n\n\n\n");
                o.p("\t\t\t                      o  �");
                o.p("\t\t\t                    o      o");
                o.p("\t\t\t                   o Loading o");
                o.p("\t\t\t                    o  100% o");
                o.p("\t\t\t                      o  o ");
            }
            Thread.sleep(400);
            o.p("\f");
        }
    }

    void p(String x)
    {
        System.out.println(x);
    }   
}