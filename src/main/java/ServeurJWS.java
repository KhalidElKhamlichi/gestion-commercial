import javax.xml.ws.Endpoint;
import service.GestionCommercialService;

public class ServeurJWS {

	public static void main(String[] args) {
		
		String url = "http://localhost:8585/";
		Endpoint.publish(url, new GestionCommercialService());
		System.out.println(url);

	}

}
