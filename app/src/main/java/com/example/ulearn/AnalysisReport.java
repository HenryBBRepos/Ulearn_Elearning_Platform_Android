package com.example.ulearn;


import android.app.AlertDialog;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class AnalysisReport extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.analysis_report);
        getSupportActionBar().hide();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
//
//        PieChart pieChart = (PieChart) findViewById(R.id.piechart);
//        pieChart.setUsePercentValues(true);
//
//        // IMPORTANT: In a PieChart, no values (Entry) should have the same
//        // xIndex (even if from different DataSets), since no values can be
//        // drawn above each other.
//        ArrayList<Entry> yvalues = new ArrayList<Entry>();
//        yvalues.add(new Entry(8f, 0));
//        yvalues.add(new Entry(15f, 1));
//        yvalues.add(new Entry(12f, 2));
//        yvalues.add(new Entry(25f, 3));
//        yvalues.add(new Entry(23f, 4));
//        yvalues.add(new Entry(17f, 5));
//
//        PieDataSet dataSet = new PieDataSet(yvalues, "Election Results");
//
//        ArrayList<String> xVals = new ArrayList<String>();
//
//        xVals.add("January");
//        xVals.add("February");
//        xVals.add("March");
//        xVals.add("April");
//        xVals.add("May");
//        xVals.add("June");
//
//        PieData data = new PieData(xVals, dataSet);
//        // In Percentage term
//        data.setValueFormatter(new PercentFormatter());
//        // Default value
//        //data.setValueFormatter(new DefaultValueFormatter(0));
//        pieChart.setData(data);
//        pieChart.setDescription("This is Pie Chart");
//
//        pieChart.setDrawHoleEnabled(true);
//        pieChart.setTransparentCircleRadius(25f);
//        pieChart.setHoleRadius(25f);
//
//        dataSet.setColors(ColorTemplate.VORDIPLOM_COLORS);
//        data.setValueTextSize(13f);
//        data.setValueTextColor(Color.DKGRAY);
//        pieChart.setOnChartValueSelectedListener(this);
//
//        pieChart.animateXY(1400, 1400);
//
//    }
//
//    @Override
//    public void onValueSelected(Entry e, int dataSetIndex, Highlight h) {
//
//        if (e == null)
//            return;
//        Log.i("VAL SELECTED",
//                "Value: " + e.getVal() + ", xIndex: " + e.getXIndex()
//                        + ", DataSet index: " + dataSetIndex);
//    }
//
//    @Override
//    public void onValueSelected(Entry e, Highlight h) {
//
//    }
//
//    @Override
//    public void onNothingSelected() {
//        Log.i("PieChart", "nothing selected");
//    }

        //attaching click listener
        findViewById(R.id.buttonShowDialog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //calling this method to show our android custom alert dialog
                showCustomDialog();
            }
        });
    }

    private void showCustomDialog() {
        //before inflating the custom alert dialog layout, we will get the current activity viewgroup
        ViewGroup viewGroup = findViewById(android.R.id.content);

        //then we will inflate the custom alert dialog xml that we created
        View dialogView = LayoutInflater.from(this).inflate(R.layout.my_dialog, viewGroup, false);


        //Now we need an AlertDialog.Builder object
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        //setting the view of the builder to our custom view that we already inflated
        builder.setView(dialogView);

        //finally creating the alert dialog and displaying it
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

}
