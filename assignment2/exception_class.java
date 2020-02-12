class MyException extends Exception
{
   public string tostring()
   {
       return"Invalid marks";
       }
  }
 classDemo
 {
   public static void main(String args[])
   {
   int marks=105;
   try{
     if(x>1oo)
         throw new MyException();
         System.out.println("marks:"+marks);
         }
         catch(MYException e){
         System.out.print.ln(e);
         }
      }
    }
