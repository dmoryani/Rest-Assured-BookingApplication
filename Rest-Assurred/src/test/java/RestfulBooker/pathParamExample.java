package RestfulBooker;

import io.restassured.RestAssured;

import java.util.HashMap;
import java.util.Map;

public class pathParamExample {

    public static void main(String[] args) {

        Map<String,Object> pathParamters = new HashMap<>();
        pathParamters.put("basePath","booking");
        pathParamters.put("bookingId",11);

        RestAssured
                .given()
                .log()
                .all()
                .baseUri("https://restful-booker.herokuapp.com/")
                .basePath("{basePath}/{bookingId}")
                .pathParams(pathParamters)
                //.pathParam("bookingId",11)

                .when()
                    //.get("https://restful-booker.herokuapp.com/{basePath}/{bookingId}","booking",2)
                .get()

                .then()
                    .log()
                    .all()
                .statusCode(200);


    }
}
