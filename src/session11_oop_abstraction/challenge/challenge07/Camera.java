package session11_oop_abstraction.challenge.challenge07;

import java.util.UUID;

public class Camera extends Device{

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceFunction() {
        return deviceFunction;
    }

    public void setDeviceFunction(String deviceFunction) {
        this.deviceFunction = deviceFunction;
    }

    public byte getBatteryPercentage() {
        return batteryPercentage;
    }

    public void setBatteryPercentage(byte batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }

    public byte getDeviceHealth() {
        return deviceHealth;
    }

    public void setDeviceHealth(byte deviceHealth) {
        this.deviceHealth = deviceHealth;
    }

    public UUID getDeviceId() {
        return deviceId;
    }

    public void setDeviceId() {
        this.deviceId = UUID.randomUUID();
    }
}
