/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.armend.player;

import java.util.Scanner;

/**
 *
 * @author Armend
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Player initiator = new Player("Initiator");
        Player consumer = new Player("Consumer");

        Scanner input = new Scanner(System.in);

        initiator.registerListener(consumer);
        consumer.registerListener(initiator);

        int i = 0;
        final int LIMIT = 10;
        while (i < LIMIT) {
            String messageInput = "";
            System.out.println("\nType a message: ");
            messageInput = input.nextLine();
            
            if(messageInput == null || messageInput.isEmpty()) {
            continue;
            }
            
            i++;

            initiator.onPlayerMessageSend(messageInput, true);
        }

        System.out.printf("Chat is limited at %d messages", LIMIT);
    }
}
