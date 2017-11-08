package com.weather_viewer.functional_layer.structs.location;

import com.weather_viewer.functional_layer.structs.location.concrete_location.Country;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.InvocationTargetException;

public abstract class Location {
    private String location;

    public Location(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return location;
    }

    @Override
    public boolean equals(Object o) {
        return this == o || o instanceof Country && location.equals(((Location) o).location);

    }

    @Override
    public int hashCode() {
        return location.hashCode();
    }

    @Nullable
    public static <T extends Location> T newInstance(T location) {
        try {
            return (T) location.getClass().getConstructor(String.class).newInstance(location.toString());
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }

}