/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filterdesignpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus PC
 */
public class CritariaSingle implements Critaria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();
        
        for (Person person : persons) {
            if ("Single".equals(person.getMaritalStatus())){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
    
    

}
