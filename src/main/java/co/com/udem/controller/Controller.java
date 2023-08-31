package co.com.udem.controller;

import co.com.udem.model.Lechuga;
import co.com.udem.model.Mora;
import co.com.udem.model.Plantaint;
import co.com.udem.model.Zanahoria;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<Plantaint> listaPlantas;

    public Controller(){
        listaPlantas = new ArrayList<>();
        listaPlantas.add(new Lechuga("Lechuga verde", "verde",1));
        listaPlantas.add(new Lechuga("Lechuga morada", "morado",1));
        listaPlantas.add(new Zanahoria("Danvers", "naranjado",3));
        listaPlantas.add(new Mora("Rubus caesius", "morado",6));

    }
    public static void main(String[] args) {
        Controller controller = new Controller();
    }
}
