//package com.redhat.demo;
//
//import io.quarkus.test.junit.QuarkusTest;
//import io.quarkus.test.keycloak.client.KeycloakTestClient;
//import io.restassured.RestAssured;
//import org.junit.jupiter.api.Test;
//
//@QuarkusTest
//public class PolicyEnforcerTest {
//    static {
//        RestAssured.useRelaxedHTTPSValidation();
//    }
//
//    KeycloakTestClient keycloakClient = new KeycloakTestClient();
//
//    @Test
//    public void testAccessAdminResource() {
//        RestAssured.given().auth().oauth2(getAccessToken("demo-admin"))
//                .when().get("/hello/admin")
//                .then()
//                .statusCode(200);
//    }
//
//    @Test
//    public void testPublicResource() {
//        RestAssured.given()
//                .when().get("/hello")
//                .then()
//                .statusCode(200);
//    }
//
//    private String getAccessToken(String userName) {
//        return keycloakClient.getAccessToken(userName);
//    }
//}
