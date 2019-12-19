package com.smartloan.smtrick.smart_loan_admin_new.view.activites;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.smartloan.smtrick.smart_loan_admin_new.R;
import com.smartloan.smtrick.smart_loan_admin_new.callback.CallBack;
import com.smartloan.smtrick.smart_loan_admin_new.constants.Constant;
import com.smartloan.smtrick.smart_loan_admin_new.models.LeedsModel;
import com.smartloan.smtrick.smart_loan_admin_new.repository.LeedRepository;
import com.smartloan.smtrick.smart_loan_admin_new.repository.impl.LeedRepositoryImpl;
import com.smartloan.smtrick.smart_loan_admin_new.view.fragements.Sales_Fragment_Checklist;
import com.smartloan.smtrick.smart_loan_admin_new.view.fragements.View_Sales_Received_Lead_Details_Fragment;

import java.util.ArrayList;

public class Sales_Bank_Customers_Activity extends AppCompatActivity implements Sales_Fragment_Checklist.OnFragmentInteractionListener {

    LeedsModel leedsModel;
    String BankName;
    LeedRepository leedRepository;
    ArrayList<LeedsModel> leedsModelArrayList;
    RecyclerView recycleCustomers;

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sales__tasks_);


        setSupportActionBar((Toolbar) findViewById(R.id.toolbar1));
        assert getSupportActionBar() != null;   //null check
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        leedsModel = (LeedsModel) getIntent().getSerializableExtra(Constant.LEED_MODEL);
        Intent intent = getIntent();
        BankName = intent.getStringExtra("Leed");

        leedRepository = new LeedRepositoryImpl();

        leedsModelArrayList = new ArrayList<>();

        recycleCustomers= (RecyclerView) findViewById(R.id.customers_recycle);
        recycleCustomers.setHasFixedSize(true);
        recycleCustomers.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        getCustomers(BankName);

    }

    private void getCustomers(String bankname) {
        leedRepository.readLeedsByBankName(bankname, new CallBack() {
            @Override
            public void onSuccess(Object object) {
                if (object != null) {
                    leedsModelArrayList = (ArrayList<LeedsModel>) object;
                }

            }

            @Override
            public void onError(Object object) {

            }
        });
    }

    @Override
    public void onFragmentInteraction(String title) {

    }
}
