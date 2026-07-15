package com.adse2509.sess04_classes_object_and_methods;

/**
 *
 * @author Administrator
 */
public class Person
{
     //=========================================================
    // INSTANCE FIELDS
    //=========================================================
    
    /**
     * The person's full name as a {@code string}
     */
    protected String name;
    
    /**
     * The person's binary gender "Male": 'M'/'m'  or "Female":'F'/'f' as a {@code char}
     */
    protected char gender; //want 'M' or 'F'
    
    /**
     * The person's age as a {@code String} to save memory, since human age
     * is typically 0 to about 120 years.
     */
    protected byte age;
    
    //=========================================================
    //CONSTRUCTORS
    //=========================================================
    public Person()
    {
        this.name = "";
        this.gender = 'M';
        this.age =(byte) 0;
    }
    
    /**
     * Parameterised constructor to initialise a {@code Person} object to
     * the values passed in as parameters.
     * 
     * @param name the person's full name
     * @param gender the person's binary gender
     * @param age the person's age
     */
    
    public Person(String name, char gender, byte age)
    {
        this.name=name;
        this.gender=gender;
        this.age=age;
        
    }
    
    //=========================================================
    //GETTERS & SETTERS
    //=========================================================

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * @return the gender
     */
    public char getGender()
    {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(char gender)
    {
        this.gender = gender;
    }

    /**
     * @return the age
     */
    public byte getAge()
    {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(byte age)
    {
        this.age = age;
    }
    
}
