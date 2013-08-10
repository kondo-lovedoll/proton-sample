package in.lovedoll.kondo.providerinjection;

import javax.inject.Inject;

import proton.inject.activity.ProtonActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends ProtonActivity {
    @Inject
    private Message mMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.MessageHolder);
        textView.setText(mMessage.display());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
