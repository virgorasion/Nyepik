package surabaya.smkn2.nyepik.DataRetrofit;

import retrofit2.converter.gson.GsonConverterFactory;

public class Retrofit {

    private final static String Base_url = "https://api.jikan.moe/";
    private static retrofit2.Retrofit retrofit;

    public static retrofit2.Retrofit getData(){
        retrofit = new retrofit2.Retrofit.Builder()
                .baseUrl(Base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit;
    }
}

