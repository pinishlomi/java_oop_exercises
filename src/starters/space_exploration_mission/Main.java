package starters.space_exploration_mission;

import starters.space_exploration_mission.comparators.*;
import starters.space_exploration_mission.enums.*;
import starters.space_exploration_mission.exceptions.*;
import starters.space_exploration_mission.models.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Space Exploration Mission Control System ---");

        System.out.println("\n--- 1. Demonstrating Constructor Exceptions ---");
//        try {
//            new Planet("Invalid Planet", -100, 100, true);
//        } catch (InvalidAttributeException e) {
//            System.out.println("Error creating Planet: " + e.getMessage());
//        }
//        try {
//            new Asteroid("Invalid Asteroid", 100, 100, -5);
//        } catch (InvalidAttributeException e) {
//            System.out.println("Error creating Asteroid: " + e.getMessage());
//        }
//        try {
//            new Astronaut("A000", "Too Young", 0, "Pilot");
//        } catch (InvalidAttributeException e) {
//            System.out.println("Error creating Astronaut: " + e.getMessage());
//        }
//        try {
//            new SpaceMission("M000", null, 10, null);
//        } catch (InvalidAttributeException e) {
//            System.out.println("Error creating Mission: " + e.getMessage());
//        }

        System.out.println("\n--- 2. Creating Valid Objects ---");
//        Planet mars = new Planet("Mars", 6.39e23, 225e6, true);
//        Planet earth = new Planet("Earth", 5.97e24, 0, true);
//        Asteroid ceres = new Asteroid("Ceres", 9.38e20, 413e6, 9.07);
//        Asteroid vesta = new Asteroid("Vesta", 2.59e20, 353e6, 5.34);
//
//        Astronaut neil = new Astronaut("AS001", "Neil Armstrong", 30, "Commander");
//        Astronaut buzz = new Astronaut("AS002", "Buzz Aldrin", 28, "Pilot");
//        Astronaut sally = new Astronaut("AS003", "Sally Ride", 25, "Scientist");
//
//        SpaceMission marsRover = new SpaceMission("MR001", mars, 687, neil);
//        SpaceMission asteroidSample = new SpaceMission("AS002", ceres, 500, buzz);
//        SpaceMission earthObservation = new SpaceMission("EO003", earth, 90, sally);
//
//        System.out.println(mars);
//        System.out.println(ceres);
//        System.out.println(neil);
//        System.out.println(marsRover);

        System.out.println("\n--- 3. Demonstrating Comparable (Celestial Body Natural Order) ---");
//        System.out.println("Mars vs Ceres (by Distance): " + mars.compareTo(ceres)); // Mars closer than Ceres
//        System.out.println("Ceres vs Vesta (by Distance): " + ceres.compareTo(vesta)); // Ceres further than Vesta
//        System.out.println("Earth vs Mars (by Distance): " + earth.compareTo(mars));   // Earth closer than Mars

        System.out.println("\n--- 4. Demonstrating Cloneable (Astronaut Cloning) ---");
//        try {
//            Astronaut clonedNeil = neil.clone();
//            System.out.println("Original Neil: " + neil);
//            System.out.println("Cloned Neil:   " + clonedNeil);
//            System.out.println("Are original and cloned the same object? " + (neil == clonedNeil)); // false
//            System.out.println("Are original and cloned equal (Object.equals)? " + (neil.equals(clonedNeil))); // false
//
//        } catch (CloneNotSupportedException e) {
//            System.out.println("Cloning failed: " + e.getMessage());
//        }

        System.out.println("\n--- 5. Demonstrating Launchable & Debriefable with Exceptions ---");
//        try {
//            marsRover.launch(); //  PLANNED -> ACTIVE
//            marsRover.launch(); //  already ACTIVE
//        } catch (MissionLaunchException e) {
//            System.out.println("Caught Launch Exception: " + e.getMessage());
//        }
//
//        try {
//            marsRover.debrief(); //is ACTIVE , should throw Exception
//        } catch (MissionDebriefException e) {
//            System.out.println("Caught Debrief Exception: " + e.getMessage());
//        }

//        System.out.println("Changing Mars Rover status to COMPLETED for debrief.");
//        marsRover.setStatus(MissionStatus.COMPLETED);
//        try {
//            marsRover.debrief(); // now should be working
//        } catch (MissionDebriefException e) {
//            System.out.println("Caught Debrief Exception: " + e.getMessage());
//        }

        System.out.println("\n--- 6. Demonstrating Comparator (Astronaut Custom Sorting) ---");
//        AstronautExperienceComparator devComp = new AstronautExperienceComparator();
//        System.out.println("Neil vs Buzz (Exp): " + devComp.compare(neil, buzz)); // Neil (30) vs Buzz (28) -> Neil comes before
//        System.out.println("Neil vs Sally (Exp): " + devComp.compare(neil, sally)); // Neil (30) vs Sally (25) -> Neil comes before
//        System.out.println("Buzz vs Sally (Exp): " + devComp.compare(buzz, sally)); // Buzz (28) vs Sally (25) -> Buzz comes before
//        System.out.println("Neil vs Sally (Exp): " + devComp.compare(neil, sally)); // Neil (30) vs Sally (25) -> Neil comes before
//        System.out.println("Sally vs Buzz (Exp): " + devComp.compare(sally, buzz)); // Sally (25) vs Buzz (28) -> Sally comes after

        System.out.println("\n--- 7. Demonstrating Comparator (Mission Status Sorting) ---");
//        MissionStatusComparator statusComp = new MissionStatusComparator();
//
//        earthObservation.setStatus(MissionStatus.PLANNED);
//        asteroidSample.setStatus(MissionStatus.ACTIVE);
        // marsRover already COMPLETED

//        System.out.println("Earth Obs. (PLANNED) vs Asteroid Sample (ACTIVE): " + statusComp.compare(earthObservation, asteroidSample));
//        System.out.println("Asteroid Sample (ACTIVE) vs Mars Rover (COMPLETED): " + statusComp.compare(asteroidSample, marsRover));
//        System.out.println("Earth Obs. (PLANNED) vs Mars Rover (COMPLETED): " + statusComp.compare(earthObservation, marsRover));

        System.out.println("\n--- Describing Celestial Bodies ---");
//        mars.describe();
//        ceres.describe();
    }
}
