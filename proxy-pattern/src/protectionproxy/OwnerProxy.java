package protectionproxy;

public class OwnerProxy implements PersonBean {
    PersonBean person;

    public OwnerProxy(PersonBean person) {
        this.person = person;
    }

    public String getName() {
        return person.getName();
    }

    public String getGender() {
        return person.getGender();
    }

    public String getInterests() {
        return person.getInterests();
    }

    public int getHotOrNotRating() {
        return person.getHotOrNotRating();
    }

    public void setName(String name) {
        person.setName(name);
    }

    public void setGender(String gender) {
        person.setGender(gender);
    }

    public void setInterests(String interests) {
        person.setInterests(interests);
    }

    public void setHotOrNotRating(int rating) {
        throw new IllegalAccessError("You can't rate yourself!");
    }
}