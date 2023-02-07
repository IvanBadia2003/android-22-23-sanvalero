package com.svalero.mvp_simpson_01.update_simpson;

import com.svalero.mvp_simpson_01.entities.Simpson;


import java.util.ArrayList;

public interface UpdateSimpsonContract {

    public interface View{
        void successLstSimpson(ArrayList<Simpson> updateSimpson);
        void failureUpdateSimpson(String error);

    }

    public interface Presenter{
        void updateSimpson(Simpson simpson);
    }

    public interface Model{
        interface OnUpdateSimpsonListener{
            void onSuccess(ArrayList<Simpson> updateSimpson);
            void onFailure(String error);
        }
        void updateSimpsonWS(Simpson simpson,
                          OnUpdateSimpsonListener onUpdateSimpsonListener);
    }

}
