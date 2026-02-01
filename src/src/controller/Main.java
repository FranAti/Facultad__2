package src.controller;
import src.model.*;

public class Main {
    public static void main(String[] args) {
        Profesores a = new Profesores("Fran","Atienza","78292409H", Est_civ.SOLTERO,1,"22/10/2009",Dept.MATEMATICAS);
        System.out.println(a.toString());
    }
}
