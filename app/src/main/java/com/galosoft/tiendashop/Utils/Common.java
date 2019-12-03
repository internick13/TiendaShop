package com.galosoft.tiendashop.Utils;

import com.galosoft.tiendashop.Retrofit.IDrinkShopAPI;
import com.galosoft.tiendashop.Retrofit.RetrofitClient;

public class Common {

    public static final String BASE_URL = "http://10.0.2.2:8080/drinkshop/";

    public static IDrinkShopAPI getAPI() {
        return RetrofitClient.getClient(BASE_URL).create(IDrinkShopAPI.class);
    }
}
