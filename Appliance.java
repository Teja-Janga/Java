
    /* Interfaces for Multiple Inheritance with Abstraction */

interface Connectable {
    void Method1(String network);
}

interface Media {
    void Method2(String songName);
}

interface VoiceAssist {
    void Method3(String Command);
}

class SmartAppliance implements Connectable, Media, VoiceAssist {

    public void Method1(String network) {
        System.out.println("Connecting to Network: "+network);
    }

    public void Method2(String songName) {
        System.out.println("Playing Track: "+songName);
    }

    public void Method3(String Command) {
        System.out.println("Voice Assistant: "+Command);
    }
}

public class Appliance {
    public static void main(String[] args) {
        SmartAppliance a = new SmartAppliance();
        a.Method1("Home_Wifi");
        a.Method2("Memory Reboot");
        a.Method3("Executing Command - Switch on the fan please!");
    }
}
