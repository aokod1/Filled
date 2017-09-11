package qu.filled;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class signUp extends ActionBarActivity implements View.OnClickListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

    }

    public void onClick(View view)
    {
       /** if(view == (View) findViewById(R.id.lgnBttn)) // code used to check which button has been clicked
        {
            Intent i = new Intent(this,login.class); // Like making an object of the class ("Activity you want to call")
            startActivity(i);
        }

        else if(view == (View) findViewById(R.id.signBttn))// this  signUp is the name of the button.
        {
            Intent i = new Intent(this,signUp.class);
            startActivity(i);
        }**/
    }

}
