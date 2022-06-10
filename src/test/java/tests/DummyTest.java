/*
 * Made with all the love in the world
 * by scireum in Remshalden, Germany
 *
 * Copyright by scireum GmbH
 * http://www.scireum.de - info@scireum.de
 */

package tests;

import client.AdminController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 */
public class DummyTest {

    @Test
    void test() {
        AdminController adminController = new AdminController();
        Assertions.assertEquals(8, adminController.test(3, 5), "Plus-Rechnung fehlgeschlagen");
        System.out.println("Test erfolgreich");
    }

}
