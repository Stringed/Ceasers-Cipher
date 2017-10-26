

package ciphertext;

/**
 *
 * @author jim
 */
import java.util.Scanner;
public class CipherText {

    static String cipher="";
    String plaintext;
    int key;
    public  String encrypt (){
        
         
        Scanner x= new Scanner (System.in);
       plaintext=x.nextLine();
       key=x.nextInt(); 
        
        for (int i =0; i<plaintext.length(); i++){
           
            char a = plaintext.charAt(i); //char to hold characters of the plaintext
            if(Character.isLetter(a)){//check if its letter
                if(Character.isLowerCase(a)){ // if its letter check if its lower
                    char b =(char)(a+key); // add the key to the character
                    
                  if (b == 'z') // check if its z
                  {
                      
                 cipher += (char)( b- (26-key)); // if z toa ey from 26 then sub from athen add to cipher
                            }
                     
                  else {
                      cipher+=b;// aadd it to ciphertext
                  }
                  
                }
                 
                
                  if (Character.isUpperCase(a))
                      {
                         char b = (char)(a+key);
                         if ( a=='Z')
                         {
                             cipher +=(char)(a-(26-key));
                         }
                         else 
                         {
                             cipher+=(char)(a-(26-key));
                         }
                      } 
                  
                  
                }
                else // if not  letter eg $%@#
                {
                        cipher +=a; // add it to the cipher text
                        }
            }
        
        
        return cipher;
        
        
    }
    public static void main(String[] args) {
       
        CipherText jim = new CipherText();
        
        jim.encrypt();
        
        System.out.println(cipher);
    
    
    }
   
}
