/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package name_generator.interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexander
 */

public interface iNameGen {
    List<String> names = new ArrayList();
    List<String> lastNames = new ArrayList();
    
    void setNames();
    void setLastNames();
    
    String genName();
    String genLastName();
    int getNameCount();
    int getLastNameCount();
}
