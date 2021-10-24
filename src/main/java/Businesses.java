import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Businesses {
  @JsonProperty("businesses")
  private List<Business> businesses;

  @JsonProperty("total")
  private int total;

  public List<Business> getBusinesses() {
    return businesses;
  }

  public int getTotal() {
    return total;
  }
}
