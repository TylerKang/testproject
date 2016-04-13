package edu.ucsd.sddevelopers.testproject.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import edu.ucsd.sddevelopers.testproject.MyActivity;
import edu.ucsd.sddevelopers.testproject.R;

/**
 * Created by Tyler on 4/13/2016.
 */

public class JUnit_test extends ActivityInstrumentationTestCase2<MyActivity> {

    MyActivity myActivity;

    public JUnit_test(){
      super(MyActivity.class);
    }

    public void test_first(){
        myActivity = getActivity();

        TextView textView = (TextView) myActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();

        assertEquals("Hello World!", tester);

    }
}
