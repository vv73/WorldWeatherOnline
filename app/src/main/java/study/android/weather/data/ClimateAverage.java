
package study.android.weather.data;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ClimateAverage {

    @SerializedName("month")
    @Expose
    public List<Month> month = null;

}
