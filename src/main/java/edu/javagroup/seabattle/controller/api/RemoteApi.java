package edu.javagroup.seabattle.controller.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface RemoteApi {

    @GET("/api/open/game/lanTest")
    Call<Boolean> lanTest();

    @GET("/api/open/game/imEnemyAndImReady")
    Call<Boolean> areYouReady();

    @POST("/api/open/game/imEnemyAndISendBomb")
    Call<Boolean> sendBomb(@Query("row") int row, @Query("col") int col);
}
