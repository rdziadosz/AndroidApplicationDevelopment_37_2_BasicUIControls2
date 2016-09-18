package eu.dziadosz.basicuicontrols2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // AutoCompleteTextView
        AutoCompleteTextView actv = (AutoCompleteTextView)
                findViewById(R.id.login); // add stings to control
        ArrayAdapter<String> aa = new ArrayAdapter<>(this,
                android.R.layout.simple_dropdown_item_1line,
                new String[]{"Pasi", "Juha", "Kari", "Jouni", "Esa", "Hannu"});
        actv.setAdapter(aa);

    }

    public void sendButtonClicked(View view) {

        AutoCompleteTextView login = (AutoCompleteTextView) findViewById(R.id.login);
        TextView pass = (TextView) findViewById(R.id.password);

        String text = "L: " + login.getText().toString() + "\nP: " + pass.getText().toString();

        Toast.makeText(getApplicationContext(), text,
                Toast.LENGTH_SHORT).show();
    }
}
