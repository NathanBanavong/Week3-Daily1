package com.example.consultants.week3_daily1.fragment.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class PersonContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<Person> ITEMS = new ArrayList<Person>();

    private static void addItem(Person person) {
        ITEMS.add(person);
//        ITEM_MAP.put(person.Name, person);
    }

    private static Person createDummyItem(Person person) {
        return new Person(person.Name, person.Age, person.Gender);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class Person {
        public final String Name;
        public final String Age;
        public final String Gender;

        public Person(String Name, String Age, String Gender) {
            this.Name = Name;
            this.Age = Age;
            this.Gender = Gender;
        }

        @Override
        public String toString() {
            return "Name " + Name + "\nAge " + Age + "\nGender " + Gender;
        }
    }
}
