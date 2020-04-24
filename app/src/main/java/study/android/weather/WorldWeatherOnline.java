package study.android.weather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import study.android.weather.data.Weather;

public interface WorldWeatherOnline {
        @GET("http://api.worldweatheronline.com/premium/v1/weather.ashx?format=json&q=Moscow&key=f1741da35c4b4651a41122856201704&includelocation=yes")
        Call<Weather> getWeather();
}
