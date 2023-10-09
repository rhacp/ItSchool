package session11_oop_abstraction.challenge.challenge07;

import java.util.UUID;

public class Light extends Device{

    /***
     * @deviceState
     * Boolean:
     * 1 - lights on
     * 0 - lights off
     */
    private boolean deviceState;
    private byte lightsLevel;

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

    public boolean getDeviceState() {
        return deviceState;
    }

    public void setDeviceState(boolean deviceState) {
        this.deviceState = deviceState;
    }

    public byte getLightsLevel() {
        return lightsLevel;
    }

    public void setLightsLevel(byte lightsLevel) {
        this.lightsLevel = lightsLevel;
    }
}
