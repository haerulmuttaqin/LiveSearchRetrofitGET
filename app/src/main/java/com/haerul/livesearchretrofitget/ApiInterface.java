package com.haerul.livesearchretrofitget;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by haerul on 17/03/18.
 */

public interface ApiInterface {

    @GET("getcontacts.php")
    Call<List<Contact>> getContact(
            @Query("item_type") String item_type,
            @Query("key") String keyword
    );
}
