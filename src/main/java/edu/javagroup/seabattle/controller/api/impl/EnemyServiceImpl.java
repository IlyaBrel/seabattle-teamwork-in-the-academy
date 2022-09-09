package edu.javagroup.seabattle.controller.api.impl;

import edu.javagroup.seabattle.controller.api.EnemyService;
import edu.javagroup.seabattle.controller.api.RemoteApi;
import edu.javagroup.seabattle.controller.api.RemoteApiProvider;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.Response;

import javax.swing.*;
import java.io.IOException;

@Component
public class EnemyServiceImpl implements EnemyService {

    private final RemoteApiProvider remoteApiProvider;

    public EnemyServiceImpl(RemoteApiProvider remoteApiProvider) {
        this.remoteApiProvider = remoteApiProvider;
    }

    //------------------------------------------------------------------------------------------------------------------

    @Override
    public Boolean lanTest() {
        RemoteApi remoteApi = remoteApiProvider.getRemoteApi();
        if (remoteApi != null) {
            Call<Boolean> call = remoteApi.lanTest();
            try {
                return call.execute().body();
            } catch (IOException e) {
                System.out.println("Error: " + this.getClass().getSimpleName() + " - " + e.getMessage());
                JOptionPane.showMessageDialog(null, "Проблема с сетью", "Ошибка!", JOptionPane.ERROR_MESSAGE);
            }
        }
        return false;
    }

    @Override
    public Boolean areYouReady() {
        RemoteApi remoteApi = remoteApiProvider.getRemoteApi();
        if (remoteApi != null) {
            Call<Boolean> call = remoteApi.areYouReady();
            try {
                return call.execute().body();
            } catch (IOException e) {
                System.out.println("Error: " + this.getClass().getSimpleName() + " - " + e.getMessage());
                JOptionPane.showMessageDialog(null, "Проблема с сетью", "Ошибка!", JOptionPane.ERROR_MESSAGE);
            }
        }
        return false;
    }

    @Override
    public Boolean sendBomb(int row, int col) {
        RemoteApi remoteApi = remoteApiProvider.getRemoteApi();
        if (remoteApi != null) {
            Call<Boolean> call = remoteApi.sendBomb(row, col);
            try {
                return call.execute().body();
            } catch (IOException e) {
                System.out.println("Error: " + this.getClass().getSimpleName() + " - " + e.getMessage());
                JOptionPane.showMessageDialog(null, "Проблема с сетью", "Ошибка!", JOptionPane.ERROR_MESSAGE);
            }
        }
        return false;
    }
}
