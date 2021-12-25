package RestfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import java.util.HashMap;
import java.util.Map;

public class DeleteBooking {

    public static void main(String[] args) {
        Map<String,Object> bookingId = new HashMap<>();
        bookingId.put("bookingId",5);


        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com/")
                .basePath("https://restful-booker.herokuapp.com/")
                .basePath("booking/{bookingId}")
                .pathParams(bookingId)
                .header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
                .contentType(ContentType.JSON)
                .log().all()

                .when()
                .delete()

                .then()
                .assertThat()
                .statusCode(201)
                .log()
                .all();




    }
}
