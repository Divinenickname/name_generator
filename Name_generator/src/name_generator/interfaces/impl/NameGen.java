/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package name_generator.interfaces.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import name_generator.interfaces.iNameGen;

/**
 *
 * @author Alexander
 */
public class NameGen implements iNameGen {

    @Override
    public void setNames() {
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader(".\\resources\\files\\names.ini"));
            String str;
            while((str=br.readLine())!= null){
                names.add(str);
            }
            } catch (IOException ex) {
            Logger.getLogger(NameGen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void setLastNames() {
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader(".\\resources\\files\\lastNames.ini"));
            String str;
            while((str=br.readLine())!= null){
                lastNames.add(str);
            }
            } catch (IOException ex) {
            Logger.getLogger(NameGen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @Override
    public String genName() {
        String name = "";
        int a = 0;
        int b = names.size();
        
        int rnd = a + (int) (Math.random() * b);
        name = names.get(rnd);
        
        return name;
    }

    @Override
    public String genLastName() {
        String lastName = "";
        int a = 0;
        int b = lastNames.size();
        
        int rnd = a + (int) (Math.random() * b);
        lastName = lastNames.get(rnd);
        
        return lastName;
    }

    @Override
    public int getNameCount() {
        int i=0;
        i = names.size();      
        return i;
    }

    @Override
    public int getLastNameCount() {
        int i=0;
        i = lastNames.size();      
        return i;
    }
}