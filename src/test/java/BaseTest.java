import client.AdminController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 */
class BaseTest {

    @Test
    void test(){
        AdminController adminController = new AdminController();
        int result = adminController.test(2,5);
        Assertions.assertEquals(7, result);
    }
}
