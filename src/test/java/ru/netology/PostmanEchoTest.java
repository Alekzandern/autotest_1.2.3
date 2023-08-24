package ru.netology;


import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class MobileBankApiTestV1 {
    @Test
    void shouldReturnDemoAccounts() {

        given()
                .baseUri("https://postman-echo.com")
                .body("Hi")

                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo("Hey"))
        ;
    }
}
