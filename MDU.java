class MDU
{
  String a="Rohtak";
}
class SAITMG extends MDU
{
  String location="Gurugram";
  void display()
  {
     System.out.print(location);
  }
  public static void main(String args[])
  {
     SAITMG obj=new SAITMG();
     obj.display();
  }
}  