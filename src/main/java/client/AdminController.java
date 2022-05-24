package client;

import sirius.biz.web.BizController;
import sirius.kernel.di.std.Register;
import sirius.web.controller.Routed;
import sirius.web.http.WebContext;
import sirius.web.security.LoginRequired;

import javax.annotation.Nonnull;

/**
 * Provides a route to visit the backend page
 */
@Register
public class AdminController extends BizController {

    /**
     * Simple route that calls the pasta template containing the name chooser.
     *
     * @param webContext the context of the web request
     */
    @LoginRequired
    @Routed("/admin")
    public void admin(@Nonnull WebContext webContext) {

        webContext.respondWith().template("/templates/admin.html.pasta");
    }


    public int test(int a, int b) {
        return a + b;
    }
}
