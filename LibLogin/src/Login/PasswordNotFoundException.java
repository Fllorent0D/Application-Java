package Login;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author florentcardoen
 */
public class PasswordNotFoundException extends Throwable{
    public String message;
    PasswordNotFoundException(String log) {
        message = log;
    }
    
}
