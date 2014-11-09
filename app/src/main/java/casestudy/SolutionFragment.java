package casestudy;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.liushi.selfApp.R;

/**
 * Created by lshi on 10/20/2014.
 */
public class SolutionFragment extends Fragment {
    private TextView tvSolution;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_case_solution, container, false);

        tvSolution = (TextView) rootView.findViewById(R.id.case_solution);

        final Activity thisActivity = this.getActivity();
        int index = thisActivity.getIntent().getIntExtra("position", 0);

//        DatabaseHelper dbHelper = new DatabaseHelper(thisActivity.getApplicationContext());
//        Case aCase = dbHelper.getCaseById(index);

        tvSolution.setText("Solution Test");
        tvSolution.getPaint().setFakeBoldText(true);

        return rootView;
    }
}
