package Login;


import java.util.HashMap;
import java.lang.String;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author florentcardoen
 */
public class VerifyPasswordClassicHash  extends VerifyPasswordClassic{
    HashMap<String, String> table = new HashMap<>();
    
    VerifyPasswordClassicHash()
    {
        table.put("cardoen", "admin");
        table.put("test", "123");
    }
    @Override
    String findPassword(String l) {
        System.out.println(table.get(l));
        return table.get(l);
    }
    
}
