/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uijavafx.interfaces.impl;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import uijavafx.interfaces.AddressBook;
import uijavafx.objects.Person;

/**
 *
 * @author seryozha
 */
public class CollectionAddressBook implements AddressBook{

    private ObservableList<Person> personList = FXCollections.observableArrayList();
    
    @Override
    public void add(Person person) {
       this.personList.add(person);
    }

    @Override
    public void update(Person person) {
        
    }

    @Override
    public void delete(Person person) {
         this.personList.remove(person);
    }
    
    public ObservableList<Person> getPersonList(){
        return this.personList;
    }
    
    @Override
    public void fillData(){
        this.add(new Person("AAA", "111"));
        this.add(new Person("BBB", "222"));
        this.add(new Person("CCC", "333"));
        this.add(new Person("DDD", "444"));
        this.add(new Person("EEE", "555"));
        this.add(new Person("FFF", "666"));
        this.add(new Person("GGG", "777"));
        this.add(new Person("HHH", "888"));
        this.add(new Person("VVV", "999"));
        this.add(new Person("QQQ", "000"));
    }
}
