/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exception2;

/**
 *
 * @author JJ_JoJo
 */
public class LAB6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            System.out.println(1/0);
        }
        catch(ArithmeticException e){
            //e.printStackTrace();
            //System.out.println(e.getMessage());
            //System.out.println(e.toString());
            
            StackTraceElement[] stackTraceElement = e.getStackTrace();
            for (int i=0; i<stackTraceElement.length; i++){
            
            System.out.println(stackTraceElement[i].getClassName());                       
            System.out.println(stackTraceElement[i].getMethodName());  
            System.out.println(stackTraceElement[i].getFileName());  
            System.out.println(stackTraceElement[i].getLineNumber());  
        }
    }
    } 
}
