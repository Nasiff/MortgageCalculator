package ca.roumani.mcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import hr.YumModel;

public class EntryForm extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry_form);
    }

    public void buttonClicked(View v)
    {
        View principleView = findViewById(R.id.principleBox);
        EditText principleEdit = (EditText) principleView;
        String principle = principleEdit.getText().toString();

        View amortizationView = findViewById(R.id.amortizationBox);
        EditText amortizationEdit = (EditText) amortizationView;
        String amortization = amortizationEdit.getText().toString();

        View interestView = findViewById(R.id.interestBox);
        EditText interestEdit = (EditText) interestView;
        String interest = interestEdit.getText().toString();

        MortgageModel model = new MortgageModel(principle, amortization, interest);
        String answer = model.getMortgage();

        ((TextView) findViewById(R.id.answer)).setText(answer);


    }
    public void buttonClicked2(View v)
    {
        View principleView = findViewById(R.id.principleBox);
        EditText principleEdit = (EditText) principleView;
        String principle = principleEdit.getText().toString();

        View amortizationView = findViewById(R.id.amortizationBox);
        EditText amortizationEdit = (EditText) amortizationView;
        String amortization = amortizationEdit.getText().toString();

        View interestView = findViewById(R.id.interestBox);
        EditText interestEdit = (EditText) interestView;
        String interest = interestEdit.getText().toString();




        YumModel model = new YumModel();
        model.setPrinciple(principle);
        model.setAmortization(amortization);
        model.setInterest(interest);
        //model.computePayment();

        String answer2 = model.computePayment();

        ((TextView) findViewById(R.id.answer2)).setText(answer2);
    }
    
}
