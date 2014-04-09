package controllers;

import models.User;
import play.*;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("VW Academy",new User()));
    }
    
    public static Result login() {
        return ok(login.render());
    }
    
    public static Result cursos() {
        return ok(cursos.render("VW Academy",new User()));
    }
    
    public static Result seguridad() {
        return ok(seguridad.render("VW Academy",new User()));
    }
    
    public static Result role() {
        return ok(role.render("VW Academy",new User()));
    }
    
    public static Result users() {
        return ok(users.render("VW Academy",new User()));
    }
    
    public static Result calendarioAcademico() {
        return ok(calendarioacademico.render("VW Academy",new User()));
    }
    
    public static Result calendarioAdministrativo() {
        return ok(calendarioadministrativo.render("VW Academy",new User()));
    }
    
    public static Result encuesta() {
        return ok(encuesta.render("VW Academy",new User()));
    }
    
    public static Result examenes() {
        return ok(examenes.render("VW Academy",new User()));
    }
    
    public static Result indicadores() {
        return ok(indicadores.render("VW Academy",new User()));
    }
    
    public static Result moduloBase() {
        return ok(modulobase.render("VW Academy",new User()));
    }
    
    public static Result recursos() {
        return ok(recursos.render("VW Academy",new User()));
    }
    
    public static Result reportes() {
        return ok(reportes.render("VW Academy",new User()));
    }
    
    public static Result seguimiento() {
        return ok(seguimiento.render("VW Academy",new User()));
    }
    
    public static Result valoracion() {
        return ok(valoracion.render("VW Academy",new User()));
    }
    
}
