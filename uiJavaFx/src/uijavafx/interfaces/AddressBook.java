/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uijavafx.interfaces;

import uijavafx.objects.Person;

/**
 *
 * @author seryozha
 */
public interface AddressBook {
    
    public void add(Person person);
    public void update(Person person);
    public void delete(Person person);
    public void fillData();
}
