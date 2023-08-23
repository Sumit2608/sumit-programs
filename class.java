import java.util.Scanner;
class MDU
{
  Scanner sc= new Scanner(System.in);
  void get()
  {
    System.out.print("Enter University name:");
    String UName=sc.nextLine();
  }
}
class SAITMG extends MDU
{
  
  void get1()
  {
    System.out.print("Enter College name:");
    String CName=sc.nextLine();
    System.out.print("Enter Location:");
    String UName=sc.nextLine();
  }
}
class main
{
  public static void main(String args[])
  {
     SAITMG obj=new SAITMG();
     obj.get();
     obj.get1();
  }
}  