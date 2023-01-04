
/**
 * Write a description of class LifeInsurancePolicy here.
 *
 * @author Umasathvik Pantham
 * @version 03/20/2021
 */
public class LifeInsurancePolicy
{
    // instance variables
    private Person person;
    private boolean crime;
    
    /**
     * Constructor for objects of class LifeInsurancePolicy
     * 
     * @param person the object to store the details of the person in
     * @param crime the variable to store whether the crime is low or high
     */
    public LifeInsurancePolicy(Person person, boolean crime)
    {
        this.person = person;
        this.crime = crime;
    }

    /**
     * Gets the age of the insured person
     *
     * @return the age of the insured person
     */
    public int policyHolderAge()
    {
        return person.getAge();
    }
    
    /**
     * Gets the gender of the insured person
     *
     * @return the gender of the insured person
     */
    public String policyHolderGender() 
    {
        return String.valueOf(person.getGender());
    }
    
    /**
     * Increments the age of the insured person.
     *
     */
    public void incrementAge()
    {
        person.birthday();
    }
    
    /**
     * Calculates the yearly premium for the insured person
     *
     * @return the age plus one year of the insured person
     */
    public double premium()
    {
        if (policyHolderGender().equals("m"))
        {
            if (crime == true)
            {
                if (policyHolderAge() < 21)
                {
                    return 20 * policyHolderAge() + (20 * policyHolderAge()) * 0.1;
                }
                
                else if (policyHolderAge() >= 21 && policyHolderAge() < 60)
                {
                    return 50 * policyHolderAge() + (50 * policyHolderAge()) * 0.1;
                }
                
                else if (policyHolderAge() >= 60 && policyHolderAge() < 80)
                {
                    return 110 * policyHolderAge() + (110 * policyHolderAge()) * 0.1;
                }
                
                else
                {
                    return -1;
                }
            }   
            
            else
            {
                if (policyHolderAge() < 21)
                {
                    return 20 * policyHolderAge();
                }
                
                else if (policyHolderAge() > 21 && policyHolderAge() < 60)
                {
                    return 50 * policyHolderAge();
                }
                
                else if (policyHolderAge() >= 60 && policyHolderAge() < 80)
                {
                    return 110 * policyHolderAge();
                }
                
                else
                {
                    return -1;
                }
            }
        }
        
        else
        {
            if (crime == true)
            {
                if (policyHolderAge() < 21)
                {
                    return 18.5 * policyHolderAge() + (18.5 * policyHolderAge()) * 0.1;
                }
                
                else if (policyHolderAge() > 21 && policyHolderAge() < 60)
                {
                    return 45 * policyHolderAge() + (45 * policyHolderAge()) * 0.1;
                }
                
                else if (policyHolderAge() >= 60 && policyHolderAge() < 80)
                {
                    return 100 * policyHolderAge() + (100 * policyHolderAge()) * 0.1;
                }
                
                else
                {
                    return -1;
                }
            }
            
            else
            {
                if (policyHolderAge() < 21)
                {
                    return 18.5 * policyHolderAge();
                }
                
                else if (policyHolderAge() >= 21 && policyHolderAge() < 60)
                {
                    return 45 * policyHolderAge();
                }
                
                else if (policyHolderAge() >= 60 && policyHolderAge() < 80)
                {
                    return 100 * policyHolderAge();
                }
                
                else
                {
                    return -1;
                }
            }
        }
    }
}
