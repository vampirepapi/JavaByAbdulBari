package oops.abstractclasses;
// In the context of your Hospital abstract class, it means that all types of hospitals (like GeneralHospital, SpecializedHospital, etc.) will have to define how they handle beds, emergency, admit, and billing operations. This ensures a consistent interface across all types of hospitals.

// Abstract class representing a hospital
abstract class Hospital {
    
    // Abstract method to define the number of beds in the hospital
    abstract void beds();
    
    // Abstract method to handle emergency cases
    abstract void emergency();
    
    // Abstract method to admit patients
    abstract void admit();
    
    // Abstract method to handle billing
    abstract void billing();


}
