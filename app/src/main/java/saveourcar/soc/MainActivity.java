package saveourcar.soc;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.ui.PlacePicker;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import saveourcar.soc.twitter.ListTweetsActivity;

@SuppressLint("SdCardPath")
public class MainActivity extends AppCompatActivity {
    private static final int PLACE_PICKER_REQUEST = 19;
    private Button button;
    private Button btnCamera;
    private Button btnInsurance;
    private static final int CONTENT_REQUEST = 1337;
    private File output = null;
    String mCurrentPhotoPath;
    private TextView mName;
    private TextView mAddress;
    private TextView openNow;
    private TextView mNumber;

    private static final LatLngBounds Sligo = new LatLngBounds(
            new LatLng(54.475854,-8.093514), new LatLng(54.475854,-8.093514));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        mName = (TextView) findViewById(R.id.textView);
        mAddress = (TextView) findViewById(R.id.textView2);
        openNow = (TextView) findViewById(R.id.textView3);
        mNumber = (TextView) findViewById(R.id.textView4);
        Button pickerButton = (Button) findViewById(R.id.pickerButton);

        pickerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    PlacePicker.IntentBuilder intentBuilder =
                            new PlacePicker.IntentBuilder();
                    intentBuilder.setLatLngBounds(Sligo);


                    List<Integer> filterTypes = new ArrayList<Integer>();
                    filterTypes.add(Place.TYPE_CAR_REPAIR);


                    Intent intent = intentBuilder.build(MainActivity.this);
                    startActivityForResult(intent, PLACE_PICKER_REQUEST );
                } catch (GooglePlayServicesRepairableException
                        | GooglePlayServicesNotAvailableException e) {
                    e.printStackTrace();
                }
            }
        });








        View twitter = findViewById(R.id.btn_twitter_stream);
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListTweetsActivity.class);
                startActivity(intent);
                setTitle("Insurance");

            }
        });
        btnInsurance = (Button) findViewById(R.id.insurance);
    }


    @Override
    protected void onActivityResult(int requestCode,
                                    int resultCode, Intent data) {

        if (requestCode == PLACE_PICKER_REQUEST
                && resultCode == Activity.RESULT_OK) {



            final Place place = PlacePicker.getPlace(this, data);
            final List types = place.getPlaceTypes();
            final CharSequence name = place.getName();
            final CharSequence address = place.getAddress();
            final CharSequence formatted_phone_number = place.getPhoneNumber();
                     //    final CharSequence car = place.TYPE_CAR_REPAIR();
            //public abstract List<Integer> getTypeFilter(place.TYPE_CAR_REPAIR);
            String attributions = (String) place.getAttributions();
            if (attributions == null) {
                attributions = "";
            }

            if (types.contains(88))
            {
                mName.setText(name);
                mAddress.setText(address);

                mNumber.setText(formatted_phone_number);
            }






        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {

            //Check for succesful result code
            if (resultCode == -1) {
                //Show your Toast when the result is a success.
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Picture is saved in your SOC gallery", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 100, 0);
                toast.show();
            }

        }



    }
    public void onClickNumber(View arg)
    {
        String phone = mNumber.getText().toString();

        Intent phoneIntent = new Intent(Intent.ACTION_DIAL, Uri.fromParts(
                "tel", phone, null));
        startActivity(phoneIntent);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch(id){
            case R.id.instructions:
                startActivity(new Intent(MainActivity.this, Instructions.class));

                break;

        }

        return super.onOptionsItemSelected(item);
    }

    static final int REQUEST_IMAGE_CAPTURE = 1;
    private static final int CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE = 0;
    public void onClickbtnCamera(View v)
    {
        Intent imageIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        Uri uriSavedImage = Uri.fromFile(new File("/storage/emulated/0/DCIM/SOC","QR_"+timeStamp+ ".png"));
        imageIntent.putExtra(MediaStore.EXTRA_OUTPUT, uriSavedImage);
        startActivityForResult(imageIntent, 1);

    }



   public void onClickbtnInsurance(View view) {
       startActivity(new Intent(MainActivity.this, Insurance.class));
}

    public void onClickbtnClose(View view) {
        moveTaskToBack(true);
    }



/*    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {

            //Check for succesful result code
            if (resultCode == -1) {
                //Show your Toast when the result is a success.
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Picture is saved in your SOC gallery", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 100, 0);
                toast.show();
            }
        }
    }*/

}