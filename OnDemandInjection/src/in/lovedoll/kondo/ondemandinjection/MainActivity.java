package in.lovedoll.kondo.ondemandinjection;

import javax.inject.Inject;

import proton.inject.Injector;
import proton.inject.Proton;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Inject
    Message message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Injector injector = Proton.getInjector(this);
        injector.inject(this);

        TextView textView = (TextView) findViewById(R.id.SimpleMessage);
        textView.setText(message.display());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
