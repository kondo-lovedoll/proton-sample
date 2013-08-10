package in.lovedoll.kondo.providerinjection;

import javax.inject.Provider;

public class MessageProvider implements Provider<Message> {

    @Override
    public Message get() {
        return new SimpleMessage("I'm injected by Proton!");
    }

}
