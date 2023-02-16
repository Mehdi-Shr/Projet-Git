package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

import static java.lang.Integer.parseInt;


public class CommandeEffacer extends CommandeDocument {


    public CommandeEffacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : effacer;depart;fin");
            return;
        }
        int depart = parseInt(parameters[1]);
        int fin = parseInt(parameters[2]);
        this.document.effacer(depart,fin);
        super.executer();
    }

}

