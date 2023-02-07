package com.svalero.mvp_simpson_01.update_simpson.view;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.svalero.mvp_simpson_01.R;
import com.svalero.mvp_simpson_01.entities.Simpson;
import com.svalero.mvp_simpson_01.update_simpson.UpdateSimpsonContract;
import com.svalero.mvp_simpson_01.update_simpson.presenter.UpdateSimpsonPresenter;

import java.util.ArrayList;

public class UpdateSimpsonActivity extends AppCompatActivity implements UpdateSimpsonContract.View {
    private UpdateSimpsonPresenter updateSimpsonPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lst_simpson);

        initComponents();
        initPresenter();
        initData();

    }

    public void initComponents() {

    }

    public void initPresenter() {
        updateSimpsonPresenter = new UpdateSimpsonPresenter(this);
    }

    public void initData() {
        updateSimpsonPresenter.updateSimpson(null); //SELECT * FROM SIMPSON
    }


    @Override
    public void successLstSimpson(ArrayList<Simpson> updateSimpson) {
        // ADAPTER. NOTIFY SET DATA CHANGED
    }

    @Override
    public void failureUpdateSimpson(String error) {
        Toast.makeText(this, "Los dato no han podido ser cargados", Toast.LENGTH_SHORT).show();
    }
}

