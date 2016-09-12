package saveourcar.soc;

/**
 * Created by Craigg on 15/04/2016.
 */

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomListAdapter extends ArrayAdapter<InsuranceCompany> {

    private final Activity context;

    public CustomListAdapter(Activity context, List<InsuranceCompany> companies) {
        super(context, R.layout.mylist, companies);
        this.context=context;
    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.mylist, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView extratxt = (TextView) rowView.findViewById(R.id.textView1);

        InsuranceCompany company = getItem(position);

        txtTitle.setText(company.getName());
        imageView.setImageResource(company.getImageId());
        extratxt.setText("Click to call "+company.getName());
        return rowView;

    };
}
