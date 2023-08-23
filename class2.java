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
  void get()
  {
    System.out.print("Enter College name:");
    CName=sc.nextLine();
    System.out.print("Enter Location:");
    LName=sc.nextLine();
  }
  void display()
  {
    System.out.println(CName);
    System.out.println(LName);
  }
}
class main
{
  public static void main(String args[])
  {
     SAITMG obj=new SAITMG();
     obj.get();
     obj.display();
  }
}  