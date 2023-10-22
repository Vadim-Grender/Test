import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.InstanceOfAssertFactories.MATCHER;
public class TestAll {

    // - проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
    @Test
    void checkObjectCarIsInstanceOfVehile(){
        Car honda= new Car("Honda", "Civic", 2000);
        assertThat(honda).isInstanceOf(Vehicle.class);

    }

    // - проверка того, объект Car создается с 4-мя колесами
    @Test
    void checkObjectCarHaveFourWheels(){
        Car lada = new Car("LADA", "Vesta", 2017);
        assertThat(lada.getNumWheels()).isEqualTo(4);

    }

    // - проверка того, объект Motorcycle создается с 2-мя колесами
    @Test
    void checkObjectMotorcycleHaveTwoWheels(){
        Motorcycle yamaha = new Motorcycle("Yamaha", "XVS", 1999);
        assertThat(yamaha.getNumWheels()).isEqualTo(2);
    }

    // - проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    @Test
    void checkObjectCarCanAccelerateTo60kmhInTestDrive(){
        Car chevrolet = new Car("Chevrolet", "Tahoe", 2014);
        chevrolet.testDrive();
        assertThat(chevrolet.getSpeed()).isEqualTo(60);

    }

    // - проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    @Test
    void checkObjectMotorcyclerCanAccelerateTo75kmhInTestDrive(){
        Motorcycle bmw = new Motorcycle("BMW", "Trtrtr", 2019);
        bmw.testDrive();
        assertThat(bmw.getSpeed()).isEqualTo(75);
    }

    // - проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)
    @Test
    void checkObjectCarHaveZeroSpeedInParckingMode(){
        Car moskvich = new Car("Moskvich", "3", 2023);
        moskvich.testDrive();
        moskvich.park();
        assertThat(moskvich.getSpeed()).isEqualTo(0);

    }

    // - проверить, что в режиме парковки (сначала testDrive, потом park т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
    @Test
    void checkObjectMotorcycleHaveZeroSpeedInParckingMode(){
        Motorcycle suzuki = new Motorcycle("Suzuki", "Bandit", 2006);
        suzuki.testDrive();
        suzuki.park();
        assertThat(suzuki.getSpeed()).isEqualTo(0);

    }

}