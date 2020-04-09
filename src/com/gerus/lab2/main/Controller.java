package com.gerus.lab2.main;

import java.net.URL;
import java.util.ResourceBundle;

import com.gerus.lab2.AllData;
import com.gerus.lab2.driver.Driver;
import com.gerus.lab2.cars.Car;
import com.gerus.lab2.cars.Tractor;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField SetName;

    @FXML
    private TextField SetNumOfDoors;

    @FXML
    private TextField SetVolume;

    @FXML
    private Label GetFuel;

    @FXML
    private Label GetEngineWeight;

    @FXML
    private Label GetWheelWeight;

    @FXML
    private Label GetTankWeight;

    @FXML
    private Button Drive;

    @FXML
    private TextField SetEquipment;

    @FXML
    private Button RemoveSnow;

    @FXML
    private TextField SetIndex;

    @FXML
    private Button CloseDoor;

    @FXML
    private Button OpenDoor;

    @FXML
    private Button InflateWheel;

    @FXML
    void initialize() {
        AllData all = AllData.getInstance();
        Drive.setOnAction(actionEvent -> {
            String name = SetName.getText();
            int numOfDoors = Integer.parseInt(SetNumOfDoors.getText());
            double volumeOfTank = Double.parseDouble(SetVolume.getText());
            //all.car = new Car(name, numOfDoors, volumeOfTank);
            if (AllData.getInstance().getCar() == null) {
                AllData.getInstance().setCar(new Car(name, numOfDoors, volumeOfTank));
            }
            all.getCar().drive();
            GetEngineWeight.setText(Double.toString(all.getCar().getEngine().getWeight()));
            GetTankWeight.setText(Double.toString(all.getCar().getTank().getWeight()));
            GetWheelWeight.setText(Double.toString(all.getCar().getWheels().get(0).getWeight()));
            GetFuel.setText(Double.toString(all.getCar().getTank().getValue()));
        });
        RemoveSnow.setOnAction(actionEvent -> {
            String equipment = SetEquipment.getText();
            String name = SetName.getText();
            int numOfDoors = Integer.parseInt(SetNumOfDoors.getText());
            double volumeOfTank = Double.parseDouble(SetVolume.getText());

            if (AllData.getInstance().getCar() == null) {
                AllData.getInstance().setCar(new Car(name, numOfDoors, volumeOfTank));
            }
            if (AllData.getInstance().getTractor() == null) {
                all.setTractor(new Tractor(equipment, name, numOfDoors, volumeOfTank));
            }
            all.getTractor().removeSnow();
        });
        InflateWheel.setOnAction(actionEvent -> {
            int index = Integer.parseInt(SetIndex.getText());

            String name = SetName.getText();
            int numOfDoors = Integer.parseInt(SetNumOfDoors.getText());
            double volumeOfTank = Double.parseDouble(SetVolume.getText());
            if (AllData.getInstance().getCar() == null) {
                AllData.getInstance().setCar(new Car(name, numOfDoors, volumeOfTank));
            }
            if (AllData.getInstance().getDriver() == null) {
                all.setDriver(new Driver(all.getCar()));
            }
            all.getDriver().putWheel(index);

        });
        OpenDoor.setOnAction(actionEvent -> {
            int index = Integer.parseInt(SetIndex.getText());

            String name = SetName.getText();
            int numOfDoors = Integer.parseInt(SetNumOfDoors.getText());
            double volumeOfTank = Double.parseDouble(SetVolume.getText());

            if (AllData.getInstance().getCar() == null) {
                AllData.getInstance().setCar(new Car(name, numOfDoors, volumeOfTank));
            }
            if (AllData.getInstance().getDriver() == null) {
                all.setDriver(new Driver(all.getCar()));
            }

            all.getDriver().manageCar(index, true);
        });

        CloseDoor.setOnAction(actionEvent -> {
            int index = Integer.parseInt(SetIndex.getText());

            String name = SetName.getText();
            int numOfDoors = Integer.parseInt(SetNumOfDoors.getText());
            double volumeOfTank = Double.parseDouble(SetVolume.getText());
            if (AllData.getInstance().getCar() == null) {
                AllData.getInstance().setCar(new Car(name, numOfDoors, volumeOfTank));
            }
            if (AllData.getInstance().getDriver() == null) {
                all.setDriver(new Driver(all.getCar()));
            }

            all.getDriver().manageCar(index, false);
        });


    }
}
