package saveourcar.soc;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Insurance extends AppCompatActivity {
    ListView list;
    ArrayList<String> listItems;
    CustomListAdapter adapter;
    EditText inputSearch;
    String[] itemname ={
            "123.ie",
            "AA",
            "Acorn",
            "Admiral",
            "AIG",
            "Allianz",
            "AON",
            "Aviva",
            "Auto Direct",
            "AXA",
            "Carrot",
            "Chill",
            "Churchill",
            "CoverBox",
            "DirectChoice",
            "FBD",
            "First Insurance",
            "Halifax",
            "Kwik Fit",
            "No Nonsense",
            "Quinn Direct",
            "RSA",




    };

    Integer[] imgid= {
            R.drawable.onetwothree,
            R.drawable.aa,
            R.drawable.acorn,
            R.drawable.admiral,
            R.drawable.aig,
            R.drawable.allianz,
            R.drawable.aon,
            R.drawable.aviva,
            R.drawable.autodirect,
            R.drawable.axa,
            R.drawable.carrot,
            R.drawable.chill,
            R.drawable.churchill,
            R.drawable.coverbox,
            R.drawable.directchoice,
            R.drawable.fbd,
            R.drawable.first,
            R.drawable.halifax,
            R.drawable.kwikfit,
            R.drawable.nononsense,
            R.drawable.quinndirect,
            R.drawable.rsa,



    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insurance);
        List<InsuranceCompany> companies = new ArrayList<>();

        for(int i = 0; i < itemname.length; i++) {
            companies.add(new InsuranceCompany(itemname[i], imgid[i]));
        }
        adapter=new CustomListAdapter(this, companies);
        list=(ListView)findViewById(R.id.list);
        inputSearch = (EditText) findViewById(R.id.itemtext);
        list.setAdapter(adapter);


        inputSearch.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                // When user changed the Text
                Insurance.this.adapter.getFilter().filter(cs);


            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                                          int arg3) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
            }
        });
        list.setAdapter(adapter);



        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub

                String Slecteditem = adapter.getItem(position).getName();
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();
                if (Slecteditem.toString() == "123.ie") {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:01 518 1434"));
                    startActivity(intent);
                }
                if (Slecteditem.toString() == "AA") {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:028 9032 2232"));
                    startActivity(intent);
                }

                if (Slecteditem.toString() == "Acorn") {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:01704270027"));
                    startActivity(intent);
                }
                if (Slecteditem.toString() == "Admiral") {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:0333 220 2033"));
                    startActivity(intent);
                }
                if (Slecteditem.toString() == "AIG") {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:353 1 208 1400"));
                    startActivity(intent);
                }
                if (Slecteditem.toString() == "Allianz") {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:01 448 4848"));
                    startActivity(intent);
                }
                if (Slecteditem.toString() == "AON") {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:01 266 6000"));
                    startActivity(intent);
                }
                if (Slecteditem.toString() == "Aviva") {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:1890 66 68 88"));
                    startActivity(intent);
                }
                if (Slecteditem.toString() == "Auto Direct") {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:0345 313 2123"));
                    startActivity(intent);
                }
                if (Slecteditem.toString() == "AXA") {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:1890 24 7 365"));
                    startActivity(intent);
                }
                if (Slecteditem.toString() == "Carrot") {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:028 9032 2265"));
                    startActivity(intent);
                }
                if (Slecteditem.toString() == "Chill") {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:1890 302 020"));
                    startActivity(intent);
                }
                if (Slecteditem.toString() == "Churchill") {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:0345 603 3599"));
                    startActivity(intent);
                }
                if (Slecteditem.toString() == "CoverBox") {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:01780 769 223"));
                    startActivity(intent);
                }
                if (Slecteditem.toString() == "DirectChoice") {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:01877 728 3116"));
                    startActivity(intent);
                }
                if (Slecteditem.toString() == "FBD") {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:01 428 2266"));
                    startActivity(intent);
                }
                if (Slecteditem.toString() == "First Insurance") {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:01344 286 188"));
                    startActivity(intent);
                }
                if (Slecteditem.toString() == "Halifax") {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:01344 286 188"));
                    startActivity(intent);
                }
                if (Slecteditem.toString() == "Kwik Fit") {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:0800 952 4141"));
                    startActivity(intent);
                }
                if (Slecteditem.toString() == "No Nonsense") {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:1890 25 27 37"));
                    startActivity(intent);
                }
                if (Slecteditem.toString() == "Quinn Direct") {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:0845 351 1210"));
                    startActivity(intent);
                }
                if (Slecteditem.toString() == "RSA") {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:0044 1403 232 323"));
                    startActivity(intent);
                }

            }
        });
        setTitle("Insurance");



    }


    public void onClickAviviaArrow(View arg)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:028 9032 2232"));
        startActivity(intent);

    }
    public void onClick123Arrow(View arg)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:01 518 1434"));
        startActivity(intent);

    }
    public void onClickAllianzArrow(View arg)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:01 448 4848"));
        startActivity(intent);

    }
    public void onClickQuotedevilArrow(View arg)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:01 661 9062"));
        startActivity(intent);

    }
    public void onClickLibertyInsuranceArrow(View arg)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:1890 891 890"));
        startActivity(intent);

    }
    public void onClickFBDArrow(View arg)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:01 428 2266"));
        startActivity(intent);

    }
    public void onClickChillArrow(View arg)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:1890 302 020"));
        startActivity(intent);

    }
    public void onClickAcornArrow(View arg)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:01704270027"));
        startActivity(intent);

    }
    public void onClickAdmiralArrow(View arg)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:0333 220 2033"));
        startActivity(intent);

    }
    public void onClickAutoDirectArrow(View arg)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:0345 313 2123"));
        startActivity(intent);

    }
    public void onClickCarrotArrow(View arg)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:0333 355 2990"));
        startActivity(intent);

    }
    public void onClickChurchillArrow(View arg)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:0345 603 3599"));
        startActivity(intent);

    }
    public void onClickCoverBoxArrow(View arg)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:01780 769 223"));
        startActivity(intent);

    }
    public void onClickDirectChoiceArrow(View arg)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:01877-728-3116"));
        startActivity(intent);

    }
    public void onClickFirstArrow(View arg)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:01344 286 188"));
        startActivity(intent);

    }
    public void onClickHalifaxArrow(View arg)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:01344 286 188"));
        startActivity(intent);

    }
    public void onClickAIGArrow(View arg)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:353 1 208 1400"));
        startActivity(intent);

    }
}
