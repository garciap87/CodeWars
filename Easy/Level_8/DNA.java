/*
Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions"
for the development and functioning of living organisms.
In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". You have
function with one side of the DNA (string, except for Haskell); you need to get the other
complementary side. DNA strand is never empty or there is no DNA at all (again, except for Haskell).
 
DnaStrand.makeComplement("ATTGC") // return "TAACG"
 
DnaStrand.makeComplement("GTAT") // return "CATA"
*/

package Level_8;
import java.util.Scanner;

public class DNA
{
   static Scanner input = new Scanner(System.in);
  
   public static void main(String[] args)
   {
      System.out.print("Enter your string of DNA: ");
      System.out.println("The complement is " + makeComplement(input.nextLine()));
   }
  
   public static String makeComplement(String dna)
   {
      if(dna.isEmpty())
      {
         System.out.println("You entered a blank string try again");
         System.out.println("Enter your string of DNA");
         dna = input.nextLine();
       }
             
       char []charArray = dna.toCharArray();
   
       for(int i = 0; i <charArray.length; i++)
       {
    	   switch(charArray[i])
           {
    	   	 case 'A':
    	   		 charArray[i] = 'T';
    	   		 break;
    	   	 case 'T':
                charArray[i] = 'A';
                break;
    	   	 case 'C':
                charArray[i] = 'G';
                break;
    	   	 case 'G':
                charArray[i] = 'C';
                break;
    	   	 default:
                System.out.println("Bad DNA sequence");
                break;
             }     
        }
   
          return String.valueOf(charArray);
     }
}