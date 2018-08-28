package com.example.student.thtuan03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText edtMaNV,edtTenNV;
    RadioGroup radGroup;
    Button btnNhapNV;
    ListView lsvDS;
    ArrayList<Employee> arrEmployee=new ArrayList<Employee>();
    ArrayAdapter<Employee> arrAdapter=null;
    Employee employee=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtMaNV= (EditText) findViewById(R.id.edtMaNV);
        edtTenNV= (EditText) findViewById(R.id.edtTenNV);
        radGroup= (RadioGroup) findViewById(R.id.radGroup);
        btnNhapNV= (Button) findViewById(R.id.btnNhapNV);
        lsvDS= (ListView) findViewById(R.id.lsvDS);
        arrAdapter=new ArrayAdapter<Employee>(this,android.R.layout.simple_list_item_1,arrEmployee);
        lsvDS.setAdapter(arrAdapter);
        btnNhapNV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nhap();
            }
        });
    }
    public void nhap()
    {
        int radId=radGroup.getCheckedRadioButtonId();
        String id=edtMaNV.getText()+"";
        String name=edtTenNV.getText()+"";
        if(radId==R.id.radChinhThuc)
        {
            employee=new EmployeePFullTime();
        }
        else {
            employee=new EmployeePartTime();
        }
        employee.setId(id);
        employee.setName(name);
        arrEmployee.add(employee);
        arrAdapter.notifyDataSetChanged();
    }
}
