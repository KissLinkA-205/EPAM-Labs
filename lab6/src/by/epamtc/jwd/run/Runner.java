package by.epamtc.jwd.run;

//todo Авиакомпания. Определить иерархию самолетов. Создать авиакомпанию.
//todo Посчитать общую вместимость и грузоподъемность. Провести сортировку самолетов
//todo компании на основе одного и нескольких параметров. Найти самолет в компании,
//todo соответствующий заданному диапазону параметров потребления горючего.

import by.epamtc.jwd.entity.Airline;
import by.epamtc.jwd.entity.plane.Freighter;
import by.epamtc.jwd.entity.plane.PassengerPlane;
import by.epamtc.jwd.exceptions.EmptyPlaneException;
import by.epamtc.jwd.logic.AirlineLogic;
import by.epamtc.jwd.service.search.SearchService;
import by.epamtc.jwd.service.search.impl.FuelConsumptionImpl;
import by.epamtc.jwd.util.PlaneComparatorBuilder;
import by.epamtc.jwd.util.comparator.MaxSpeedComparator;

public class Runner {
    public static void main(String[] args) throws EmptyPlaneException {
        
        Freighter f1 = new Freighter("model1", 300, 120,
                12, 45, 56);
        Freighter f2 = new Freighter("model2", 320, 160,
                11, 42, 43);
        Freighter f3 = new Freighter("model3", 280, 142,
                13, 39, 63);

        PassengerPlane p1 = new PassengerPlane("model4", 330, 150,
                8, 32, 100);
        PassengerPlane p2 = new PassengerPlane("model5", 400, 144,
                10, 36, 120);
        PassengerPlane p3 = new PassengerPlane("model6", 310, 132,
                9, 34, 110);

        Airline airline = new Airline();
        airline.addPlane(f1);
        airline.addPlane(f2);
        airline.addPlane(f3);

        airline.addPlane(p1);
        airline.addPlane(p2);
        airline.addPlane(p3);

        System.out.println(airline);

        AirlineLogic logic = new AirlineLogic();
        System.out.println("Total carrying capacity");
        System.out.println(logic.calculateTotalCarryingCapacity(airline));

        System.out.println("Total passenger seats");
        System.out.println(logic.calculateTotalPassengerSeats(airline));

        PlaneComparatorBuilder comparator = new PlaneComparatorBuilder(new MaxSpeedComparator());
        logic.sortPlanes(airline, comparator.build());
        System.out.println("Sort by MaxSpeed");
        System.out.println(airline);

        SearchService search = new FuelConsumptionImpl();
        System.out.println("Result of search");
        System.out.println(search.searchPlane(airline, 10, 12));
    }
}
