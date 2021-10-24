import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Reviews {
  @JsonProperty("reviews")
  private List<Review> reviews;

  @JsonProperty("total")
  private int total;

  public List<Review> getReviews() {
    return reviews;
  }

  public int getTotal() {
    return total;
  }
}
