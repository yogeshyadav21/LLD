package org.example.lld.elevator;

import org.example.lld.elevator.enums.Status;

import java.util.List;

public class Elevator {

    Status status;
    Display display;
    List<InternalButton> internalButton;

    public Elevator(Status status, Display display, List<InternalButton> internalButton) {
        this.status = status;
        this.display = display;
        this.internalButton = internalButton;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public List<InternalButton> getInternalButton() {
        return internalButton;
    }

    public void setInternalButton(List<InternalButton> internalButton) {
        this.internalButton = internalButton;
    }
}
