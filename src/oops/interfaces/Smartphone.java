package oops.interfaces;

// Define a class Phone with methods call() and sms()
class Phone{
    void call(){
        System.out.println("phone class: calling ");
    }
    
    void sms(){
        System.out.println("phone class: sms");
    }
}

// Define an interface Camera with methods click() and record()
interface Camera{
    void click();
    void record();
}

// Define an interface Musicplayer with methods play() and pause()
interface Musicplayer {
    void play();
    void pause();
}

// Define a class Smartphone that extends Phone and implements Camera and Musicplayer
public class Smartphone extends Phone implements Camera, Musicplayer {

    // Override the play() method from Musicplayer
    @Override
    public void play() {
        System.out.println("smartphone class: overridden play");
    }

    // Override the pause() method from Musicplayer
    @Override
    public void pause() {
        System.out.println("smartphone class: overridden pause");
    }

    // Override the click() method from Camera
    @Override
    public void click() {
        System.out.println("smartphone class: overridden click");
    }

    // Override the record() method from Camera
    @Override
    public void record() {
        System.out.println("smartphone class: overridden record");
    }
    
    public static void main(String[] args) {
        // Create an instance of Smartphone
        Smartphone sm = new Smartphone();
        // Call methods from Phone, Camera, and Musicplayer
        sm.call();
        sm.sms();
        sm.play();
        sm.pause();
        sm.play();
        sm.pause();

        // Upcast Smartphone to Phone
        Phone ph = sm;
        // Call method from Phone
        // here ph reference is used, so only ref class methods will be available too call
        ph.call();

        // Upcast Smartphone to Camera
        Camera ca = sm;
        // Call methods from Camera
        ca.click();
        ca.record();

        // Upcast Smartphone to Musicplayer
        Musicplayer mp = sm;
        // Call methods from Musicplayer
        mp.play();
        mp.pause();
    }
}