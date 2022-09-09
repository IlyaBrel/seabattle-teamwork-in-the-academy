package edu.javagroup.seabattle.controller.api;

import com.google.gson.GsonBuilder;
import edu.javagroup.seabattle.controller.api.RemoteApi;
import edu.javagroup.seabattle.singleton.SettingsSingleton;
import edu.javagroup.seabattle.util.StringUtils;
import org.springframework.stereotype.Component;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static edu.javagroup.seabattle.constants.Constants.*;

@Component
public class RemoteApiProvider {

    public RemoteApi getRemoteApi() {
        String enemyIpAddress = SettingsSingleton.instance(null).getSettingsByKey(ENEMY_IP_ADDRESS);
        if (StringUtils.isNotEmpty(enemyIpAddress)) {
            return new Retrofit.Builder()
                    .baseUrl(ENEMY_PROTOCOL + "://" + enemyIpAddress + ":" + ENEMY_PORT)
                    .addConverterFactory(
                            GsonConverterFactory.create(
                                    new GsonBuilder().setLenient().create()
                            )
                    )
                    .build()
                    .create(RemoteApi.class);
        } else {
            return null;
        }
    }
}
