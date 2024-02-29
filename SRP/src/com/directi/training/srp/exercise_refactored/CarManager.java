package com.directi.training.srp.exercise_refactored;

public class CarManager {
    final private CarRepository carRepository = new CarRepository();

    public String getCarsNames() {
        StringBuilder sb = new StringBuilder();
        for (Car car : carRepository.getAll()) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    public Car getBestCar() {
        Car bestCar = null;
        for (Car car : carRepository.getAll()) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
