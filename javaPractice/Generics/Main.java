package edu.umass;

public class Main {

    public static void main(String[] args) {

        Park grandCanyon = new Park("Grand Canyon National Park", "36.0617143,-112.1077182");
        Park yellowstone = new Park("Yellowstone National Park", "44.4279644,-110.5884641");

        River colorado = new River("Colorado River",
                "36.0617143,-112.1077182",
                "34.9,-114.2",
                "32.7,-114.6");

        River mississippi = new River("Mississippi River",
                "47.2,-95.2",
                "38.6,-90.2",
                "29.9,-89.9");

        Park[] parks = {grandCanyon, yellowstone};
        River[] rivers = {colorado, mississippi};

        Layer<Park> parkLayer = new Layer<>(parks);
        Layer<River> riverLayer = new Layer<>(rivers);

        parkLayer.renderLayer();
        riverLayer.renderLayer();
    }
}
