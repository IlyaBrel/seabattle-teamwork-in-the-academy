package edu.javagroup.seabattle.model;

import edu.javagroup.seabattle.model.parent.ModelValue;
import lombok.Getter;

@Getter
public class PointElement extends ModelValue implements Comparable<PointElement> {

    private final int col;

    public PointElement(int col, int value) {
        super(value);
        this.col = col;
    }

    @Override
    public int compareTo(PointElement pointElement) {
        return col - pointElement.getCol();
    }
}
