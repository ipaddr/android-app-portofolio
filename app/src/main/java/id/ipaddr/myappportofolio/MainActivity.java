package id.ipaddr.myappportofolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method will handle all button click action within activity_main layout
     * @param view is button that has been clicked
     */
    public void onButtonClicked(View view){
        String text = ((Button)view).getText().toString();
        Toast.makeText(this, String.format(getString(R.string.button_click_message), text), Toast.LENGTH_SHORT).show();
    }
}
