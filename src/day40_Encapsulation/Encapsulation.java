package day40_Encapsulation;

public class Encapsulation {

    //private ins var:
    private long SSN; // private: only accessible in class :
    // private : NO DIRECT ACCESS to this variable from any other class

    // to encapsulate this private ins variable ==> generate getter and setter
    // getter (read-only): has to be public
    // (if default: we won't be able to use it in another package even if we import this class)
    // give long return type: Return Type must match with private instance variable data type
    // then name : preferred getVariableName
    public long getSSN(){       //Read-only method
        return SSN;             // returning private instance variable
        // can I call it somewhere else? Yes - public access modifier
        // when I call this method ==> I'll be able to get to my variable
        // we are only returning here = we are not initializing any value to SSN
    }

    // we need the SETTER to modify the value of the private data we have
    // setter (write-only):  must be public -
    // (if default: we won't be able to use it in another package even if we import this class)
    // void return type : I'm only setting the value ,
    // I'm not returning anything
    // must pass a parameter to set the value of the private instance variable
    // parameter data type MUST match with private instance variable
    // name = preferred setVariableName
    // the function of setter is to initialize value to the variable ==> pass parameter to be assigned
    // the parameter has to have same dataType (long here). We can give it same name of instance variable and use this. to initialize
    public void setSSN(long SSN){       // write-only method (Always void return type)
        // now I will initialize the value I'm passing to the private ins var:
        this.SSN = SSN;
        //every time when we call setter, we have to pass argument = matching dataType
        // if the setter we created here is an instance method ==> can I call it using the object?
        // Yes I can call it using the object (and pass the parameter ) in 02_Test Class
    }
}
