package org.itmo.lab3.story;


import org.itmo.lab3.object.Place;

import java.util.Objects;

public class Event {
    private String event;

    public Event(Actions action, Place where) {
        event = " " + action.getActionDescribe() + " на " + where.getName() + " ";
    }

    public String getEventDescribe() {
        return event;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;

        if (otherObject == null) return false;

        if (!this.getClass().equals(otherObject.getClass())) return false;

        Event other = (Event) otherObject;

        return Objects.equals(this.event, other.event);
    }

    @Override
    public int hashCode() {
        return Objects.hash(event);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "["
                + "event=" + event + "]";
    }
}