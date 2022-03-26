package com.example.carsdb;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import Data.DatabaseHandler;
import Model.Car;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler databaseHandler = new DatabaseHandler(this);

//        databaseHandler.addCar(new Car("Toyota","30 000 $"));
//        databaseHandler.addCar(new Car("Opel","25 000 $"));
//        databaseHandler.addCar(new Car("Mercedes","50 000 $"));
//        databaseHandler.addCar(new Car("KIA","28 000 $"));
//        databaseHandler.addCar(new Car("Mazda","30 000 $"));
//        databaseHandler.addCar(new Car("Honda","25 000 $"));
//        databaseHandler.addCar(new Car("Skoda","50 000 $"));
//        databaseHandler.addCar(new Car("Hundai","28 000 $"));
//
//        List<Car> carList = databaseHandler.getAllCars();
//
//        for (Car car : carList) {
//            Log.d("CarInfo:", "ID " + car.getId() + ", name" + car.getName()
//            + ", price " + car.getPrice());
//        }

        Car car = databaseHandler.getCar(2);


        car.setName("Tesla");
        car.setPrice("50 000 $");

        int updateCarId = databaseHandler.updateCar(car);

        Log.d("CarInfo:", "ID " + car.getId() + ", name" + car.getName()
                + ", price " + car.getPrice() + ", updateCarId" + updateCarId);

    }
}