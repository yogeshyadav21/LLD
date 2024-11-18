package org.example.lld.elevator;

import org.example.lld.elevator.enums.Direction;
import org.example.lld.elevator.enums.Status;

import java.util.*;


//Elevator 2 Algorithms one is Look and the other one is Scan, we're using look
//algorithm here because it's efficient

public class ElevatorController {

    UUID elevatorControllerId;
    Elevator elevator;
    PriorityQueue<Integer> directionUp;
    PriorityQueue<Integer> directionDown;
    Queue<Integer> pendingQueue;

    public ElevatorController(UUID elevatorControllerId, Elevator elevator) {
        this.elevatorControllerId = elevatorControllerId;
        this.elevator = elevator;
        directionUp = new PriorityQueue<>(Comparator.naturalOrder());
        directionDown = new PriorityQueue<>(Comparator.reverseOrder());

        pendingQueue = new LinkedList<>();
    }

    public void submitRequest(int floorId, Direction direction){
        if(direction == elevator.display.getDirection()){
            switch(direction){
                case UP -> {
                    if(elevator.display.getFloor() >= floorId){
                        directionUp.add(floorId);
                    }
                    else{
                        pendingQueue.add(floorId);
                    }
                }
                case DOWN -> {
                    if(elevator.display.getFloor() <= floorId){
                        directionDown.add(floorId);
                    }
                    else{
                        pendingQueue.add(floorId);
                    }
                }
            }
        }
        else{
            switch (direction){
                case UP -> directionUp.add(floorId);
                case DOWN -> directionDown.add(floorId);
            }
        }
        if(elevator.status == Status.IDLE){
            this.moving();
        }
    }

    public void moving(){
        PriorityQueue<Integer> queue;
        switch (elevator.display.getDirection()){
            case UP -> {
                queue = directionUp;
            }
            case DOWN -> {
                queue = directionDown;
            }
            default -> queue = new PriorityQueue<>();
        }
        while(!queue.isEmpty()){
            int floorId = queue.poll();
            System.out.println("We've reached the " + floorId + " floor");
            elevator.display.setFloor(floorId);
        }


        // Look Algorithm

        if(queue == directionUp && (directionDown.isEmpty() == false || pendingQueue.isEmpty() == false)){
            while(!pendingQueue.isEmpty()){
                directionUp.add(pendingQueue.poll());
            }
            elevator.display.setDirection(Direction.DOWN);
        }
        else if(queue == directionDown && (directionUp.isEmpty() == false || pendingQueue.isEmpty() == false)){
            while(!pendingQueue.isEmpty()){
                directionDown.add(pendingQueue.poll());
            }
            elevator.display.setDirection(Direction.UP);
        }
        else{
            elevator.setStatus(Status.IDLE);
        }
    }

}
