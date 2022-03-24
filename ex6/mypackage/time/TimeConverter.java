package mypackage.time;
public class TimeConverter
{
  public float ctime;
    public TimeConverter(float time,int choice)
   {
    if(choice==1)
      H_M(time);
    else if(choice==2)
      M_S(time);
     else if(choice==3)
       M_H(time);
     else
        S_M(time);
   }
    void H_M(float time)
    {
     ctime=time*60;
    }
   void M_S(float time)
    {
     ctime=time*60;
    }
    void M_H(float time)
    {
     ctime=time/60;
    }
    void S_M(float time)
    {
     ctime=time/60;
    }
}
