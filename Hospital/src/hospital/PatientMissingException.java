/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author Floca
 */
public class PatientMissingException extends Exception{
    public PatientMissingException(String s)
    {
        super(s);
    }
    
}
