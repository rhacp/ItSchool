package session12_oop_polymorphism.challenges.fitness_center;

import session12_oop_polymorphism.challenges.fitness_center.models.Activity;
import session12_oop_polymorphism.challenges.fitness_center.models.Item;
import session12_oop_polymorphism.challenges.fitness_center.models.Member;
import session12_oop_polymorphism.challenges.fitness_center.models.MembershipTier;
import session12_oop_polymorphism.challenges.fitness_center.service.ItemService;
import session12_oop_polymorphism.challenges.fitness_center.service.MemberService;
import session12_oop_polymorphism.challenges.fitness_center.testInterface.*;



public class GymApp {

    public static void main(String[] args) {
        MemberService gymDB = new MemberService();
        ItemService itemService = new ItemService();

        Member kenny = gymDB.createMember("Kenny", MembershipTier.BASIC);
        gymDB.addMember(kenny);
        gymDB.printAllMembers();

        Activity fitnessForBoys = new Activity("Gym Bros");
        gymDB.bookClass(fitnessForBoys, kenny);

        Item frappe = new Item("Frappe", 21.98);
        itemService.buy(frappe, kenny);
        itemService.printLogs();
        System.out.println(kenny.getMembershipTier());
        gymDB.modifyMembership(kenny, "platinum");
        System.out.println(kenny.getMembershipTier());
        gymDB.renewalNotification(kenny);

        // testing here
        Item2 soda = new Drink();
        Item2 snack = new Snack();
        soda.use();

        // kenny.buy()

    }
}
