package com.example.livingroomadmin.myfragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;


import layout.Fragment2;
import values.fragment1;

public class MainActivity extends AppCompatActivity {
    fragment1 frag1;
    Fragment2 frag2;
    CheckBox chbStack;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frag1 = new fragment1();
        frag2 = new Fragment2();
        FragmentTransaction fTrans = getSupportFragmentManager().beginTransaction();
        getSupportFragmentManager();
        fTrans.add(R.id.container, frag1);
        fTrans.add(R.id.container2, frag2);
        fTrans.commit();


    }

    public void onClick(View v) {
        FragmentTransaction fTrans = getSupportFragmentManager().beginTransaction();
        getSupportFragmentManager();
        /*switch (v.getId()) {
            case R.id.btnAdd:
                fTrans.add(R.id.frgmCont, frag1);
                break;
            case R.id.btnRemove:
                fTrans.remove(frag1);
                break;
            case R.id.btnReplace:
                fTrans.replace(R.id.frgmCont, frag2);
            default:
                break;


        }
        if (chbStack.isChecked()) fTrans.addToBackStack(null);
        fTrans.commit();*/
    }


}
