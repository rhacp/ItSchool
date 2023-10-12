package session12_oop_polymorphism.challenges.fitness_center;

import session12_oop_polymorphism.challenges.fitness_center.models.FitnessClass;
import session12_oop_polymorphism.challenges.fitness_center.models.Member;
import session12_oop_polymorphism.challenges.fitness_center.models.MembershipTier;
import session12_oop_polymorphism.challenges.fitness_center.models.PersonalDetails;

import java.time.LocalDateTime;
import java.util.UUID;

import static session12_oop_polymorphism.challenges.fitness_center.services.BookingServices.checkAvailability;
import static session12_oop_polymorphism.challenges.fitness_center.services.BookingServices.createBooking;

public class GymApp {

    public static void main(String[] args) {
        PersonalDetails markDetails = new PersonalDetails("Mark", "Blue");
        PersonalDetails susanDetails = new PersonalDetails("Susan", "White");

        Member mark = new Member(UUID.randomUUID(), markDetails, MembershipTier.BASIC);
        Member susan = new Member(UUID.randomUUID(), susanDetails, MembershipTier.BASIC);

        FitnessClass legDay = new FitnessClass();
        legDay.setClassName("Leg Day");
        legDay.setClassDate(LocalDateTime.of(2023, 10, 15, 11, 0));
        createBooking(legDay, mark);
        createBooking(legDay, susan);
        checkAvailability(legDay);

    }
}
