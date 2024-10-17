package protectionproxy;

public class NonOwnerProxy implements PersonBean {
    PersonBean person;

    public NonOwnerProxy(PersonBean person) {
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
        throw new IllegalAccessError("You can't change someone else's name!");
    }

    public void setGender(String gender) {
        throw new IllegalAccessError("You can't change someone else's gender!");
    }

    public void setInterests(String interests) {
        throw new IllegalAccessError("You can't change someone else's interests!");
    }

    public void setHotOrNotRating(int rating) {
        person.setHotOrNotRating(rating);
    }
}