public class person
{
   private String name;
   private String gender;
   private String zipCode;
   //constructs a person object
   public person (String name,String gender,String zipCode)
   {
      this.name = name;
      this.gender = gender;
      this.zipCode= zipCode;
   }
   //returns value in name
   public String GetName()
   {
      return name;
   }
   //returns value in gender
   public String GetGender()
   {
      return gender;
   }
   //returns value in zipcode
   public String GetZipCode()
   {
      return zipCode;
   }
}