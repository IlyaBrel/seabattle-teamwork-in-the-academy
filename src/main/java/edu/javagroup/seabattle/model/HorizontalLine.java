package edu.javagroup.seabattle.model;

import edu.javagroup.seabattle.model.parent.ModelRow;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class HorizontalLine extends ModelRow implements Comparable<HorizontalLine> {

    @Getter
    @Setter
    private List<PointElement> pointElementList;

    public HorizontalLine(char row) {
        super(row);
        List<PointElement> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(new PointElement(i, 0));
        }
        pointElementList = list;
    }

    @Override
    public int compareTo(HorizontalLine line) {
        return Character.compare(getRow(), line.getRow());
    }
}
