import java.util.Scanner;
class MDU
{
  Scanner sc= new Scanner(System.in);
  String UName;
  void get()
  {
    System.out.print("Enter University name:");
    UName=sc.nextLine();
  }
  void display()
  {
    System.out.println(UName);
  }
}
class SAITMG extends MDU
{
  String CName;
  String LName;
  void get1()
  {
    System.out.print("Enter College name:");
    CName=sc.nextLine();
    System.out.print("Enter Location:");
    LName=sc.nextLine();
  }
  void display1()
  {
    System.out.println(CName);
    System.out.println(LName);
  }
}
class SAITMD extends SAITMG
{
   String BLocation;
   void get2()
   {
     System.out.print("Enter Branch Location:");
     BLocation=sc.nextLine();
   }
   void display2()
   {
     System.out.println(BLocation);
   }
}
class main
{
  public static void main(String args[])
  {
     SAITMD obj=new SAITMD();
     obj.get();
     obj.get1();
     obj.get2();
     obj.display();
     obj.display1();
     obj.display2();
  }
}  