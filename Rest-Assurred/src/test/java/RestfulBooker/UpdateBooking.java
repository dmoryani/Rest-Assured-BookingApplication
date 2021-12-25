package RestfulBooker;

import io.restassured.RestAssured;

public class UpdateBooking {

    public static void main(String[] args) {
        RestAssured
                .given()
                    .baseUri("https://restful-booker.herokuapp.com/")
                    .basePath("booking/1")
                    .log().all()
                    .header("Content-Type","application/json")
                    .header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
                    .body("{\n" +
                        "\n" +
                        "\"firstname\" : \"kuku\",\n" +
                        "    \"lastname\" : \"Bakhtani\",\n" +
                        "    \"totalprice\" : 1103,\n" +
                        "    \"depositpaid\" : true,\n" +
                        "    \"bookingdates\" : {\n" +
                        "        \"checkin\" : \"2018-10-01\",\n" +
                        "        \"checkout\" : \"2018-15-01\"\n" +
                        "    },\n" +
                        "    \"additionalneeds\" : \"Dinner\"\n" +
                        "}")
                .when()
                    .put()
                .then()
                .statusCode(200)
                .log().all()
                .assertThat();




    }
}
