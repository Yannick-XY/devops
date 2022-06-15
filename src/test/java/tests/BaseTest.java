package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import sirius.biz.tenants.TenantsHelper;
import sirius.kernel.SiriusExtension;
import sirius.web.http.TestRequest;
import sirius.web.http.TestResponse;

/**
 * Tests that check availability of the service and login-ability.
 * Accessibility to restricted pages is tested by setting up a testTenant and a testUser with specific permissions.
 * These tests can only be run locally because of sirius-kernel issues during workflow/job "test" on GitHub.
 */

@Tag("local")
@ExtendWith(SiriusExtension.class)
class BaseTest {

    @Test
    void checkAvailability() {
        TestResponse testResponse = TestRequest.GET("/").execute();
        Assertions.assertEquals(200, testResponse.getStatus().code());
    }

    @Test
    void checkTitle() {
        TestResponse testResponse = TestRequest.GET("/").execute();
        Assertions.assertEquals("Anmeldung - devops",
                                testResponse.getContentAsString()
                                            .substring(testResponse.getContentAsString().indexOf("<title>") + 7,
                                                       testResponse.getContentAsString().indexOf("</title>")));
    }

    @Test
    void checkLogin() {
        TenantsHelper.installTestTenant();
        TestRequest testRequest = TestRequest.GET("/system/sql");
        TestResponse testResponse = testRequest.execute();
        Assertions.assertEquals(200, testResponse.getStatus().code());
        Assertions.assertEquals("SQL - devops",
                                testResponse.getContentAsString()
                                            .substring(testResponse.getContentAsString().indexOf("<title>") + 7,
                                                       testResponse.getContentAsString().indexOf("</title>")));
    }
}