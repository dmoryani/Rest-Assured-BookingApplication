package RestfulBooker;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetBooking {

    //Given
    //When
    //Then
    public static void main(String[] args) {
        //RequestSpecification requestSpecification = RestAssured.given().log().all();
        //RestAssured.given().log().all().baseUri("https://restful-booker.herokuapp.com/");
        RestAssured
                .given()
                    .log()
                    .all()
                    .baseUri("https://restful-booker.herokuapp.com/")
                    .basePath("booking/{id}")
                     .pathParam("id" ,20)
                .when()
                     .get()
                .then()
                    .log().all()
                    .statusCode(200);

        //When
        //Response response = requestSpecification.get();

        //ValidatableResponse validatableResponse = response.then().log().all();
       // validatableResponse.statusCode(200);



    }
}
