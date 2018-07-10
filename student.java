public class student extends person
{
   private String id;
   private String major;
   //contructs student
   public student(String id,String major,String name,String gender,String zipCode)
   {
      super(name,gender,zipCode);
      
      this.id = id;
      this.major = major;
   }
   //returns value in id
   public String GetId()
   {
      return id;
   }
   //returns value in major
   public String GetMajor()
   {
      return major;
   }
}