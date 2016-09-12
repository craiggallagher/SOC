package saveourcar.soc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import saveourcar.soc.AllInstructions.FlatTire;
import saveourcar.soc.AllInstructions.FuelCar;
import saveourcar.soc.AllInstructions.JumpStartCar;
import saveourcar.soc.AllInstructions.Oil;
import saveourcar.soc.AllInstructions.WindshieldWasherTank;

public class Instructions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void onClickTire(View view)
    {
        startActivity(new Intent(Instructions.this, FlatTire.class));
    }
    public void onClickOil(View view)
    {
        startActivity(new Intent(Instructions.this, Oil.class));
    }
    public void onClickwind(View view)
    {
        startActivity(new Intent(Instructions.this, WindshieldWasherTank.class));
    }
    public void onClickJump(View view)
    {
        startActivity(new Intent(Instructions.this, JumpStartCar.class));
    }
    public void onClickFuel(View view)
    {
        startActivity(new Intent(Instructions.this, FuelCar.class));
    }
}
