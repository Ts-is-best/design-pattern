package protectionproxy;

import java.util.HashMap;

public class MatchMakingTestDrive {
    HashMap<String, PersonBean> datingDB = new HashMap<String, PersonBean>();

    public static void main(String[] args) {
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }

    public MatchMakingTestDrive() {
        initializeDatabase();
    }

    public void drive() {
        PersonBean joe = getPersonFromDatabase("Joe Javabean");
        PersonBean ownerProxy = getOwnerProxy(joe);
        System.out.println("보호 프록시 테스트 (Owner)");
        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("bowling, Go");
        System.out.println("Interests set from owner proxy");
        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (IllegalAccessError e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());

        System.out.println("\n보호 프록시 테스트 (Non-Owner)");
        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name is " + nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("bowling, Go");
        } catch (IllegalAccessError e) {
            System.out.println(e.getMessage());
        }
        nonOwnerProxy.setHotOrNotRating(3);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
    }

    PersonBean getOwnerProxy(PersonBean person) {
        return new OwnerProxy(person);
    }

    PersonBean getNonOwnerProxy(PersonBean person) {
        return new NonOwnerProxy(person);
    }

    void initializeDatabase() {
        PersonBean joe = new PersonBeanImpl();
        joe.setName("Joe Javabean");
        joe.setInterests("cars, computers, music");
        joe.setHotOrNotRating(7);
        datingDB.put(joe.getName(), joe);

        PersonBean kelly = new PersonBeanImpl();
        kelly.setName("Kelly Klosure");
        kelly.setInterests("ebay, movies, music");
        kelly.setHotOrNotRating(6);
        datingDB.put(kelly.getName(), kelly);
    }

    PersonBean getPersonFromDatabase(String name) {
        return datingDB.get(name);
    }
}