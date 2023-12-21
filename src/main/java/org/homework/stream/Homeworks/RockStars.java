package org.homework.stream.Homeworks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//  На основе массива рок-исполнителей создайте список из первых (по алфавиту) трех песен
public class RockStars {

    private String name;
    private String[] songs;

    public RockStars(String name, String[] songs) {
        this.name = name;
        this.songs = songs;
    }

    public String getName() {
        return name;
    }

    public String[] getSongs() {
        return songs;
    }

    @Override
    public String toString() {
        return "RockStars{" +
                "name='" + name + '\'' +
                ", songs=" + Arrays.toString(songs) +
                '}';
    }

    public static void main(String[] args) {
        RockStars rockStars1 = new RockStars("Prodigy",
                new String[]{"I got a poison", "New life", "Invisible Sun"});

        RockStars rockStars2 = new RockStars("Papa_Roch",
                new String[]{"Betwin Angels and I", "Last Result", "My Money"});

        RockStars rockStars3 = new RockStars("Marley Menson",
                new String[]{"We are the Noubodys", "Sweet Dremes", "Moment of Life"});

        RockStars[] rockStars = new RockStars[]{rockStars1, rockStars2, rockStars3};

        List<String> song = Arrays.stream(rockStars)
                .flatMap(n-> Arrays.stream(n.getSongs()))
                .sorted()
                .collect(Collectors.toList());

        System.out.println(song);

    }
}
