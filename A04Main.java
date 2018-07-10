public class A04Main
{
   public static void main(String[]args)
   {
       displayInfo();
   }
   public static void displayInfo()
   {
      student John = new student("211","CS","john","male","43035");
      System.out.println("ID number: "+John.GetId());
      System.out.println("Major: "+John.GetMajor());
      System.out.println("Name: "+John.GetName());
      System.out.println("Gender: "+John.GetGender());
      System.out.println("zip code: "+John.GetZipCode());
   }
}