/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Euceda
 */
public class Item implements Comparable<Item> {

    private int weight;
    private int cash;
    private double benefit;

    public Item(int weight, int cash) {
        this.weight = weight;
        this.cash = cash;
        this.benefit = cash / weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public double getBenefit() {
        return benefit;
    }

    public void setBenefit(double benefit) {
        this.benefit = benefit;
    }

    @Override
    public String toString() {
        return "Item{" + "weight=" + weight + ", cash=" + cash + ", benefit=" + benefit + '}';
    }

    @Override
    public int compareTo(Item o) {
        if (benefit > o.benefit) {
            return -1;
        }
        if (benefit < o.benefit) {
            return 1;
        }
        return 0;
    }

}
