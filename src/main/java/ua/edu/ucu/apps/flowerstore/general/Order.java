package ua.edu.ucu.apps.flowerstore.general;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.edu.ucu.apps.flowerstore.user.MyUser;

import java.util.List;

@Getter @Setter @NoArgsConstructor
public class Order {
    List<MyUser> users;
    public void addUser(MyUser user) {
        users.add(user);
    }
    public void removeUser(MyUser user) {
        users.remove(user);
    }
    public void notifyUser(MyUser user) {
//        send message to user
    }
    private List<Item> order;
    public void addItem(Item item) {
        order.add(item);
    }

    @Override
    public String toString() {
        return "Order{" +
                "order=" + order.toString() +
                '}';
    }
}
