/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dojo;

import java.util.ArrayList;

class Order {

    private String owner;
    private String target;
    private ArrayList<String> cocktails = new ArrayList<String>();
    private String message;

    void declareOwner(String roméo) {
        this.owner = roméo;

    }

    void declareTarget(String juliette) {
        this.target = juliette;
    }

    void declareMessage(String message) {
        this.message = message;
    }

    String readMessage() {
        return "From " + this.owner + " to " + this.target + ": " + this.message;
    }

    ArrayList<String> getCocktails() {
        return this.cocktails;
    }

    void addCocktails(int nombre) {
        for (int j = 0; j < nombre; j++) {
            this.cocktails.add(j, "cocktail" + j);
        }
    }

}
