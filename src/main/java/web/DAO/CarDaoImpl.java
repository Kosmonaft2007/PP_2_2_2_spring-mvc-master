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
//    public List<Car> index() {
//        return listOfCars;
//    }
    //вохвращаем одну машину по ID
//    public Car show(int id){
//        if (id == 0 || id > 5) {return (Car) listOfCars;}
//        return (Car) listOfCars.stream().limit(id).collect(Collectors.toList());
//    }
    @Override
    public List<Car> getCar(int quantity) {
        return listOfCars.stream().limit(quantity).collect(Collectors.toList());
    }

//    @Override
//    public List<Car> getCar(int id) {
//        if (id > 5) {
//            id = id - (id - 5);
//        }
//        List<Car> subList = listOfCars.subList(id, 5);
//        listOfCars.removeAll(subList);
//
//        return listOfCars;
//    }


    /* прописываем ID в ручную
    private List<Car> car;
    {
        car = new ArrayList<>();
        car.add(new Car(1, "car1"));
        car.add(new Car(2, "car2"));
        car.add(new Car(3, "car3"));
        car.add(new Car(4, "car4"));
        car.add(new Car(5, "car5"));
    }
*/
}
