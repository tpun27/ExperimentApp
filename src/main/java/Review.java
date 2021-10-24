import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Instant;

public class Review {
  @JsonProperty("id")
  private String id;

  @JsonProperty("url")
  private String url;

  @JsonProperty("text")
  private String text;

  @JsonProperty("rating")
  private int rating;

  @JsonProperty("time_created")
  private String timeCreated;

  @JsonProperty("user")
  private User user;

  public String getId() {
    return id;
  }

  public String getUrl() {
    return url;
  }

  public String getText() {
    return text;
  }

  public int getRating() {
    return rating;
  }

  public String getTimeCreated() {
    return timeCreated;
  }

  public User getUser() {
    return user;
  }
}
