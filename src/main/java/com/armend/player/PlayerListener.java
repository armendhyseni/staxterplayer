/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.armend.player;

/**
 *
 * @author Armend
 */
public interface PlayerListener {
  public void onPlayerMessageSend(String messagem, boolean isSender);
  public void onPlayerMessageRecieve(String message, boolean isSender);
}
