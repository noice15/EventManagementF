package androidproject.chokshi.testeventk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidproject.chokshi.testeventk.MainActivity;

public class firstpage extends Activity implements View.OnClickListener {
    Button login1, signup1;
    protected void onCreate(Bundle savedBundleInstance) {

        super.onCreate(savedBundleInstance);
        setContentView(R.layout.first_page);

        login1=findViewById(R.id.loginbutton1);
        signup1=findViewById(R.id.signupbutton1);


        login1.setOnClickListener(this);
        signup1.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.loginbutton1:
                startActivity(new Intent(this,SignInActivity.class));
                break;

            case R.id.signupbutton1:
                Toast.makeText(this,"Signup page",Toast.LENGTH_SHORT).show();
        }


    }
}
