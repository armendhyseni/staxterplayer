/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.armend.player;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Armend
 */
public class Player implements PlayerListener {

    private int messageReceiveTimes = 0;
    final private String title;

    List<PlayerListener> listenerList = new ArrayList<>();

    public Player(String title) {
        this.title = title;
    }

    public void registerListener(PlayerListener listener) {
        listenerList.add(listener);
    }

    @Override
    public void onPlayerMessageSend(String message, boolean isSender) {
        System.err.println("\nPlayer " + this.toString() + ", Send: " + message);
        this.listenerList.forEach((listener) -> {
            listener.onPlayerMessageRecieve(message, isSender);
        });
    }

    @Override
    public void onPlayerMessageRecieve(String message, boolean isSender) {
        if (isSender) {
            this.messageReceiveTimes++;
            this.listenerList.forEach((listener) -> {
                System.err.println("Player " + this.toString() + ", Received message: " + message + ", Sending back message: " + message + "" + this.messageReceiveTimes);
                listener.onPlayerMessageRecieve(message + this.messageReceiveTimes, false);
            });

        } else {
            System.err.println("Player " + this.toString() + ", Receive: " + message);
            System.err.println("\n------------------------\n");
        }
    }

    @Override
    public String toString() {
        return this.title;
    }

}
