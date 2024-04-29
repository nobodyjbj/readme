package me.nobody.designpattern.creational.abstractfactory;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Phone {

    private Camera camera;

    private Display display;

    @Override
    public String toString() {
        return "Phone{" +
                "camera='" + camera + '\'' +
                ", display='" + display + '\'' +
                '}';
    }
}
