package RestfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PartialUpdateBooking {
    public static void main(String[] args) {
        RestAssured
                .given()
                    .baseUri("https://restful-booker.herokuapp.com/")
                    .basePath("booking/1")
                    .body("{\n" +
                            "    \"firstname\" : \"Amod\",\n" +
                            "    \"lastname\" : \"Mahajan\"\n" +
                            "}")
                    .contentType(ContentType.JSON)
                    .header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
                .when()
                    .patch()
                .then()
                    .statusCode(200)
                    .log().all()
                    .assertThat();














    }
}
