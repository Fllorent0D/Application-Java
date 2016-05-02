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
abstract public class VerifyPasswordClassic extends Validate implements Verify {

    String login;
    String password;
   
    
    @Override
    String getCaracteresValide() {
        if(caracteresValide == null)
        {
            buildCaracteresValide();
        }
        return caracteresValide;
    }
    
    @Override
    public boolean isOk()
    {       
        return password.equals(findPassword(login));
    }
    public boolean verify(String l, String p) throws UnknownLoginPasswordException, InvalidLoginPasswordException, PasswordNotFoundException 
    {
        //System.out.println(l);
        //System.out.println(p);

        if(l.length() == 0 || p.length() == 0)
            throw new UnknownLoginPasswordException("Votre login ou votre mot de passe est manquant.");
        
        if(!isValid(l) || !isValid(p))
            throw new InvalidLoginPasswordException("Login ou mot de passe mal formé");

        login = l;
        password = p;
        
        if(!isOk())
            throw new PasswordNotFoundException("Mot de passe erroné");
        
        return true;
    }
    abstract String findPassword(String l);
    
    final void buildCaracteresValide()
    {
        caracteresValide = "abcdefghijklmnopqrstuvwxyz123456789";
    }
    VerifyPasswordClassic()
    {
        buildCaracteresValide();
    }

   
}
