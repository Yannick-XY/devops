package tests;

import client.AdminController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * A dummy test was created since the framework required for functional tests doesn't start during workflow/job "build" & "test" on GitHub.
 */
class DummyTest {

    @Test
    void test() {
        AdminController adminController = new AdminController();
        Assertions.assertEquals(8, adminController.test(3, 5), "Test failed");
        System.out.println("Test successful");
    }
}
