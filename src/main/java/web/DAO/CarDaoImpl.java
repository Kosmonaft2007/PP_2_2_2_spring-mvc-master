package web.DAO;

import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    // прописываем ID в автоматическом режиме
//    private static int CAR_COUNT; //сначала она  = 0
    private List<Car> listOfCars;

    {
        listOfCars = new ArrayList<>();

        listOfCars.add(new Car("car1", "mod1", 11));
        listOfCars.add(new Car("car2", "mod2", 22));
        listOfCars.add(new Car("car3", "mod3", 33));
        listOfCars.add(new Car("car4", "mod4", 44));
        listOfCars.add(new Car("car5", "mod1", 55));
    }

    // возвращать список из машин
    @Override
    public List<Car> getCar(int id) {
        if (id > 5) {
            id = id - (id - 5);
        }
        List<Car> subList = listOfCars.subList(id, 5);
        listOfCars.removeAll(subList);

        return listOfCars;
    }

}
