package fr.ablanc.chargingPoint.manager;


import fr.ablanc.chargingPoint.service.RequestAPI;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ApiManager {
        final static String BASE_URL = "https://public.opendatasoft.com/api/records/1.0/search/?dataset=fichier-consolide-des-bornes-de-recharge-pour-vehicules-electriques-irve";

        private RequestAPI requestAPI=null;
        private static ApiManager instance;

        private RequestAPI chargingService;
        public RequestAPI getChargingService() {
            return chargingService;
        }

        public static ApiManager getInstance() {
            if (instance == null) {
                instance = new ApiManager();
            }

            return instance;
        }

        private ApiManager() {
            createRetrofitClock();
        }

        private void createRetrofitClock() {

            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.level(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();


            Retrofit retrofitClock = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            chargingService = retrofitClock.create(RequestAPI.class);

        }
}
