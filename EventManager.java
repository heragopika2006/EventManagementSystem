import java.util.ArrayList;

public class EventManager {
    private ArrayList<Event> eventList = new ArrayList<>();

    public void addEvent(Event event) {
        eventList.add(event);
        System.out.println("Event Added Successfully!");
    }

    public void viewEvents() {
        if (eventList.isEmpty()) {
            System.out.println("No Events Available!");
        } else {
            for (Event event : eventList) {
                event.displayEvent();
            }
        }
    }

    public void deleteEvent(int id) {
        eventList.removeIf(event -> event.getId() == id);
        System.out.println("Event Deleted (if ID existed).");
    }

    public void updateEvent(int id, String name, String date, String location) {
        for (Event event : eventList) {
            if (event.getId() == id) {
                event.setName(name);
                event.setDate(date);
                event.setLocation(location);
                System.out.println("Event Updated Successfully!");
                return;
            }
        }
        System.out.println("Event Not Found!");
    }
}