package in.lovedoll.kondo.retainstate;

import proton.inject.DefaultModule;
import proton.inject.scope.ContextScoped;

public class MyModule extends DefaultModule {

    @Override
    protected void configure() {
        super.configure();
        bind(TextFetcher.class).in(ContextScoped.class);
    }

}
