package command;

//public class OkGoogle {
//    private Heater heater;
//
//    public OkGoogle(Heater heater) {
//        this.heater = heater;
//    }
//
//    public void talk() {
//        heater.powerOn();
//    }
//}

//public class OkGoogle {
//    private String[] modes = {"heater", "lamp"};
//
//    private Heater heater;
//    private Lamp lamp;
//    private String mode;
//
//    public OkGoogle(Heater heater, Lamp lamp) {
//        this.heater = heater;
//        this.lamp = lamp;
//    }
//
//    public void setMode(int idx) {
//        this.mode = modes[idx];
//    }
//
//    public void talk() {
//        switch (this.mode) {
//            case "heater":
//                this.heater.powerOn();
//                break;
//            case "lamp":
//                this.lamp.turnOn();
//                break;
//        }
//    }
//}

class OkGoogle {
    private Command command;

    void setCommand(Command command) {
        this.command = command;
    }

    void talk() {
        command.run();
    }
}
