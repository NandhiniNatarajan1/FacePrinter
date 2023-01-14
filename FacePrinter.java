public class FacePrinter
{
  public void printFace(String hair, String eyes, String nose, String mouth)
  {
    // calls the methods that draw hair, eyes, nose, mouth
    printHair(hair);
    printEyes(eyes);
    printNose(nose);
    printMouth(mouth); 

  }
    //method that prints hair
  public void printHair(String type)
  {
    if (type.equalsIgnoreCase("straight")){
      System.out.println("||||||||");
    }
    
    else if (type.equalsIgnoreCase ("curly")){
      System.out.println("~~~~~~~~");
    }

    else if (type.equalsIgnoreCase ("wavy")){
      System.out.println("c~c~c~c~");
    }
    else{
      System.out.println("ERROR!");
    }



  }
    //method that prints eyes
  public void printEyes(String type)
  {
    if (type.equalsIgnoreCase("crazy")){
      System.out.println("@      @");
    }
    else if (type.equalsIgnoreCase("star")){
      System.out.println(" *    * ");
    }
    else if (type.equalsIgnoreCase("excited")){
      System.out.println(" !    ! ");
    }
    else{
      System.out.println("ERROR!");
    }
  }
    //method that prints nose
    public void printNose(String type)
  {
    if (type.equalsIgnoreCase("curved")){
      System.out.println("   }    ");
    }
    else if (type.equalsIgnoreCase("pointy")){
      System.out.println("   <>   ");
    }
    else if (type.equalsIgnoreCase("wide")){
      System.out.println(" (...)  ");
    }
    else{
      System.out.println("ERROR!");
    }
  }
    //method that prints mouth
  public void printMouth(String type)
  {
    if (type.equalsIgnoreCase("neutral")){
      System.out.println("________");
    }
    else if (type.equalsIgnoreCase("smiley")){
      System.out.println("|_______/");
    }
    else if (type.equalsIgnoreCase("weird")){
       int num[] = {32,32,32,222,32,32,32,32};
        String str =null;
        for(int i: num){
            str = Character.toString((char)i);      //to get a character that looks like a toungue
            System.out.print(str);
        }
      return;
    }
    else{
      System.out.println("ERROR!");
    }
  }
}