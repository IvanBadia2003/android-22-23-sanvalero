package com.svalero.mvp_simpson_01.update_simpson.model;

import com.svalero.mvp_simpson_01.entities.Simpson;
import com.svalero.mvp_simpson_01.update_simpson.UpdateSimpsonContract;

public class UpdateSimpsonModel implements UpdateSimpsonContract.Model {

    @Override
    public void updateSimpsonWS(Simpson simpson, OnUpdateSimpsonListener onUpdateSimpsonListener) {
        onUpdateSimpsonListener.onSuccess(null);
        onUpdateSimpsonListener.onFailure("ERRORRRR!!!");
    }
}
