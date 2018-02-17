package com.mcndsj.GameEvent.Events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Created by Matthew on 2016/5/21.
 */
public final class   GameStartEvent extends Event{
    private static final HandlerList handlers = new HandlerList();

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
