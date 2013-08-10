package in.lovedoll.kondo.helloproton;

public class SimpleMessage implements Message {

    @Override
    public String display() {
        return "I'm injected by Proton!";
    }

}
