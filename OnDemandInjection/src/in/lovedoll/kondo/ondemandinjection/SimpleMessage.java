package in.lovedoll.kondo.ondemandinjection;

public class SimpleMessage implements Message {

    @Override
    public String display() {
        return "I'm injected by Proton!";
    }

}
