import {Bike} from './interfaceDemo';

class Pulsar implements Bike {
    public speed(): void {
        console.log("90km/hr")
    }
}
class Honda implements Bike {
    public speed() : void {
        console.log("55km/hr")
    }
}
let pu = new Pulsar();
let ho = new Honda();
pu.speed();
ho.speed();