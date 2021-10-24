import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
  @JsonProperty("id")
  private String id;

  @JsonProperty("profile_url")
  private String profileUrl;

  @JsonProperty("image_url")
  private String imageUrl;

  @JsonProperty("name")
  private String name;

  public String getId() {
    return id;
  }

  public String getProfileUrl() {
    return profileUrl;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public String getName() {
    return name;
  }
}
