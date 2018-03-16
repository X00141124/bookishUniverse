package controllers;

import play.mvc.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.*;
import javax.inject.Inject;

import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;
import java.io.File;

import org.im4java.core.ConvertCmd;
import org.im4java.core.IMOperation;

import models.*;
import models.users.*;
import views.html.*;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    private FormFactory formFactory;
    private Environment e;
    
        @Inject
        public HomeController(FormFactory f,Environment env) {
            this.formFactory = f;
            this.e = env;
        }
    


        public Result addUser() {
            Form<User> userForm = formFactory.form(User.class);
            List<String> roleList = User.options();
            return ok(addUser.render(userForm, User.getUserById(session().get("email")), roleList));
        }
        public Result addUserSubmit() {
            User newUser;
            Form<User> newUserForm = formFactory.form(User.class).bindFromRequest();

            if (newUserForm.hasErrors()){
                List<String> roleList = User.options();
                return badRequest(addUser.render(newUserForm, User.getUserById(session().get("email")), roleList));
            }
            else {
                newUser = newUserForm.get();
                newUser.save();
            }
            flash("success", "User " + newUser.getName() + " has been created");

            return redirect(controllers.routes.HomeController.usersPage());
        }

        @Security.Authenticated(Secured.class)
        @With(AuthAdmin.class)
        public Result usersPage() {
            List<User> userList = User.findAll();
            return ok(usersPage.render(userList, User.getUserById(session().get("email"))));
        }

}