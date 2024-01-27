package oops.abstractclasses;

// MyHospital is an abstract class that extends the abstract class Hospital.
// This means that MyHospital inherits all the abstract methods of Hospital and is required to provide implementations for them.
abstract class MyHospital extends Hospital {

    // Override the abstract method 'emergency' from Hospital class.
    // This method is supposed to define what happens in an emergency situation in MyHospital.
    // Currently, it throws an UnsupportedOperationException because it's not yet implemented.
    @Override
    void emergency() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'emergency'");
    }

    // Override the abstract method 'admit' from Hospital class.
    // This method is supposed to define the admission process in MyHospital.
    // Currently, it throws an UnsupportedOperationException because it's not yet implemented.
    @Override
    void admit() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'admit'");
    }

    // Override the abstract method 'billing' from Hospital class.
    // This method is supposed to define the billing process in MyHospital.
    // Currently, it throws an UnsupportedOperationException because it's not yet implemented.
    @Override
    void billing() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'billing'");
    }
    
}