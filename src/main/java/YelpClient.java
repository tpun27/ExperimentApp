
import io.github.cdimascio.dotenv.Dotenv;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import org.glassfish.jersey.client.JerseyClient;
import org.glassfish.jersey.client.JerseyClientBuilder;

public class YelpClient {

  public static void main(String[] args) {
    JerseyClient client = JerseyClientBuilder.createClient();
    WebTarget webTarget = client.target("https://api.yelp.com/v3/businesses/search?location=nyc");
    Dotenv dotenv = Dotenv.load();
    String token = dotenv.get("YELP_BEARER_TOKEN");
    Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
    invocationBuilder.header("Authorization", "Bearer " + token);
    Businesses businesses = invocationBuilder.get(Businesses.class);
    for (Business business : businesses.getBusinesses()) {
      System.out.println(business.getName());
    }

    String businessId = businesses.getBusinesses().get(0).getId();
    webTarget = client.target("https://api.yelp.com/v3/businesses/" + businessId + "/reviews");
    invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
    invocationBuilder.header("Authorization", "Bearer " + token);
    Reviews reviews = invocationBuilder.get(Reviews.class);
    for (Review review : reviews.getReviews()) {
      System.out.println(review.getText());
    }
  }
}
