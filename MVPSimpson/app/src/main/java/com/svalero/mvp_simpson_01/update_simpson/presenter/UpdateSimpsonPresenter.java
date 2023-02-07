package com.svalero.mvp_simpson_01.update_simpson.presenter;

import com.svalero.mvp_simpson_01.entities.Simpson;
import com.svalero.mvp_simpson_01.update_simpson.UpdateSimpsonContract;
import com.svalero.mvp_simpson_01.update_simpson.model.UpdateSimpsonModel;


import java.util.ArrayList;

public class UpdateSimpsonPresenter implements UpdateSimpsonContract.Presenter{
    private UpdateSimpsonModel updateSimpsonModel;
    private UpdateSimpsonContract.View view;
    public UpdateSimpsonPresenter(UpdateSimpsonContract.View view){
        this.view = view;
        updateSimpsonModel = new UpdateSimpsonModel();
    }

    @Override
    public void updateSimpson(Simpson simpson) {
        updateSimpsonModel.updateSimpsonWS(null, new UpdateSimpsonContract.Model.OnUpdateSimpsonListener() {
            @Override
            public void onSuccess(ArrayList<Simpson> updateSimpson) {
                view.successLstSimpson(updateSimpson);
            }

            @Override
            public void onFailure(String error) {
                view.failureUpdateSimpson(error);
            }
        });

    }
}