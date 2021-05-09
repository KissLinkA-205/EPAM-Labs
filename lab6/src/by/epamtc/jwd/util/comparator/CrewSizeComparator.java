package by.epamtc.jwd.util.comparator;

import by.epamtc.jwd.entity.plane.AbstractPlane;

import java.util.Comparator;

public class CrewSizeComparator implements Comparator<AbstractPlane> {

    @Override
    public int compare(AbstractPlane o1, AbstractPlane o2) {
        return o1.getCrewSize() - o2.getCrewSize();
    }
}
