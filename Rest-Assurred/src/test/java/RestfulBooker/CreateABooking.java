package RestfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.Validatable;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateABooking {

    public static void main(String[] args) {

        //Build Request

       // RequestSpecification requestSpecification= RestAssured.given();
      //  RequestSpecification requestSpecification= RestAssured.given().log().all();

       // RestAssured.given().log().all().baseUri("https://restful-booker.herokuapp.com/");


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
                //Hit the REQUEST
                .post()
                //Validate the Response
                .then()
                .log()
                .all()
                .statusCode(200);


        //Hit Request

        // Response response= requestSpecification.post();

        //Validate Response

       //ValidatableResponse validatableResponse=  response.then().log().all();
      //  validatableResponse.statusCode(200);

    }
}
