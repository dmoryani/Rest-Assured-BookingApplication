package RestfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class bddFormat {

    public static void main(String[] args) {
        //Given - Build Request
        //When - Hit
        //Then - Validate

        RestAssured
                .given()
                         .log()
                         .all()
                        .baseUri("https://restful-booker.herokuapp.com/")
                        .basePath("booking")
                        .body("{\n" +
                        "\n" +
                        "\"firstname\" : \"Divya\",\n" +
                        "    \"lastname\" : \"Moryani\",\n" +
                        "    \"totalprice\" : 111,\n" +
                        "    \"depositpaid\" : true,\n" +
                        "    \"bookingdates\" : {\n" +
                        "        \"checkin\" : \"2018-01-01\",\n" +
                        "        \"checkout\" : \"2019-01-01\"\n" +
                        "    },\n" +
                        "    \"additionalneeds\" : \"Breakfast\"\n" +
                        "}")
                        .contentType(ContentType.JSON)

                .when()
                    .post()


                .then()
                    .log()
                    .all()
                    .statusCode(200);



    }
}
