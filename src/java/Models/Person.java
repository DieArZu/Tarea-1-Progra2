/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Samuel
 */
public class Person {    
    public int Id;
    public String Name;
    public String LastName;
    public String Email;
    
    public Person(int _Id, String _Name, String _LastName, String _Email){
        Id = _Id;
        Name = _Name;
        LastName = _LastName;
        Email = _Email;        
    }
}
