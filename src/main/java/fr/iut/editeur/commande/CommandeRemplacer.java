package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

import static java.lang.Integer.parseInt;


public class CommandeRemplacer extends CommandeDocument {


    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 4) {
            System.err.println("Format attendu : remplacer;depart;fin;chaine");
            return;
        }
        int depart = parseInt(parameters[1]);
        int fin = parseInt(parameters[2]);
        String texte = parameters[3];
        this.document.remplacer(depart,fin,texte);
        super.executer();
    }

}

