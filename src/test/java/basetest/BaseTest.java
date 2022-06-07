package basetest;

import client.AdminController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sirius.kernel.BaseSpecification;
import sirius.web.http.TestRequest;
import sirius.web.http.TestResponse;

public class BaseTest {

    @Test
    public void checkAvailability(){
        TestResponse testResponse = TestRequest.GET("/").execute();
        Assertions.assertEquals(200, testResponse.getStatus().code());
        Assertions.assertEquals("devops - devops", testResponse.getContentAsXML().getNode("//title").getNode().getTextContent());
    }
}
