package qu.filled;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.id.input;

public class signUp extends Activity implements View.OnClickListener

{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

    }

    public final static boolean isValidEmail(CharSequence target)
    {
        // Checks that the user has submitted a valid email address
        return !TextUtils.isEmpty(target) && android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
    }




    public void onClick(View view)
    {
        //Overall non traditional onclick that listens out for all button clicks

        if(view == (View) findViewById(R.id.subBttn))
        {
            // Onclick that listens out fros sign up button
            EditText Name = (EditText) findViewById(R.id.nameEditText); //
            String nameStr = Name.getText().toString();

            EditText Email = (EditText) findViewById(R.id.emailEditText); //
            String emailStr = Name.getText().toString();

            EditText Cell = (EditText) findViewById(R.id.cellEditTetx); //
            String cellStr = Name.getText().toString();


            if(nameStr.isEmpty())
            {
                Toast pass = Toast.makeText(signUp.this, "Name is Empty", Toast.LENGTH_SHORT);
                pass.show();
                Name.setHintTextColor(Color.RED);
            }

            if(!isValidEmail(emailStr))
            {
                Toast pass= Toast.makeText(signUp.this, "Email is not Valid", Toast.LENGTH_SHORT);
                pass.show();
                Email.setHintTextColor(Color.RED);
            }

            if(Cell.length() > 12 || Cell.length()< 10)
            {
                Toast pass= Toast.makeText(signUp.this, "Cellphone Number not valid", Toast.LENGTH_SHORT);
                pass.show();
                Cell.setHintTextColor(Color.RED);
            }
        }
    }





}


