package fop.w7cal;

public class Calendar {

    EventList events;

    public Calendar(EventList events) {
        this.events = events;
    }

    public void addNewEvent(Event event) {
        if (events == null) events = new EventList(event);
        else events.add(event);
    }

    public Event[] eventsAt(int day) {
        if (events == null) return new Event[0];

        int count = 0;
        EventList currentEvent = events;
        while (currentEvent != null) {
            if (currentEvent.getEvent().diff(day) == 0) count++;
            currentEvent = currentEvent.getNext();
        }

        Event[] targetEvents = new Event[count];
        int index = 0;
        currentEvent = events;
        while (currentEvent != null) {
            if (currentEvent.getEvent().diff(day) == 0) {
                targetEvents[index] = currentEvent.getEvent();
                index++;
            }
            currentEvent = currentEvent.getNext();
        }

        return targetEvents;
    }

    public Event nextEvent(int day) {
        EventList currentEvent = events;
        while (currentEvent != null) {
            if (currentEvent.getEvent().diff(day) >= 0) return currentEvent.getEvent();
            currentEvent = currentEvent.getNext();
        }
        return null;
    }

}
